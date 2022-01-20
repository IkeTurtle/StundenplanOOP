import javax.swing.JFrame;

public class CourseCreateFrame {
		
	JFrame frame = new JFrame("Kurs erstellen");
	
	CourseCreateFrame(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 600);
		
		CourseCreatePanel Panel = new CourseCreatePanel();
		
		frame.getContentPane().add(Panel);
		frame.setVisible(true);
		
	}
		

	

}
