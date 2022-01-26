import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LectCourseCreateDone extends JPanel {

public LectCourseCreateDone() {
		
		JFrame myFrame = new JFrame("Studenten Funktionen");
		myFrame.setSize(400, 200);
	
		JPanel myPanel = new JPanel();
	
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		myPanel.setLayout(null);
		
		JLabel text = new JLabel("Du hast einen neuen Kurs erstellt!");
		
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setVerticalAlignment(SwingConstants.CENTER);
		
		text.setBounds(50,60,300,40);
		myPanel.add(text);
		
		
		
	}
}