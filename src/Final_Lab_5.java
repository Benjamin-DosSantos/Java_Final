import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.Random;

/**
 * 
 * @author Benjamin DosSantos
 * 
 * This applet will display a shape using arcs and lines
 *
 */

public class Final_Lab_5 extends Applet{

	int width = 0,
		height = 0;
			
	public void init(){
		GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] devices = g.getScreenDevices();

		for (int i = 0; i < devices.length; i++) {
			width += devices[i].getDisplayMode().getWidth();
			height += devices[i].getDisplayMode().getHeight();
		} 
		
		this.setSize(width, height);
		//this.setSize(width, height);
	}// End of init method
	
	public void paint(Graphics g){
		int dot_size = 1, 
			xPos = 0,
			yPos = 0;
		Random ran = new Random();
		for(int i = 0; i < width * 200; i++){
			for(int r = 0; r < height * 200; r++){
				g.setColor(new Color(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255)));
				g.fillOval(xPos, yPos, dot_size, dot_size);
				xPos += dot_size;
			}// End of for height
			xPos = 0;
			yPos += dot_size;
		}// End of for width
	}// End of paint method
}// End of class
