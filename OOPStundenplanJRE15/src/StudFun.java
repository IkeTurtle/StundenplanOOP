import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StudFun extends JPanel {

	public StudFun() {
		
		JFrame myFrame = new JFrame("Studenten Funktionen");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 600);
		
		JPanel myPanel = new JPanel();
		
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		
		
		
		myPanel.setLayout(null);
		
		JButton CourseCreate = new JButton("Eigene Kurs-Liste");
		
		CourseCreate.setBounds(175, 100, 150, 80);
		
		CourseCreate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				StudCourseListPanel frame = new StudCourseListPanel();
				myFrame.dispose();
				
			}		
		});

				
		myPanel.add(CourseCreate);
		
		
		
		JButton LectCourseList = new JButton("Kurs-Liste");
		
		LectCourseList.setBounds(175, 240, 150, 80);
		
		LectCourseList.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				StudCourseListPanel frame2 = new StudCourseListPanel();
				myFrame.dispose();
				
			}		
		});
		
		myPanel.add(LectCourseList);
		
		
		JButton Stundenplan = new JButton("Stundenplan");
		
		Stundenplan.setBounds(175, 380, 150, 80);
		
		myPanel.add(Stundenplan);
		
		
		

		
	}
	
}
