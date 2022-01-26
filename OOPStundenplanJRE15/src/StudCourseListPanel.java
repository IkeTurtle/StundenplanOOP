import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import javax.swing.table.DefaultTableModel;
	//branch 'main' of https://github.com/IkeTurtle/StundenplanOOP.git
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
 

public class StudCourseListPanel extends JPanel
{
	private JButton returnButton;
	private JLabel studentCourseListLabel;
	private JTable courseList;
	private JTableHeader courseListHeader;
	private JScrollPane courseListScroll;
	//private ArrayList ArrayListKursSpecific<>;
	
	
	public StudCourseListPanel() 
	{
		JFrame courseListFrame = new JFrame("StundenplanAPP");
		courseListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JPanel courseListPanel = new JPanel();
		//courseListPanel.setLayout(null);
		
		courseListFrame.setSize(new Dimension(500, 600));
		courseListFrame.add(courseListPanel);		
		courseListFrame.setVisible(true);
		courseListFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
		courseListFrame.setResizable(false);
		
		String[][] dataString = new String[][] 
			{
				{"1234", "Mathe", "Sehr viel rechnen", "8:00-12:00 Dienstags"},
				{"315202", "OOP2", "Sehr viel programmieren", "8:00-12:00 Montags"},
				{"4567", "Wirtschaft", "Sehr viel wirtschaften", "16:00-20:00 Montags"},

				{"7892", "Englisch", "Sehr viel �bersetzen", "14:00-16:00 Freitags"},

				{"7892", "Englisch", "Sehr viel übersetzen", "14:00-16:00 Freitags"},
				{"1234", "Mathe", "Sehr viel rechnen", "8:00-12:00 Dienstags"},
				{"315202", "OOP2", "Sehr viel programmieren", "8:00-12:00 Montags"},
				{"4567", "Wirtschaft", "Sehr viel wirtschaften", "16:00-20:00 Montags"},
				{"7892", "Englisch", "Sehr viel übersetzen", "14:00-16:00 Freitags"},
				{"1234", "Mathe", "Sehr viel rechnen", "8:00-12:00 Dienstags"},
				{"315202", "OOP2", "Sehr viel programmieren", "8:00-12:00 Montags"},
				{"4567", "Wirtschaft", "Sehr viel wirtschaften", "16:00-20:00 Montags"},
				{"7892", "Englisch", "Sehr viel übersetzen", "14:00-16:00 Freitags"},
				{"1234", "Mathe", "Sehr viel rechnen", "8:00-12:00 Dienstags"},
				
				//branch 'main' of https://github.com/IkeTurtle/StundenplanOOP.git
			};
		
		
		
		String[] headerString = new String[] {"ID", "Name", "Beschreibung", "Zeitraum"};
		
		studentCourseListLabel = new JLabel("Max Mustermanns Kursliste");
		courseListPanel.add(studentCourseListLabel);
		
		
		
		DefaultTableModel tableModel = new DefaultTableModel(dataString, headerString);
		courseList = new JTable(tableModel)
		{
			public boolean editCellAt(int row, int column, java.util.EventObject e)
			{
				return false;
			}
		};
		//https://www.tutorialspoint.com/how-can-we-detect-the-double-click-events-of-a-jtable-row-in-java		
		courseListPanel.add(courseList);
		
		courseListHeader = new JTableHeader();
		courseListPanel.add(courseListHeader);
		
		courseListScroll = new JScrollPane(courseList);
		courseListScroll.setVisible(true);
		add(courseListScroll);
		courseListPanel.add(courseListScroll);
		
		returnButton = new JButton("Return");
		courseListPanel.add(returnButton);
		
		Border compBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.yellow), new LineBorder(Color.red, 3, true));
		
		studentCourseListLabel.setBounds(50, 10, 400, 50);
		studentCourseListLabel.setForeground(Color.blue);
		studentCourseListLabel.setFont(new Font(null, Font.BOLD, 16));
		studentCourseListLabel.setBorder(compBorder);
		studentCourseListLabel.setHorizontalAlignment(SwingConstants.CENTER);
		studentCourseListLabel.setVerticalAlignment(SwingConstants.CENTER);
		studentCourseListLabel.setPreferredSize(new Dimension(400,50));
		
		//returnButton.setBounds(50, 500 , 150, 50);
		returnButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				StudFun frame = new StudFun();
				courseListFrame.dispose();
				
			}		
		});
		returnButton.setPreferredSize(new Dimension(150,50));
		
		
		courseList.setBounds(50, 150, 380 , 300);

		courseList.setBorder(compBorder);
		courseList.setTableHeader(courseListHeader);
		

		courseList.setBorder(compBorder);
		courseList.setFocusable(false);
		courseList.addMouseListener(new MouseAdapter() {
	         public void mouseClicked(MouseEvent me) {
	             if (me.getClickCount() == 2) {     
	                JTable target = (JTable)me.getSource();
	                int row = target.getSelectedRow(); 
	                int column = target.getSelectedColumn(); 
	               
	                CourseDescriptionPanel frame = new CourseDescriptionPanel();
	                courseListFrame.dispose();
	             }
	          }
	       });
		//https://www.tutorialspoint.com/how-can-we-detect-the-double-click-events-of-a-jtable-row-in-java
		//branch 'main' of https://github.com/IkeTurtle/StundenplanOOP.git
		
		courseListHeader.setBounds(50, 102, 380, 50);
		courseListHeader.setBorder(compBorder);
		
		
		courseListScroll.setBounds(428, 150 , 20, 300);
		courseListScroll.setBorder(compBorder);
		
	}
	
	
}