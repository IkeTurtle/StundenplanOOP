
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LectFun extends JPanel {

	public LectFun() {
		
		JFrame myFrame = new JFrame("Dozenten Funktionen");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 600);
		
		JPanel myPanel = new JPanel();
		
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		
		
		
		myPanel.setLayout(null);
		
		JButton CourseCreate = new JButton("Kurs erstellen");
		
		CourseCreate.setBounds(175, 100, 150, 80);
		
		CourseCreate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				LectCourseCreate frame = new LectCourseCreate();
				myFrame.dispose();
				
			}		
		});

				
		myPanel.add(CourseCreate);
		
		
		
		JButton LectCourseList = new JButton("Eigene Kurs-Liste");
		
		LectCourseList.setBounds(175, 240, 150, 80);
		
		LectCourseList.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				LectCourse Frame = new LectCourse();
				myFrame.dispose();
				
			}		
		});
		
		myPanel.add(LectCourseList);
		
		
		JButton Stundenplan = new JButton("Stundenplan");
		
		Stundenplan.setBounds(175, 380, 150, 80);
		
		myPanel.add(Stundenplan);
		
		
		

		
	}
	
}
