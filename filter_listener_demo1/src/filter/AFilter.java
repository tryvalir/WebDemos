package filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

/**
 * Created by tryvalir on 2017/9/14.
 * 1.从application中获取map
 * 2.从request中读取ip
 * 3.存到map中
 */

public class AFilter implements Filter {
    private FilterConfig servletConfig;

    public void destroy() {
        System.out.println("服务器关闭，AFilter消亡");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ServletContext application = servletConfig.getServletContext();
        Map<String, Integer> map = (Map<String, Integer>) application.getAttribute("map");
        String ip = req.getRemoteAddr();
        if (map.containsKey(ip))
        {
            map.put(ip, map.get(ip) + 1);
        }
        else{
            map.put(ip, 1);
        }
        application.setAttribute("map",map);
        chain.doFilter(req, resp);
    }
    public void init(FilterConfig config) throws ServletException {
        this.servletConfig=config;
    }

}
