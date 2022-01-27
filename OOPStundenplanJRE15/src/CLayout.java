import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.ModuleLayer.Controller;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class CLayout extends JPanel{
	
	private JButton listReturnButton;
	private JLabel studentCourseListLabel;
	private JTable courseList;
	private JTableHeader courseListHeader;
	private JScrollPane courseListScroll;
	
	private JLabel nameLabel, idLabel, descriptionLabel, timeslotLabel;
	private JButton deleteButton, descriptionReturnButton;
	
	
	JFrame frame = new JFrame("Own Courses");
	JPanel Container = new JPanel();
	JPanel StudCourseListPanel = new JPanel();
	JPanel CourseDescriptionPanel = new JPanel();
	CardLayout cardLayout = new CardLayout();
	
	public CLayout()
	{		
		
		Container.setLayout(cardLayout);		
		Container.setSize(new Dimension(500, 600));
		
		
		
		listReturnButton = new JButton("Return");
		studentCourseListLabel = new JLabel("Max Mustermanns Kursliste");
		
		
		
								
		
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
					{"315202", "OOP2", "Sehr viel programmieren", "8:00-12:00 Montags"},
					{"4567", "Wirtschaft", "Sehr viel wirtschaften", "16:00-20:00 Montags"},
					{"7892", "Englisch", "Sehr viel übersetzen", "14:00-16:00 Freitags"},
					{"1234", "Mathe", "Sehr viel rechnen", "8:00-12:00 Dienstags"},
					
					
					
				};
			
			String[] headerString = new String[] {"ID", "Name", "Beschreibung", "Zeitraum"};
								
			
			DefaultTableModel tableModel = new DefaultTableModel(dataString, headerString);
			courseList = new JTable(tableModel)
			{
				public boolean editCellAt(int row, int column, java.util.EventObject e)
				{
					return false;
				}
			};
			
			//https://www.tutorialspoint.com/how-can-we-detect-the-double-click-events-of-a-jtable-row-in-java	
				
			courseListHeader = new JTableHeader();
			
			
			courseListScroll = new JScrollPane(courseList);
			courseListScroll.setVisible(true);
			add(courseListScroll);
				
			Border compBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.yellow), new LineBorder(Color.red, 3, true));
			Border raisedBorder = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
						
			studentCourseListLabel.setBounds(50, 10, 400, 50);
			studentCourseListLabel.setForeground(Color.blue);
			studentCourseListLabel.setFont(new Font(null, Font.BOLD, 16));
			studentCourseListLabel.setBorder(compBorder);
			studentCourseListLabel.setHorizontalAlignment(SwingConstants.CENTER);
			studentCourseListLabel.setVerticalAlignment(SwingConstants.CENTER);
			studentCourseListLabel.setPreferredSize(new Dimension(400,50));
			
			listReturnButton.setBounds(50, 500 , 150, 50);			
			listReturnButton.setPreferredSize(new Dimension(150,50));
			
			
			
			
			courseList.setBounds(50, 150, 380 , 300);


			courseList.setBorder(raisedBorder);
			courseList.setTableHeader(courseListHeader);
			

			courseList.setBorder(raisedBorder);
			
			courseListHeader.setBounds(50, 102, 380, 50);
			courseListHeader.setBorder(compBorder);
			
			
			courseListScroll.setBounds(428, 150 , 20, 300);
			courseListScroll.setBorder(compBorder);
			
			StudCourseListPanel.add(studentCourseListLabel);
			StudCourseListPanel.add(new JScrollPane(courseList));
			StudCourseListPanel.add(courseListHeader);
			StudCourseListPanel.add(listReturnButton);
			
			
			//Description Panel from here on out
		
		nameLabel = new JLabel("Kurse XY");
		idLabel = new JLabel("123456");
		descriptionLabel = new JLabel("Dies ist ein Kurs");
		timeslotLabel = new JLabel("14:00-16:00");
		deleteButton = new JButton("Diesen Kurs löschen");
		descriptionReturnButton = new JButton("Return");
		
		nameLabel.setBounds(50, 10, 400, 50);
		nameLabel.setBorder(compBorder);
		nameLabel.setFont(new Font(null, Font.BOLD, 16));
		nameLabel.setForeground(Color.blue);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		
		idLabel.setBounds(50, 100, 150, 50);
		idLabel.setBorder(compBorder);
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		timeslotLabel.setBounds(300, 100, 150, 50);
		timeslotLabel.setBorder(compBorder);
		timeslotLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeslotLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		descriptionLabel.setBounds(50, 200, 400, 250);
		descriptionLabel.setBorder(compBorder);
		descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		descriptionLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		descriptionReturnButton.setBounds(50, 500 , 150, 50);
		deleteButton.setBounds(250, 500 , 200, 50);
		
		CourseDescriptionPanel.add(nameLabel);
		CourseDescriptionPanel.add(idLabel);
		CourseDescriptionPanel.add(descriptionLabel);
		CourseDescriptionPanel.add(timeslotLabel);
		CourseDescriptionPanel.add(descriptionReturnButton);
		CourseDescriptionPanel.add(deleteButton);
		CourseDescriptionPanel.setLayout(null);
		
		
		
		
		

		Container.add(StudCourseListPanel, "courseList");
		Container.add(CourseDescriptionPanel, "description");
		cardLayout.show(Container, "courseList");
		
		
		
		
		courseList.addMouseListener(new MouseAdapter() {
	         public void mouseClicked(MouseEvent me) {
	             if (me.getClickCount() == 2) {     
	                JTable target = (JTable)me.getSource();
	                int row = target.getSelectedRow(); 
	                int column = target.getSelectedColumn(); 

	                idLabel.setText((String) courseList.getValueAt(row, 0));
	                nameLabel.setText((String) courseList.getValueAt(row, 1));
	                descriptionLabel.setText((String) courseList.getValueAt(row, 2));
	                timeslotLabel.setText((String) courseList.getValueAt(row, 3));
	                cardLayout.show(Container, "description");
	             }
	          }
	       });
		//https://www.tutorialspoint.com/how-can-we-detect-the-double-click-events-of-a-jtable-row-in-java
				
		listReturnButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				StudFun studFunFrame = new StudFun();
				frame.dispose();
			}
		});
		
		descriptionReturnButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(Container, "courseList");
			}
		});
		
		deleteButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		frame.setSize(new Dimension(500, 600));
		frame.add(Container);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
		frame.setResizable(false);
		
		
	}
}
