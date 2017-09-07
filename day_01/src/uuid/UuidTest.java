package uuid;

import commons.CommonUtil;
import org.junit.Test;

import java.util.UUID;

/**
 * Created by Administrator on 2017/8/29.
 */
public class UuidTest {
    @Test
   public void fun1(){
       UUID uuid= UUID.randomUUID();
        String string = uuid.toString();
        string = string.replace("-", "");
        string=string.toUpperCase();
        System.out.println(string);
        System.out.println(CommonUtil.uuid());



    }

}
