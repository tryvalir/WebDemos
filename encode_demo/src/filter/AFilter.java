package filter;

import request.EncodingRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by tryvalir on 2017/9/15.
 */
public class AFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        if(request.getMethod().equals("POST")){
            request.setCharacterEncoding("utf-8");
            chain.doFilter(req, resp);
        }
        if (request.getMethod().equals("GET")) {
            EncodingRequest encodingRequest = new EncodingRequest(request);
            chain.doFilter(encodingRequest, resp);

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
