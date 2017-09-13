package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*实现重定向*/
public class BServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*1.设置Location
  2.发送302
* */
        System.out.println("BServlet");
            //这里第二个参数是请求url，通过web.xml配置了
        response.setHeader("Location", "/day_03_response/CServlet");
        response.setStatus(302);
    }
}
