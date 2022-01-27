import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class TimetablePanel extends JPanel {
		
		JTable timetable;
		JFrame timetaFrame;
		JPanel timetableJPanel;
		JTableHeader timetableHeader;	
		JButton retButton;
		
public TimetablePanel() {
	// TODO Auto-generated constructor stub
	
	JFrame timetableFrame = new JFrame("Stundenplan");	 
	JPanel TimetableJPanel = new JPanel();
	
	//JButton zurückButton = new JButton("Zurück");	
	
	timetableFrame.setSize(new Dimension(500, 600));
	timetableFrame.getContentPane().setBackground(Color.white);
	timetableFrame.add(TimetableJPanel);
	timetableFrame.setVisible(true);
	timetableFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
	timetableFrame.setResizable(false);
	timetableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Border compBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.yellow), new LineBorder(Color.red, 3, true));
	Border raisedBorder = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
	
	String[] daysHeaderStrings = new String []{"Uhrzeit","Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};
	
	String [][] timeRowStrings = new String [][]{
			{"8:00", "","","","","","","",},
			{"9:00", "","","","","","","",},
			{"10:00","","","","","","","",},
			{"11:00","","","","","","","",},
			{"12:00","","","","","","","",},
			{"13:00","","","","","","","",},
			{"14:00","","","","","","","",},
			{"15:00","","","","","","","",},
			{"16:00","","","","","","","",},
			{"17:00","","","","","","","",},
			{"18:00","","","","","","","",},
			{"19:00","","","","","","","",},
			{"20:00","","","","","","","",}};
	
	
	timetable = new JTable(timeRowStrings, daysHeaderStrings );
	timetable.setVisible(true);	
	timetable.setBorder(raisedBorder);
	TimetableJPanel.add(timetable);
	TimetableJPanel.add(new JScrollPane(timetable));
	TimetableJPanel.setBorder(compBorder);
	
	JButton returnButton = new JButton("Return");
	TimetableJPanel.add(returnButton);
	returnButton.setBounds(50, 500 , 150, 50);
	returnButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			StudFun frame = new StudFun();
			timetableFrame.dispose();
			
		}		
	});
	
}
	
}
