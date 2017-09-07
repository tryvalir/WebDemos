package servlet;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by Administrator on 2017/9/1.
 */
public class MyGenericServlet implements Servlet {
    private ServletConfig servletConfig;

    @Override
    /*有tomcat调用，只会调用一次，
    是这些方法中第一个被调用的，servlet构造器之后就马上被调用
    * */
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
       /*这里是为了这个类的子类也可以自己复写init方法，如果直接放任用户复写原init方法，
       那么servletConfig就没法得到传入，那么只要是service中对于servletConfig的操作就会空指针异常，
       那么如何实现既能复写init方法，实现自定义的servlet初始操作,还能实现最基本的tomcat读取servletConfig呢？
       实现：通过再重载来实现，再建一个方法，传参与原想保留的方法不同，然后在init方法中调用这个负载方法
       就可以实现留给子类自定义init方法的权利，又可以保证原init方法的完整安全性
       */
        init();
    }

    /*留给子类来实现自定义init方法*/
    public void init() {
    }

    @Override
    public ServletConfig getServletConfig() {
        //return new ServletConfig!!
//     ！！这里new不出来，因为ServletConfig是接口，要服务端提供类，实现就是用init中传入的serlvetConfig实现类
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    //这里实现一下servlet的方法，几乎不调用的方法，这样子类就可以不用必须实现这个方法了
    public String getServletInfo() {
        return "";
    }

    @Override

    public void destroy() {
        System.out.println("啊~~我要死了");
    }

    //此类提供的比接口更多的扩展方法
    public ServletContext getServletContext() {
        return this.servletConfig.getServletContext();
    }

    public String getInitParameter(String name) {
        return this.servletConfig.getInitParameter(name);



    }
}
