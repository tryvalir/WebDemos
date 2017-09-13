package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/9/7.
 */
public class HServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
* 1.获取ServletContext对象
* 2.如果存在属性名为count的属性，那么加1
* 3.如果不存在，就setAttibute一个*/
        ServletContext application=this.getServletContext();
        Integer count = (Integer) application.getAttribute("count");
        if(count==null) {
            application.setAttribute("count",1);
        }
        else{
            application.setAttribute("count",count+1);
        }
        response.getWriter().print("<h1>"+count+"</h1>");
    }
}
