import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class LectCourse {

	JTable x;
	String[][] data = {
			{"001","Objekt Orientierte Programmierung 2"},
			{"002","Betriebliche Informationssysteme"},
			{"003","Business English 2"},
			{"004","Internes Rechnungswesen"}
	};
	
	
	public LectCourse() {
		
		JFrame myFrame = new JFrame("Studenten Funktionen");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 600);
	
		JPanel myPanel = new JPanel();
	
		myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		
		
		
		myPanel.setLayout(null);
		
		JLabel Ueberschrift = new JLabel("Ihre Kurse");
		
		Ueberschrift.setHorizontalAlignment(SwingConstants.CENTER);
		Ueberschrift.setVerticalAlignment(SwingConstants.CENTER);
		Ueberschrift.setFont(new Font(null, Font.BOLD, 16));
		
		Ueberschrift.setBounds(175,10,150,40);
		
		myPanel.add(Ueberschrift);
		
		
		String[] columnNames = {"ID", "Name"}; 
		
		x = new JTable(data, columnNames);
		
		myPanel.add(new JScrollPane(x));
		
		x.setBounds(70,70,360,400);
		
		myPanel.add(x);
		
		  
		JButton zurueck = new JButton("ZurÃ¼ck");
		
		zurueck.setBounds(200, 495, 100, 30);
		myPanel.add(zurueck);
		
		zurueck.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				LectFun frame = new LectFun();
				myFrame.dispose();
			}		
		});
		
		
		
		

	}

}
