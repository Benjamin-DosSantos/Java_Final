import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Final_Lab_6 extends Applet{
	public void init(){
		setSize(1000, 1000);
	}// End of init method
	
	public void paint(Graphics g){
		int start_xPos = 200,
		    start_yPos = 200,
		    line_length = 50;
		
		/*
		 * 
		 * XPoints for the polygon
		 * 
		 */
		
		int xPos_array[] = {start_xPos, 
							start_xPos + (line_length / 2), 
							start_xPos + (line_length / 2) + line_length, 
							start_xPos + (line_length / 2) + line_length, 
							start_xPos + (line_length / 2) + line_length * 2, 
							start_xPos + (line_length / 2) + line_length, 
							start_xPos + (line_length / 2) + line_length, 
							start_xPos + (line_length / 2), 
							start_xPos, 
							start_xPos - (line_length / 2),
							start_xPos - line_length - (line_length / 2),
							start_xPos - line_length - (line_length / 2),
							start_xPos - line_length * 2 - (line_length / 2),
							start_xPos - line_length - (line_length / 2),
							start_xPos - line_length - (line_length / 2),
							start_xPos - (line_length / 2)
							};
		
		/*
		 * 
		 * yPoints for the polygon
		 * 
		 */
		int yPos_array[] = {start_yPos, 
							start_yPos + line_length, 
							start_yPos + line_length,  
							start_yPos + line_length * 2, 
							start_yPos + line_length * 2 + (line_length / 2),
							start_yPos + line_length * 3, 
							start_yPos + line_length * 4, 
							start_yPos + line_length * 4, 
							start_yPos + line_length * 5,
							start_yPos + line_length * 4,
							start_yPos + line_length * 4,
							start_yPos + line_length * 3,
							start_yPos + line_length * 2 + (line_length / 2),
							start_yPos + line_length * 2,
							start_yPos + line_length,
							start_yPos + line_length
							};
		
		g.setColor(Color.BLUE);		// Sets the polygon color to blue
		g.fillPolygon(xPos_array, yPos_array, xPos_array.length);	// Fills the polygon consisting of the predefined points
		
	}// End of paint method
}// End of class
