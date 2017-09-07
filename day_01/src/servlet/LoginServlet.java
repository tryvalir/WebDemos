package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/25.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*
* 处理中文问题*/
request.setCharacterEncoding("UTF-8");

/*取出request域中表单填写的用户信息*/
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String verifyCode = request.getParameter("VerifyCode");
        /*
* 实现验证码的校验
* 思路：
* 1.从session中取出正确的验证码信息
* 2.与request中的表单填写的对比，如果正确，就进入登录正确页面
* 3.如果错误，就把错误信息写入request,然后显示到login.jsp中
* */
        String session_verifyCode= (String) request.getSession().getAttribute("session_verifyCode");



        /*附加项：把session中的曾经输入过的用户名记录到cookie中去，
        送到客户端，然后下次再访问login.jsp时，就把request中的cookie显示到页面上去*/
        Cookie cookie=new Cookie("uname",username);
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
        /*
        * 检验用户名和密码是否正确
        * 规则是只要不是名字叫itcast就登录成功
        * */

        if (!session_verifyCode.equalsIgnoreCase(verifyCode)){
            request.setAttribute("msg","验证码错误");
            RequestDispatcher qr = request.getRequestDispatcher("/session2/login.jsp");
            qr.forward(request,response);
            return;
        }
        else if ("itcast".equalsIgnoreCase(username)){
            /*登录失败*/
            request.setAttribute("msg","用户名和密码错误");
            RequestDispatcher qr = request.getRequestDispatcher("/session2/login.jsp");
            qr.forward(request,response);
            return;
        }
        else {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("/day_01/session2/succ1.jsp");
        }
    }


}
