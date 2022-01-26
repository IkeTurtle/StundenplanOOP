import java.awt.Toolkit;

import javax.swing.JFrame;

public class LectFrame {
		
	JFrame frame = new JFrame("StundenPlanApp");
	
	LectFrame(){
		
		JFrame myFrame = new JFrame("StundenplanApp");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 600);
		
		LectFunPanel myPanel = new LectFunPanel();
		
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		myFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
		myFrame.setResizable(false);
	}
		

	

}