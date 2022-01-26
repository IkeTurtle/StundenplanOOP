import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class LectCourseFrame {
	
	JFrame frame = new JFrame("StudenplanAPP");
	
	LectCourseFrame(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		frame.setBackground(Color.white);
		
		LectCourseListPanel myPanel = new LectCourseListPanel();
		
		frame.getContentPane().add(myPanel);
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
		frame.setResizable(false);
	}
}