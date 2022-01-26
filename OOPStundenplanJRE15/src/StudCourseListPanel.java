import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.table.DefaultTableModel;
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
		JFrame courseListFrame = new JFrame("DescriptionFrame");
		courseListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		JPanel courseListPanel = new JPanel();
		//courseListPanel.setLayout(null);
		
		courseListFrame.setSize(new Dimension(500, 600));
		courseListFrame.add(courseListPanel);		
		courseListFrame.setVisible(true);
		
		String[][] dataString = new String[][] 
			{
				{"1234", "Mathe", "Sehr viel rechnen", "8:00-12:00 Dienstags"},
				{"315202", "OOP2", "Sehr viel programmieren", "8:00-12:00 Montags"},
				{"4567", "Wirtschaft", "Sehr viel wirtschaften", "16:00-20:00 Montags"},
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
		
		Border labelBorder = BorderFactory.createLineBorder(Color.BLACK, 2);	
		
		studentCourseListLabel.setBounds(50, 10, 400, 50);
		studentCourseListLabel.setBorder(labelBorder);
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
		courseList.setBorder(labelBorder);
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
		
		courseListHeader.setBounds(50, 102, 380, 50);
		courseListHeader.setBorder(labelBorder);
		
		
		courseListScroll.setBounds(428, 150 , 20, 300);
		courseListScroll.setBorder(labelBorder);
		
	}
	
	
}