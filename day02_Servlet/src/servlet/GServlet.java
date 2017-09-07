package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 * Created by Administrator on 2017/9/7.
 */
public class GServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = this.getServletContext().getRealPath("/index.jsp");
        System.out.println(path);

        InputStream in = this.getServletContext().getResourceAsStream("/index.jsp");

        Set set = this.getServletContext().getResourcePaths("/WEB-INF");
        System.out.println(set);



    }
}
