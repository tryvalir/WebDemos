package listener;
/**
 * Created by tryvalir on 2017/9/14.
 */

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AListener implements ServletContextListener{
/*
* 1.创建map
* 2.保存到servletContext中去
* */
    public void contextInitialized(ServletContextEvent sce) {
        Map<String,Integer> map = new LinkedHashMap<>();
        sce.getServletContext().setAttribute("map",map);

    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("servletContext消亡");
    }
}
