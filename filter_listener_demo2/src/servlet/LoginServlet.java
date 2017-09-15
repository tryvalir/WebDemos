package servlet;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by tryvalir on 2017/9/14.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        if (username.contains("tryvalir")) {
            request.getSession().setAttribute("role","admin");
        }
        else{
            request.getSession().setAttribute("role","user");
        }
    request.setAttribute("msg","登录成功！！");
     request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
