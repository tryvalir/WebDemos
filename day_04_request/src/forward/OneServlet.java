package forward;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/9/11.
 */
public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("xx","XX");
//        response.setCharacterEncoding("utf-8");
//        response.setCharacterEncoding("gbk");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("转发的servlet没有留下的输出流（响应体）");
//        for(int i=1;i<1024*24+1;i++) {
//            response.getWriter().print("a");
//        }
        request.setAttribute("username","zhangsan");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/TwoServlet");
        requestDispatcher.forward(request,response);
        System.out.println("hello,servletOne");
    }
}
