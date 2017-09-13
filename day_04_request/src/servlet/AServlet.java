package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/11.
 */
public class AServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("xxx"));
        System.out.println(request.getParameter("yyy"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("username:" + username + " password:" + password + " hobbies" + Arrays.toString(hobbies));

        Map<String,String[]> map = request.getParameterMap();
        for (String name : map.keySet()) {
            String[] s = map.get(name);
            System.out.println(name+"="+Arrays.toString(s));
        }
    }
}
