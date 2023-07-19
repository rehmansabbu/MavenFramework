package com.ui.test;
import java.io.IOException;
import org.testng.annotations.Test;
import com.test.ui.browsersetup.BrowserSetup;
import com.ui.page.PageFive;



public class PageTestFive extends BrowserSetup{
	
	static PageFive five = new PageFive();
	
	@Test
	public static void numberOfTeachers() throws IOException, InterruptedException
	{
		
		System.out.println("Start TestCase 5");
		
		five.clickOnNumberOfTeachers();
		five.verifyViewTeacherMisHomeTeacherActivityTeacherMisServiceBookTeacherAttendanceAllReportPrintIcon();
		five.serviceBookVerifyDistricDisabled();
		five.inServiceBookSelectBlockClusterSchoolClickOnSearch();
		five.verifyHideButtonDisplayed();
		five.verifyReportByTeacherIDClickOnSearch();
		//five.selectNatureOfAppointmentClickOnSearch();
		//five.excelIconIsDisplayed();
		//five.statusWiseReport();
		//five.clickOnTeacherAttendanceChooseDepartmentOfEducationClickOnSearchPrintReport();
		//five.verifyExportToXlsx();
		//five.blockWiseAttendanceReport();
		//five.printAttendanceReport();
		//five.clickOnAllReportAndVerify();
		//five.viewReport();
		
		System.out.println("Finish the Test Case 5");
		
	}
	
	
	

}
