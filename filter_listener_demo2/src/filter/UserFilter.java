package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by tryvalir on 2017/9/14.
 */
public class UserFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        if (request.getSession().getAttribute("role")!=null){
        chain.doFilter(req, resp);
            return;
        }
        request.setAttribute("msg","还没登陆呢，您现在是个游客");
        request.getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
