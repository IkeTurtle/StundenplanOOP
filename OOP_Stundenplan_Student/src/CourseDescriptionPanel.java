import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class CourseDescriptionPanel extends JPanel
{
	private JLabel nameLabel, idLabel, descriptionLabel, timeslotLabel;
	private JButton deleteButton, returnButton;
	
	
	public CourseDescriptionPanel()
	{
		JFrame descriptionFrame = new JFrame("DescriptionFrame");
		descriptionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
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
		
		Border labelBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
		
		
		
		nameLabel.setBounds(50, 10, 400, 50);
		nameLabel.setBorder(labelBorder);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		idLabel.setBounds(50, 100, 150, 50);
		idLabel.setBorder(labelBorder);
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		timeslotLabel.setBounds(300, 100, 150, 50);
		timeslotLabel.setBorder(labelBorder);
		timeslotLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeslotLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		descriptionLabel.setBounds(50, 200, 400, 250);
		descriptionLabel.setBorder(labelBorder);
		descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		descriptionLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		returnButton.setBounds(50, 500 , 150, 50);
		
		deleteButton.setBounds(250, 500 , 200, 50);
		
		
		
		
	}
}
