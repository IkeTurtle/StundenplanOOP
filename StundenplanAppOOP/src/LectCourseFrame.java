import javax.swing.JFrame;

public class LectCourseFrame {

	JFrame frame = new JFrame();
	
	LectCourseFrame(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		
		LectCourseListPanel myPanel = new LectCourseListPanel();
		
		frame.getContentPane().add(myPanel);
		frame.setVisible(true);
		
	}
}
