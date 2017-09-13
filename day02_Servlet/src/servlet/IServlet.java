package servlet;





import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;


public class IServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Class aClass = this.getClass();
       ClassLoader classLoader=aClass.getClassLoader() ;

        //相对于/classes路径
        InputStream inputStream1 = classLoader.getResourceAsStream("a.text");
        System.out.println(IOUtils.toString(inputStream1,"UTF-8"));


        //相对于当前.class文件所在父目录，如果找不到客户端会报500错误的，没有找到文件
//        InputStream inputStream2 = aClass.getResourceAsStream("a.text");
//        System.out.println(IOUtils.toString(inputStream2,"UTF-8"));

        //相当于/classes路径
        InputStream inputStream3 = aClass.getResourceAsStream("/a.text");
        System.out.println(IOUtils.toString(inputStream3,"UTF-8"));
//复杂的路径使用,这里使用/开头，然后当前.class文件退两步回到WEB-INF路径下
        InputStream inputStream4 = aClass.getResourceAsStream("/../../index.jsp");
        System.out.println(IOUtils.toString(inputStream4,"UTF-8"));





    }
}
