import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class CourseDescriptionPanel extends JPanel
{
	private JLabel nameLabel, idLabel, descriptionLabel, timeslotLabel;
	private JButton deleteButton, returnButton;
	
	
	public CourseDescriptionPanel()
	{
		JFrame descriptionFrame = new JFrame("StundenplanApp");
		descriptionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		descriptionFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Superman_Logo.png")));
		descriptionFrame.setResizable(false);
		
		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setLayout(null);
		
		descriptionFrame.setSize(new Dimension(500, 600));
		descriptionFrame.add(descriptionPanel);		
		descriptionFrame.setVisible(true);
		
		
		nameLabel = new JLabel("Kurs XY");
		idLabel = new JLabel("KursID 123456");
		descriptionLabel = new JLabel("Kurs XY Beschreibung");
		timeslotLabel = new JLabel("12:00-16:00 Dienstags");		
		descriptionPanel.add(nameLabel);
		descriptionPanel.add(idLabel);
		descriptionPanel.add(descriptionLabel);
		descriptionPanel.add(timeslotLabel);
		
		returnButton = new JButton("Return");
		deleteButton = new JButton("Kurs aus Liste löschen");
		descriptionPanel.add(returnButton);
		descriptionPanel.add(deleteButton);
		
		Border compBorder = BorderFactory.createCompoundBorder(new LineBorder(Color.yellow), new LineBorder(Color.red, 3, true));
		
		
		
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
		
		returnButton.setBounds(50, 500 , 150, 50);
		
		deleteButton.setBounds(250, 500 , 200, 50);
		
		
		
		
	}
}