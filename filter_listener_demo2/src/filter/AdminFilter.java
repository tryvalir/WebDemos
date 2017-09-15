package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by tryvalir on 2017/9/14.
 */
public class AdminFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        String role=(String)request.getSession().getAttribute("role");
        if(role=="admin"){
        chain.doFilter(req, resp);
        return;
        }
        else{
            req.setAttribute("msg","您不是admin，重新登录");
            request.getRequestDispatcher("/login.jsp").forward(req,resp);
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
