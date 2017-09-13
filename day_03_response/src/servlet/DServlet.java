package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*实现重定向*/
public class DServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*定时重定向到另一个页面
* */
        response.getWriter().print("欢迎XXX登陆！5秒钟后转到EServlet...,这里目前是乱码，你看不清");
            //这里第二个参数是请求url，通过web.xml配置了
        response.setHeader("Refresh", "5；URL=/day_03_response/EServlet");
    }
}
