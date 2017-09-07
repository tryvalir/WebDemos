package image;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/29.
 */
public class Demo {
    @Test
    public void fun1() throws IOException {
        BufferedImage bufferedImage = new BufferedImage(70, 35, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
        graphics2D.setColor(Color.white);
        graphics2D.fillRect(0, 0, 70, 35);
        graphics2D.setColor(Color.red);
        graphics2D.drawString("Hello", 2, 35 - 2);
        ImageIO.write(bufferedImage, "JPEG", new FileOutputStream("F:/xxx.jpg"));


    }

    @Test
    public void fun2() throws IOException {
        VerifyCode verifyCode=new VerifyCode();
        BufferedImage bi=verifyCode.getImage();
        verifyCode.outPut(bi,new FileOutputStream("F:/xxx.jpg"));

    }
}

