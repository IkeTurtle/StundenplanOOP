import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class 
MainStundenplan {

	public static void main(String[] args) 
	{	
		//Zong Jie
		try {
    	    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    	        if ("Nimbus".equals(info.getName())) {
    	            UIManager.setLookAndFeel(info.getClassName());
    	            break;
    	        }
    	    }
    	} catch (Exception e) {
    	    
    	}
		//Eike	
		CourseDescriptionPanel descriptionPanel = new CourseDescriptionPanel();
		StudCourseListPanel courseListPanel = new StudCourseListPanel();
		
		
		//Quang
		LectFrame myframe = new LectFrame();
		
			
		
	}

}