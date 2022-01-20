import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.JTableHeader;

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
		courseListPanel.setLayout(null);
		
		courseListFrame.setSize(new Dimension(500, 600));
		courseListFrame.add(courseListPanel);		
		courseListFrame.setVisible(true);
		
		String[][] dataString = new String[][] 
			{
				{"1234", "Mathe", "Sehr viel rechnen", "8:00-12:00 Dienstags"},
				{"315202", "OOP2", "Sehr viel programmieren", "8:00-12:00 Montags"},
				{"4567", "Wirtschaft", "Sehr viel wirtschaften", "16:00-20:00 Montags"},
				{"7892", "Englisch", "Sehr viel übersetzen", "14:00-16:00 Freitags"}
			};
		String[] headerString = new String[] {"ID", "Name", "Beschreibung", "Zeitraum"};
		
		studentCourseListLabel = new JLabel("Max Mustermanns Kursliste");
		courseListPanel.add(studentCourseListLabel);
		
		returnButton = new JButton("Return");
		courseListPanel.add(returnButton);
		
		courseList = new JTable(dataString, headerString);
		courseListPanel.add(courseList);
		
		courseListHeader = new JTableHeader();
		courseListPanel.add(courseListHeader);
		
		courseListScroll = new JScrollPane();
		courseListPanel.add(courseListScroll);
		
		
		Border labelBorder = BorderFactory.createLineBorder(Color.BLACK, 2);	
		
		studentCourseListLabel.setBounds(50, 10, 400, 50);
		studentCourseListLabel.setBorder(labelBorder);
		studentCourseListLabel.setHorizontalAlignment(SwingConstants.CENTER);
		studentCourseListLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		returnButton.setBounds(50, 500 , 150, 50);
		
		
		courseList.setBounds(50, 150, 380 , 300);
		courseList.setBorder(labelBorder);
		courseList.setTableHeader(courseListHeader);
		
		
		courseListHeader.setBounds(50, 102, 380, 50);
		courseListHeader.setBorder(labelBorder);
		
		
		courseListScroll.setBounds(428, 150 , 20, 300);
		courseListScroll.setBorder(labelBorder);
		
	}
	
	
}