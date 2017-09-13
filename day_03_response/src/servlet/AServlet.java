package servlet;

import java.io.IOException;

/**
 * Created by Administrator on 2017/9/7.
 */
public class AServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       response.sendError(404,"资源找到了，不给你，并给你设置为返回404");
    }
}
