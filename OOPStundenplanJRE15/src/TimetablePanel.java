import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class TimetablePanel extends JTable {
		
		JTable timetable;
		JFrame timetableFrame;
		JTableHeader timetableHeader;	
		JButton returnButton;

		
public TimetablePanel() {
	// TODO Auto-generated constructor stub
	
	timetableFrame = new JFrame("Stundenplan");	
	timetableFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	//JButton zurückButton = new JButton("Zurück");	
	
	timetableFrame.setSize(new Dimension (1000, 600));
	timetableFrame.setVisible(true);
	timetableFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
	timetableFrame.setResizable(false);
	timetableFrame.getContentPane().setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 10, 920, 400);
	timetableFrame.getContentPane().add(scrollPane);
	Border compBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.yellow), new LineBorder(Color.red, 3, true));
	Border raisedBorder = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
	
	String[] dayStrings = new String []{"Uhrzeit","Montag","Dienstag","Mittwoch","Donnerstag","Freitag"};
	String [][] timeStrings = new String [][]{
			{"8:00", "","","","","",},
			{"9:00", "","","","","",},
			{"10:00","","","","","",},
			{"11:00","","","","","",},
			{"12:00","","","","","",},
			{"13:00","","","","","",},
			{"14:00","","","","","",},
			{"15:00","","","","","",},
			{"16:00","","","","","",},
			{"17:00","","","","","",},
			{"18:00","","","","","",},
			{"19:00","","","","","",},
			{"20:00","","","","","",}};
		
	
	timetable = new JTable(timeStrings, dayStrings );
	timetableFrame.add(timetable);
	scrollPane.setViewportView(timetable);
	timetable.setBounds(10, 10, 920, 400);
	timetable.setVisible(true);	
	timetable.setBorder(raisedBorder);
	timetable.setRowHeight(40);

	
	timetableHeader = new JTableHeader();
	timetable.add(timetableHeader);
	
	returnButton = new JButton("Return");
	timetableFrame.getContentPane().add(returnButton);
	returnButton.setBounds(10, 500, 193, 50);
	returnButton.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			StudFun frame = new StudFun();
			timetableFrame.dispose();
			
		}		
	});
	
}
	
}
