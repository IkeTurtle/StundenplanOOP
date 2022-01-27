import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class LectCourseCreateListener implements ActionListener {

	JTextArea name;
	JTextArea abb;
	JTextArea description;
	JComboBox <String> day;
	JComboBox <String> start;
	JComboBox <String> stop;
	
	public LectCourseCreateListener(JTextArea name, JTextArea abb, JTextArea description, JComboBox <String> day, JComboBox <String> start, JComboBox <String> stop) {
		this.name  =name;
		this.abb = abb;
		this.description = description;
		this.day = day;
		this.start = start;
		this.stop = stop;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String name1 = name.getText();
		String abb1 = abb.getText();
		String desc1 = description.getText(); 
		String day1 = (String) day.getSelectedItem();
		String start1 = (String) start.getSelectedItem();
		String stop1 = (String) stop.getSelectedItem();
		
		
		OracleDsSingleton ora = OracleDsSingleton.getInstance();
		
		try {
			
			Connection con = ora.getConnection();
			
			String sql = "INSERT INTO KursList ( Kursid, Name, Abb, Beschreibung, Wochentag, Startzeit, Stopzeit) VALUES ( Kursid.nextval, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, name1);
			ps.setString(2, abb1);
			ps.setString(3, desc1);
			ps.setString(4, day1);
			ps.setString(5, start1);
			ps.setString(6, stop1);
			
			int n = ps.executeUpdate();
			
			
		}
		catch(SQLException e1) {
			
		}
		
		LectCourseCreateDone frame = new LectCourseCreateDone();

		
		
		
	}
}
