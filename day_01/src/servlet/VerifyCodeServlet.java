package servlet;

import image.VerifyCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class VerifyCodeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /*思路：
    1.生成图片
    2.把验证码信息存到session中
    3.把图片本身响应到客户端上
    * */
    VerifyCode verifyCode=new VerifyCode();
        BufferedImage bufferedImage = verifyCode.getImage();
        request.getSession().setAttribute("session_verifyCode",verifyCode.getText());
        verifyCode.outPut(bufferedImage, response.getOutputStream());
    }


}
