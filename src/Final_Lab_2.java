import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Final_Lab_2 extends Applet{
		
		public void init(){
			this.setSize(1200, 900);
		}
		
		public void paint(Graphics g){
			int x, y, width, height;
			Color face, body, insideface;
			int face_x, face_y, face_w, face_h;
			int body_x, body_y, body_w, body_h;
			int left_eye_x, left_eye_y, left_eye_w, left_eye_h;
			int right_eye_x, right_eye_y, right_eye_w, right_eye_h;
			int smile_x, smile_y, smile_w, smile_h, smile_arcangle, smile_arglength;
			Random ran = new Random();
			x = ran.nextInt(600); 
			y = ran.nextInt(600);
			width = ran.nextInt(300) + 50;
			height = ran.nextInt(300) + 50;
			
			face = Color.BLACK;
			body = Color.CYAN;
			insideface = Color.YELLOW;
				
			//my face will be 70% of my object height
			//my face will be 100% of my object width
			face_w = width;
			face_h = (int) (.7 * height);
			//my body will be 30% of my object height
			//my body will be 40% of my object width
			body_w = (int) (.3 * width);
			body_h = (int) (.7 * height);
			//my eyes will be 30% of the width and height of the face
			left_eye_w = (int) (face_w * .3);
			left_eye_h = (int) (face_h * .3);
			right_eye_w = left_eye_w;
			right_eye_h = left_eye_h;
			//smile will be 80% of the width of the face
			//smile will be 30% of the height of the face
			smile_w = (int) (face_w * .8);;
			smile_h = (int)   (face_h * .3);
			smile_arcangle = 180;
			smile_arglength = 180;
			//the following code will set the x and y coordinates of the face
			face_x = x;
			face_y = y;
			body_x = x + (int)(.35 * width);
			body_y = y + (int) (.95 * face_h) ;
			left_eye_x = face_x + (int) (.15 * face_w);
			left_eye_y = face_y + (int) (.1 * face_h);
			right_eye_x = face_x + (int) (.55 * face_w);
			right_eye_y = left_eye_y ;
			smile_x = face_x + (int) (face_w * .1);
			smile_y = face_y + (int) (face_h * .5);
			
				
			//----------------------------------------------------------------
			int times_to_gen = 5;	// Sets the number of figures to be drawn 
				
			/*
			 * Draws a figure next to each other the number of times specified in the variable 
			 * Because all of the body parts are dependent on the face, every x variable needs to be 
			 * moved by the face width * the number face so that the bodies don't overlap
			 */
			for(int i = 0; i < times_to_gen; i++){
				g.setColor(body);
				g.fillRect(body_x + (face_w * i), body_y, body_w, body_h);		
				g.setColor(face);
				g.fillOval(face_x + (face_w * i), face_y, face_w, face_h);
				g.setColor(insideface);
				g.drawArc(smile_x + (face_w * i), smile_y, smile_w, smile_h, smile_arcangle, smile_arglength);
				g.fillOval(left_eye_x + (face_w * i), left_eye_y, left_eye_w, left_eye_h);
				g.fillOval(right_eye_x + (face_w * i), right_eye_y, right_eye_w, right_eye_h);
			}// End of for times_to_gen
		}// End of paint method
}// End of class
