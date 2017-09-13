package forward;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class TwoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("yy", "YY");

        response.getWriter().print("转发到的servlet的响应体输出为此语句!");
        System.out.println("hello,servletTwo");
        System.out.println(request.getAttribute("username"));
    }
}
