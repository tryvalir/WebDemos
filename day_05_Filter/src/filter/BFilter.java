package filter;

import javax.servlet.*;
import java.io.IOException;


public class BFilter implements javax.servlet.Filter {
    public void destroy() {

        System.out.println("BBBB销毁了销毁了");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("BBB拦截到了拦截到了");
        chain.doFilter(req, resp);
        System.out.println("BBB放行过后拦截器的输出");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("BBB启动了启动了");
    }

}
