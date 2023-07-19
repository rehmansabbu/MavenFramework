package com.ui.test;
import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.test.ui.browsersetup.BrowserSetup;
import com.test.ui.customlistner.CustomListnerForScreenshort;
import com.ui.page.PageOne;

//do no write any driver.findElemets, no assertion and don't use here any logic implementation
//Setup the log file generation
//screenshot should generate based on the time frame
//implement Reports (extentReport)

@Listeners(CustomListnerForScreenshort.class)
public class PageTestOne extends BrowserSetup
{

	public static PageOne one=new PageOne();
	public static String expectedUrl;

	@Test
	public static void  login() throws IOException  {

		//createTest for Extent Report
		logger=report.createTest("Login to E-vidya Vahini & Verify the Dashboard Page");

		logger.info("Starting the Application of E-vidya Vahini");

		//After login validate the URL
		expectedUrl=driver.getCurrentUrl();
		//logger.pass("Get the Current Url sucessfully");


		UTIL.urlValidation(driver, "https://evidyavahini.jharkhand.gov.in/dashboard");
		//logger.pass("After login Of E-vidya Vahini Dashboard Page verified sucessfully");

		//Verify the Number of govt school data
		System.out.println("Start the working on TestCase 1");
		one.numberOfGovSchool();
		one.noOfVistedBrpCrp();
		one.verifyGovSchoolsText();
		one.verifyNumberOfTeachers();
		one.presentOfTeacher();
		one.activeBrpCrp();
		one.certificationData();
		one.schoolVerifiedByBrpCrp();
		one.schoolVerifiedByExternal();
		one.downloadedDocuments();
		one.noRecordFound();

		System.out.println("Finish the working on TestCase 1");
	}


}











