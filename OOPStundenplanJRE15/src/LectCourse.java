import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import javax.swing.table.DefaultTableModel;
//branch 'main' of https://github.com/IkeTurtle/StundenplanOOP.git
import javax.swing.table.JTableHeader;


public class LectCourse extends JPanel {
	private JButton returnButton;
	private JLabel studentCourseListLabel;
	private JTable courseList;
	private JTableHeader courseListHeader;
	private JScrollPane courseListScroll;
	// private ArrayList ArrayListKursSpecific<>;

	public LectCourse() {
		JFrame courseListFrame = new JFrame("Kurs-Liste");
		courseListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel courseListPanel = new JPanel();
		// courseListPanel.setLayout(null);

		courseListFrame.setSize(new Dimension(500, 600));
		courseListFrame.add(courseListPanel);
		courseListFrame.setVisible(true);
		courseListFrame.setResizable(false);
		
		OracleDsSingleton ora = OracleDsSingleton.getInstance();

		int rows = 0;

		try {

			Connection con = ora.getConnection();
			Statement stmt = con.createStatement();

			String sql = "SELECT * FROM KursList";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				rows++;
			}


		}

		catch (SQLException e) {
		}
		
		Object[][] data = new Object[rows][3];
		
		try {

			Connection con = ora.getConnection();
			Statement stmt = con.createStatement();

			String sql = "SELECT * FROM KursList";

			ResultSet rs1 = stmt.executeQuery(sql);

			int i = 0;

			while (rs1.next()) {

				int id = rs1.getInt("Kursid");
				String name = rs1.getString("Abb");
				String zeit = rs1.getString("WOCHENTAG") + ": " + rs1.getString("STARTZEIT") + " - " + rs1.getString("STOPZEIT");
				
				data[i][0] = id;
				data[i][1] = name;
				data[i][2] = zeit;
				
				i++;
			}
		}

		catch (SQLException e) {
		}
		
		String[] headerString = new String[] { "Kurs-ID","Name", "Zeitraum" };

		studentCourseListLabel = new JLabel("Kurs-Liste");
		courseListPanel.add(studentCourseListLabel);

		DefaultTableModel tableModel = new DefaultTableModel(data, headerString);
		courseList = new JTable(tableModel) {
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
				return false;
			}
		};
		// https://www.tutorialspoint.com/how-can-we-detect-the-double-click-events-of-a-jtable-row-in-java
		courseListPanel.add(courseList);

		courseListHeader = new JTableHeader();
		courseListPanel.add(courseListHeader);

		courseListScroll = new JScrollPane(courseList);
		courseListScroll.setVisible(true);
		add(courseListScroll);
		courseListPanel.add(courseListScroll);

		returnButton = new JButton("Return");
		courseListPanel.add(returnButton);

		Border compBorder = BorderFactory.createCompoundBorder();

		studentCourseListLabel.setBounds(50, 10, 400, 50);
		studentCourseListLabel.setForeground(Color.blue);
		studentCourseListLabel.setFont(new Font(null, Font.BOLD, 16));
		studentCourseListLabel.setBorder(compBorder);
		studentCourseListLabel.setHorizontalAlignment(SwingConstants.CENTER);
		studentCourseListLabel.setVerticalAlignment(SwingConstants.CENTER);
		studentCourseListLabel.setPreferredSize(new Dimension(400, 50));

		// returnButton.setBounds(50, 500 , 150, 50);
		returnButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				LectFun frame = new LectFun();
				courseListFrame.dispose();

			}
		});
		returnButton.setPreferredSize(new Dimension(150, 50));

		courseList.setBounds(50, 150, 380, 300);

		courseList.setBorder(compBorder);
		courseList.setTableHeader(courseListHeader);

		courseList.setBorder(compBorder);
		courseList.setFocusable(false);
		
		courseList.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent me) {
				
				if (me.getClickCount() == 2) {
					
					JTable target = (JTable) me.getSource();
					
					int row = target.getSelectedRow();
		
					
				}
			}
		});
//		https://www.tutorialspoint.com/how-can-we-detect-the-double-click-events-of-a-jtable-row-in-java
	}

}
