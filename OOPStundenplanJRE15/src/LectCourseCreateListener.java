import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
		
		
		try {
			
			FileWriter fr = new FileWriter("Kurs-Liste.csv", true);
			
			BufferedWriter br = new BufferedWriter(fr);
			
			br.write("\n"+ name1 + ";" + abb1 + ";" + desc1 + ";" + day1 + ";" + start1 + ";" + stop1);
			
			br.close();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		LectCourseCreateDone frame = new LectCourseCreateDone();

		
		
		
	}
}
