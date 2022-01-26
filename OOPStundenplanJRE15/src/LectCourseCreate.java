import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class LectCourseCreate extends JPanel {

	public LectCourseCreate() {
		
		JFrame myFrame = new JFrame("Studenten Funktionen");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 600);
	
		JPanel myPanel = new JPanel();
	
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		
		
		
		myPanel.setLayout(null);
		
		JLabel Ueberschrift = new JLabel("Kurs erstellen");
		
		Ueberschrift.setHorizontalAlignment(SwingConstants.CENTER);
		Ueberschrift.setVerticalAlignment(SwingConstants.CENTER);
		Ueberschrift.setFont(new Font(null, Font.BOLD, 16));
		
		Ueberschrift.setBounds(175,10,150,40);
		
		myPanel.add(Ueberschrift);
		
		
		JLabel name = new JLabel("Name");
		
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setVerticalAlignment(SwingConstants.CENTER);
		
		name.setBounds(175,50,150,40);
		
		myPanel.add(name);
		

		JTextArea namebox = new JTextArea();
		namebox.setBounds(70,90,360,20);
		myPanel.add(namebox);
		
		
		
		
		JLabel beschreibung = new JLabel("Beschreibung");
		
		beschreibung.setHorizontalAlignment(SwingConstants.CENTER);
		beschreibung.setVerticalAlignment(SwingConstants.CENTER);
		
		beschreibung.setBounds(175,120,150,40);
		
		myPanel.add(beschreibung);
		
		
		JTextArea beschreibungbox = new JTextArea();
		beschreibungbox.setBounds(70,160,360,150);
		myPanel.add(beschreibungbox);
		
		
		
		JLabel zeit = new JLabel("Zeitraum");
		
		zeit.setHorizontalAlignment(SwingConstants.CENTER);
		zeit.setVerticalAlignment(SwingConstants.CENTER);
		
		zeit.setBounds(175,320,150,40);
		
		myPanel.add(zeit);
		
		JTextArea zeitbox = new JTextArea();
		zeitbox.setBounds(70,360,360,100);
		myPanel.add(zeitbox);
		
		
		JButton create = new JButton("Fertig");
		
		create.setBounds(325, 495, 100, 30);
		myPanel.add(create);
		
		
		JButton zurueck = new JButton("ZurÃ¼ck");
		
		zurueck.setBounds(75, 495, 100, 30);
		myPanel.add(zurueck);
		
		
		zurueck.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				LectFun frame = new LectFun();	
				myFrame.dispose();
			}		
			
			
		
			
		});
		
		
		}
	
}
