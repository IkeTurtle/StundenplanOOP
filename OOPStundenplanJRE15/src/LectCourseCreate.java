import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
		
		name.setBounds(12,50,150,40);
		
		myPanel.add(name);
		

		JTextArea namebox = new JTextArea();
		namebox.setBounds(70,90,230,20);
		myPanel.add(namebox);

		
		JLabel abkuerzung = new JLabel("Abkürzung");
		
		abkuerzung.setHorizontalAlignment(SwingConstants.CENTER);
		abkuerzung.setVerticalAlignment(SwingConstants.CENTER);
		
		abkuerzung.setBounds(286,50,150,40);
		
		myPanel.add(abkuerzung);
		

		JTextArea abkuerzungbox = new JTextArea();
		abkuerzungbox.setBounds(330,90,100,20);
		myPanel.add(abkuerzungbox);
		
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
		
		
		
		JLabel tag = new JLabel("Wochentag");
		
		tag.setHorizontalAlignment(SwingConstants.CENTER);
		tag.setVerticalAlignment(SwingConstants.CENTER);
		
		tag.setBounds(52,360,100,40);
		
		myPanel.add(tag);
		
		String days[] = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag"};
		JComboBox <String> day = new JComboBox<String>(days);
		
		day.setBounds(70,400,120,20);
		myPanel.add(day);
		
		
		
		JLabel start = new JLabel("Von");
		
		start.setHorizontalAlignment(SwingConstants.CENTER);
		start.setVerticalAlignment(SwingConstants.CENTER);
		
		start.setBounds(226,360,50,40);
		
		myPanel.add(start);
		
		String time1[] = {"8:00","9:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00"};
		JComboBox <String> starttime = new JComboBox<String>(time1);
		
		starttime.setBounds(240,400,70,20);
		myPanel.add(starttime);
		
		
		JLabel stop = new JLabel("Bis");
		
		stop.setHorizontalAlignment(SwingConstants.CENTER);
		stop.setVerticalAlignment(SwingConstants.CENTER);
		
		stop.setBounds(344,360,50,40);
		
		myPanel.add(stop);
		
		String time2[] = {"8:00","9:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00"};
		JComboBox <String> stoptime = new JComboBox<String>(time2);
		
		stoptime.setBounds(360,400,70,20);
		myPanel.add(stoptime);
		
		JButton create = new JButton("Fertig");
		
		create.setBounds(325, 495, 100, 30);
		
		create.addActionListener(new LectCourseCreateListener(namebox,abkuerzungbox,beschreibungbox, day, starttime,stoptime));
		
		myPanel.add(create);
		
		
		JButton zurueck = new JButton("Zurück");
		
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
