import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;


public class Final_Lab_10 extends Applet{
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		// Gets the dimension of the whole screen 
	static double width = screenSize.getWidth();	// Creates a double with the value of the screen width
	static double height = screenSize.getHeight();	// Creates a double with the value of the screen height 
	
	public void init(){
		this.setSize((int)width, (int)height);
		this.setBackground(Color.BLACK);
	}// End of init method
	
	public void paint(Graphics g){
		Random ran = new Random();
		
		int font_size = 10;
		Color font_color = Color.WHITE;
		
		int numbers_to_display = 100;
		
		for(int i = 0; i <= numbers_to_display; i++){
			int temp_numb = ran.nextInt(2068) + 423;
			
			if(temp_numb < 1000){
				font_size = 20;
				font_color = Color.RED;
			}else if(temp_numb > 2000){
				font_size = 60;
				font_color = Color.BLUE;
			}else if(temp_numb > 1000 && temp_numb < 2000){
				font_size = 100;
				font_color = Color.GREEN;
			}else if(temp_numb == 2015){
				font_size = 250;
				font_color = Color.YELLOW;
			}
			g.setColor(font_color);
			Font display_font = new Font("Times New Roman", Font.BOLD, font_size);
			g.setFont(display_font);
			int xPos = ran.nextInt((int) width),
				yPos = ran.nextInt((int) height);
			g.drawString(temp_numb + "", xPos, yPos);
		}// End of for numbers to display
	}// End of paint method
}// End of class
