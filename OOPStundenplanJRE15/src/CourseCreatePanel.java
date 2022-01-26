import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class CourseCreatePanel extends JPanel {

	public CourseCreatePanel() {
		
		setLayout(null);
		

		Border compBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.yellow), new LineBorder(Color.red, 3, true));
		
		JLabel Ueberschrift = new JLabel("Kurs erstellen");
		Ueberschrift.setForeground(Color.blue);
		Ueberschrift.setHorizontalAlignment(SwingConstants.CENTER);
		Ueberschrift.setVerticalAlignment(SwingConstants.CENTER);
		Ueberschrift.setFont(new Font(null, Font.BOLD, 16));
		
		Ueberschrift.setBounds(175,10,150,40);
		
		add(Ueberschrift);
		
		
		JLabel name = new JLabel("Name");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setVerticalAlignment(SwingConstants.CENTER);
		name.setBounds(175,50,150,50);
		
		add(name);
		

		JTextArea namebox = new JTextArea();
		namebox.setBounds(70,90,360,20);
		namebox.setBorder(compBorder);
		add(namebox);
		
		
		
		
		JLabel beschreibung = new JLabel("Beschreibung");
		
		beschreibung.setHorizontalAlignment(SwingConstants.CENTER);
		beschreibung.setVerticalAlignment(SwingConstants.CENTER);
		beschreibung.setBounds(175,120,150,40);
		
		add(beschreibung);
		
		
		JTextArea beschreibungbox = new JTextArea();
		beschreibungbox.setBounds(70,160,360,150);
		beschreibungbox.setBorder(compBorder);
		add(beschreibungbox);
		
		
		
		JLabel zeit = new JLabel("Zeitraum");
		
		zeit.setHorizontalAlignment(SwingConstants.CENTER);
		zeit.setVerticalAlignment(SwingConstants.CENTER);
		
		zeit.setBounds(175,320,150,40);
		
		add(zeit);
		
		JTextArea zeitbox = new JTextArea();
		zeitbox.setBounds(70,360,360,100);
		zeitbox.setBorder(compBorder);
		add(zeitbox);
		
		
		JButton create = new JButton("Fertig");
		
		create.setBounds(325, 495, 100, 30);
		add(create);
		
		JButton zurueck = new JButton("Zurück");
		
		zurueck.setBounds(75, 495, 100, 30);
		add(zurueck);
		
		
		zurueck.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				LectFrame frame = new LectFrame();	
			}		
			
			
		
			
		});
		
		
	}
}