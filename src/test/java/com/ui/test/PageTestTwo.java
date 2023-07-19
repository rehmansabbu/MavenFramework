package com.ui.test;
import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.test.ui.browsersetup.BrowserSetup;
import com.test.ui.customlistner.CustomListnerForScreenshort;
import com.ui.page.PageTwo;


@Listeners(CustomListnerForScreenshort.class)
public class PageTestTwo extends BrowserSetup 
{

		public static PageTwo Two=new PageTwo();

	@Test
	public static void leftTabLinkDashboard() throws InterruptedException, IOException
	{
		
		System.out.println("Start the working on TestCase 2");
		Two.homeLink();
		Two.userManagement();
		Two.manageSchool();
		Two.teacherActivity();
		//Two.studentActivity();
		Two.learningTrackingFormat();
		Two.certification();
		Two.monitoring();
		Two.midDayMeal();
		Two.grievanceRedressal();
		Two.notifications();
		Two.faq();

		System.out.println("Finish the working on TestCase 2");

	}


}


