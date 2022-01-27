
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class 
MainStundenplan {

	public static void main(String[] args) 
	{	
		
		//Zong Jie
		//Quellen
		//http://www.logoorange.com/logodesign-S.php ( Superman Icon)

		//https://dribbble.com/shots/8641810-Freebie-App-landing-page (GiF) 
		
		//https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/nimbus.html (Design)
		try {
    	    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    	        if ("Nimbus".equals(info.getName())) {
    	            UIManager.setLookAndFeel(info.getClassName());
    	            break;
    	        }
    	    }
    	} catch (Exception e) {
    	    
    	}
		
		TimetablePanel timetableFrame = new TimetablePanel();
		
		//Eike	
		CourseDescriptionPanel descriptionPanel = new CourseDescriptionPanel();
		StudCourseListPanel courseListPanel = new StudCourseListPanel();
		
		
		//Quang
		//LectFrame myframe = new LectFrame();
		
	
		StartScreen start = new StartScreen();
		
		
		//branch 'main' of https://github.com/IkeTurtle/StundenplanOOP.git
		
	}

}