package image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * Created by Administrator on 2017/8/30.
 */
public class VerifyCode {
    private int w = 70;
    private int h = 35;
    private Random random =new Random();
    //可选字体
    private String[] fontNames = {"宋体", "华文楷体", "黑体", "微软雅黑", "楷体_GB2312"};
    //可选字符
    private String codes = "23456789abcdefghjkmnopqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ";
    private Color bgColor = new Color(255, 255, 255);
    private String text;

    private BufferedImage createImage() {
        BufferedImage bufferedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D=(Graphics2D) bufferedImage.getGraphics();
        graphics2D.setColor(bgColor);
        graphics2D.fillRect(0,0,w,h);
        return bufferedImage;
    }

    private char randomChar() {
        int index = random.nextInt(codes.length());
        return codes.charAt(index);
    }

    private Color randomColor() {
        int red = random.nextInt(150);
        int green = random.nextInt(150);
        int blue = random.nextInt(150);
        return new Color(red, green, blue);
    }

    private Font randomFont() {
        int index = random.nextInt(fontNames.length);
        String fontName = fontNames[index];
        int style = random.nextInt(4);
        int size = random.nextInt(5)+24;
        return new Font(fontName, style, size);

    }

    //获得验证码图
    /*思路：
    * 1.先得到画板，和画笔，用来装载字符的容器
    * 2.循环画上四个字符
    * 3.把四个字符从容器中取出来，然后画线
    * */
    public BufferedImage getImage() {
        BufferedImage bufferedImage = createImage();
        Graphics2D g2 = (Graphics2D) bufferedImage.getGraphics();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            String s = randomChar() + "";
            stringBuilder.append(s);
            float x = i * 1.0f * w / 4;
            g2.setColor(randomColor());
            g2.setFont(randomFont());
            g2.drawString(s, x, h - 5);
        }
        text = stringBuilder.toString();
        drawLine(bufferedImage);
        return bufferedImage;
    }

    private void drawLine(BufferedImage bufferedImage) {
        int num=3;
        Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
        for(int i=0;i<num;i++){
            int x1 = random.nextInt(w);
            int x2 = random.nextInt(w);
            int y1 = random.nextInt(h);
            int y2 = random.nextInt(h);
            graphics2D.setStroke(new BasicStroke(1.5F));
            graphics2D.setColor(Color.blue);
            graphics2D.drawLine(x1,y1,x2, y2);

        }

    }

    public String getText() {
        return text;
    }

    //保存图片到指定输出流
    public void outPut(BufferedImage bufferedImage,OutputStream outputStream) throws IOException {
        ImageIO.write(bufferedImage, "JPEG", outputStream);
    }
}