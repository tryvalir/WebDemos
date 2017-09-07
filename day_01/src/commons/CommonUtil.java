package commons;

import java.util.UUID;

/**
 * Created by Administrator on 2017/8/29.
 */
public  class CommonUtil {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }


}
