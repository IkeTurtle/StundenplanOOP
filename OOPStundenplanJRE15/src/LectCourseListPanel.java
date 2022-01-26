import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class LectCourseListPanel extends JPanel {

	JTable x;
	String[][] data = {
			{"001","Objekt Orientierte Programmierung 2"},
			{"002","Betriebliche Informationssysteme"},
			{"003","Business English 2"},
			{"004","Internes Rechnungswesen"}
	};
	
	public LectCourseListPanel() {
		
	setLayout(null);
	
	JLabel Ueberschrift = new JLabel("Ihre Kurse");
	Ueberschrift.setForeground(Color.blue);
	Ueberschrift.setHorizontalAlignment(SwingConstants.CENTER);
	Ueberschrift.setVerticalAlignment(SwingConstants.CENTER);
	Ueberschrift.setFont(new Font(null, Font.BOLD, 16));
	
	Ueberschrift.setBounds(175,10,150,40);
	
	add(Ueberschrift);
	
	Border compBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.yellow), new LineBorder(Color.red, 3, true));
	
	String[] columnNames = {"ID", "Name"}; 
	
	x = new JTable(data, columnNames);
	x.setBorder(compBorder);
	add(new JScrollPane(x));
	
	x.setBounds(70,70,360,400);
	
	add(x);
	
	  
	JButton zurueck = new JButton("Zurück");
	
	zurueck.setBounds(200, 495, 100, 30);
	add(zurueck);
	
	zurueck.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			LectFrame frame = new LectFrame();	
		}		
	});
	
	}
	
}