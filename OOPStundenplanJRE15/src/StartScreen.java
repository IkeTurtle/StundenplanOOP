import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StartScreen extends JPanel {

	public StartScreen() {
	
	JFrame myFrame = new JFrame("Dozenten Funktionen");
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myFrame.setSize(500, 600);
	
	JPanel myPanel = new JPanel();
	
	myFrame.getContentPane().add(myPanel);
	myFrame.setVisible(true);
	
	
	
	
	myPanel.setLayout(null);
	
	
	JButton CourseCreate = new JButton("Dozent");
	
	CourseCreate.setBounds(175, 140, 150, 80);
	
	CourseCreate.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			LectFun frame = new LectFun();
			myFrame.dispose();
			
		}		
	});

			
	myPanel.add(CourseCreate);
	
	
	
	JButton LectCourseList = new JButton("Student");
	
	LectCourseList.setBounds(175, 340, 150, 80);
	
	LectCourseList.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			StudFun Frame = new StudFun();
			myFrame.dispose();
			
		}		
	});
	
	myPanel.add(LectCourseList);
	
	
	}
}
