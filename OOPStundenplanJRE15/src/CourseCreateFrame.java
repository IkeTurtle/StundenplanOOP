import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class CourseCreateFrame {
		
	JFrame frame = new JFrame("StundenplanAPP");
	
	CourseCreateFrame(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		
		CourseCreatePanel Panel = new CourseCreatePanel();
		
		frame.getContentPane().add(Panel);
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
		frame.setResizable(false);
		
	}
		

	

}