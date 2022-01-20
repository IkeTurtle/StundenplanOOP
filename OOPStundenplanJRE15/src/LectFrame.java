import javax.swing.JFrame;

public class LectFrame {
		
	JFrame frame = new JFrame("Kurs erstellen");
	
	LectFrame(){
		
		JFrame myFrame = new JFrame("Studenten Funktionen");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 600);
		
		LectFunPanel myPanel = new LectFunPanel();
		
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
	}
		

	

}