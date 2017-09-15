package request;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;

/**
 * Created by tryvalir on 2017/9/15.
 */
public class EncodingRequest extends HttpServletRequestWrapper {
    private  HttpServletRequest request;

    @Override
    public String getParameter(String name) {
        String value = request.getParameter(name);
        try {
            value = new String(value.getBytes("iso-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }

    public EncodingRequest(HttpServletRequest request) {
        super(request);
        this.request=request;
    }
}
