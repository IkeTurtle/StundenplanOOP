import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LectFunPanel extends JPanel {

	public LectFunPanel() {
		
		
		setLayout(null);
		
		JButton CourseCreate = new JButton("Kurs erstellen");
		
		CourseCreate.setBounds(175, 100, 150, 80);
		
		CourseCreate.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				CourseCreateFrame frame = new CourseCreateFrame();
				
			}		
		});

				
		add(CourseCreate);
		
		
		
		JButton LectCourseList = new JButton("Eigene Kurs-Liste");
		
		LectCourseList.setBounds(175, 240, 150, 80);
		
		LectCourseList.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				LectCourseFrame frame = new LectCourseFrame();
				
			}		
		});
		add(LectCourseList);
		
		
		JButton Stundenplan = new JButton("Stundenplan");
		
		Stundenplan.setBounds(175, 380, 150, 80);
		
		add(Stundenplan);
		
		
		

	}

}