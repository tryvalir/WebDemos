package servlet;
import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by Administrator on 2017/8/31.
 */
public class AServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init方法启动啦啦啦啦");
        //获取初始化参数值
        System.out.println(servletConfig.getInitParameter("p1"));
        System.out.println(servletConfig.getInitParameter("p2"));
        //获取初始化参数
        Enumeration enumeration=servletConfig.getInitParameterNames();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }

    @Override
    public ServletConfig getServletConfig() {

        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=utf-8");
        servletResponse.getWriter().print("AServlet响应内容");
        System.out.println("service方法启动。。。。。");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy方法启动！！！！");
    }
}
