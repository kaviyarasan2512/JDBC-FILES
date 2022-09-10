import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
class Pixel {
 BufferedImage image;
 int width;
 int height;

 public Pixel() {
 try {
 File input = new File("IMG_6483.jpg");
 File file = new File("D:\\kavisk\\foo.out");
FileOutputStream fos = new FileOutputStream(file);
BufferedOutputStream bos = new BufferedOutputStream(fos);
DataOutputStream dos = new DataOutputStream(bos);
 image = ImageIO.read(input);
 width = image.getWidth();
 height = image.getHeight();
 int output;
 for(int i=0; i<height; i++) {
 for(int j=0; j<width; j++) {

 Color c = new Color(image.getRGB(j, i));
 output= (c.getRed() + c.getGreen() + c.getBlue())/3;
 String s=String.valueOf(output+" ");
dos.writeBytes(s);
 }
System.out.println();
 }
 } catch (Exception e) {}

}
 static public void main(String args[]) throws Exception {
 Pixel obj = new Pixel();
 }
}