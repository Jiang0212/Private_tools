
package cn.privatetools.image;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Demo {
	public static void fun1() {
		// 1.创建图片缓存区 2.设置其宽高 3.得到这个图片的绘制环境（得到画笔） 4.保存起来
		BufferedImage bi = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();// 得到绘图环境
		g.setColor(Color.white);// 把环境设置为白色
		g.fillRect(0, 0, 200, 100);// 填充矩形，从0,0点开始，宽70，高35.即整个图片，即为图片设置背景色
		g.setColor(Color.red);// 把环境设置为红色
		g.drawString("hello", 20, 30);// 向图片中写入字符串，其中2,2表示x,y轴的坐标
		try {
			ImageIO.write(bi, "JPEG", new FileOutputStream("F:\\photo\\first.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fun2() throws IOException {
		VerifyCode vc = new VerifyCode();
		BufferedImage bi = vc.getImage();
		VerifyCode.output(bi, new FileOutputStream("F:\\xxx.jpg"));
		
		System.out.println(vc.getText());

	}
	
	/*
	 * public static void main(String[] args) throws IOException { fun2(); }
	 */
}
