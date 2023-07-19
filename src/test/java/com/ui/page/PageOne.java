package com.ui.page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.test.ui.browsersetup.BrowserSetup;


public class PageOne extends BrowserSetup {

	//do not use assert, driver.findElement, only need to call the methods from UTIL class and if needed write the logic



	public static String NUMBER_GOV_SCHOOL="//h1[@class='school_cnt']";

	public static String NUMBER_GOV_SCHOOL_XPATH="//h1[@class='school_cnt']";
	public static String NO_VISTED_BRP_CRP_XPATH="//span[@class='school_cnt_brp']";

	public static String VERIFY_GOV_SCHOOL_TEXT_XPATH="//p[contains(text(),'govt.')]";

	public static String NUMBER_OF_TEACHER_XPATH="//h1[@class='teacher_cnt']";
	public static String TOTAL_PRESENT_TEACHER_XPATH="//span[@class='teacher_present_cnt']";
	public static String MANUAL_ATTANDANCE_XPATH="//span[@class='manual_cnt']";
	public static String NUMBER_OF_TEACHERS_TEXT="//p[contains(text(),'Number of teachers')]";

	public static String NUMBER_OF_BRP_CRP_XPATH = "//h1[@class='brp_cnt']";
	public static String NUMBER_OF_BRP_CRP_TEXT_XPATH = "//p[contains(text(),'Number of BRP')]";
	public static String NUMBER_OF_ACTIVE_BRP_CRP_XPATH="//span[@class='active_brp_cnt']";

	public static String CERTIFICATION_DATA_XPATH="//div[contains(text(),'Certification Data')]";
	public static String EXACT_NUMBER_CERTIFICATION_DATA="//div[@class='nomination']//h3";
	public static String TOTAL_CERTIFICATION_NOMINATION_TEXT_XPATH="//span[contains(text(),'Total certificate Nomination')]";

	public static String SCHOOL_VERIFIED_BY_BRP_CRP_TEXT="//span[contains(text(),'School verified by BRP')]";
	public static String TOTAL_VERIFIED_BY_BRP_CRP_XPATH="//div[@class='verifiedcrpbrp']//h3";

	public static String SCHOOL_VERIFIED_BY_EXTERNAL_TEXT="//span[contains(text(),'School verified by external')]";
	public static String NUMBER_VERIFIED_SCHOOL_BY_EXTERNAL="//div[@class='external']//h3";
	public static String APPROVED_BY_EXTERNAL_TEXT="//a[contains(text(),'Approved by external:')]";
	public static String NUMBER_OF_APPROVED_BY_EXTERNAL="//div[@class='external']//small";

	public static String SERIAL_NO_XPATH="//div[@class='table-responsive']//th[contains(text(),'Sl#')]";
	public static String DETAILS_XPATH="//div[@class='table-responsive']//th[contains(text(),'Details')]";
	public static String ACTION_XPATH="//th[contains(text(),'Action')]";

	public static String NUMBER_OF_DOCUMENT_AVALAIBLE_XPATH="//div[@class='panel panel-default document']//table/tbody/tr";

	public static String NO_RECORD_FOUND_XPATH="//div[@id='mCSB_2_container']/div/h3";

	public static String HOME_XPATH="//span[contains(text(),'Home')]";



	public static void numberOfGovSchool() throws IOException {
		String numberOfGovSchool = UTIL.getText(driver, NUMBER_GOV_SCHOOL_XPATH, "Number of government school");
		System.out.println("Total number of Gov school : " +numberOfGovSchool);
		UTIL.isDisplayed(driver, NUMBER_GOV_SCHOOL_XPATH, "Number of government school");

	}

	public static void noOfVistedBrpCrp() throws IOException
	{
		UTIL.isDisplayed(driver, NO_VISTED_BRP_CRP_XPATH, "Visted by BRP/CRP");	
	}

	public static void verifyGovSchoolsText() throws IOException
	{
		String govSchoolTextField =UTIL.getText(driver, VERIFY_GOV_SCHOOL_TEXT_XPATH, "Gov school text field.."); 
		String govtSchoolText=govSchoolTextField.substring(10,23);
		System.out.println(govtSchoolText);
		//UTIL.textValidation(govtSchoolText , "govt. schools" , "govt. schools Text Field validation");

		UTIL.labelTextValidation( govtSchoolText, "govt. schools", "govt. schools Text Field validation");


	}

	public static void verifyNumberOfTeachers() throws IOException
	{
		UTIL.isDisplayed(driver, NUMBER_OF_TEACHER_XPATH, "Number of Teacher");
	}

	public static void presentOfTeacher() throws IOException
	{
		UTIL.isDisplayed(driver,TOTAL_PRESENT_TEACHER_XPATH , "Total Present of Teacher");		
	}

	public static void manualAttendanceOfTeacher() throws IOException
	{
		UTIL.isDisplayed(driver, MANUAL_ATTANDANCE_XPATH, "Number of Manual Attendance");

		//Verify Teacher Text by using of String
		String teacherText=UTIL.getText(driver, NUMBER_OF_TEACHERS_TEXT, "Teacher Text");

		System.out.println(teacherText);
		String actualTeacherText=teacherText.substring(10,18);
		System.out.println(actualTeacherText);
		UTIL.labelTextValidation(actualTeacherText , "teachers", "Teachers Text");
	}

	public static void verifyTheNumberOfBrpCrp() throws IOException
	{
		String numberBrpCrp=UTIL.getText(driver, NUMBER_OF_BRP_CRP_XPATH, "Number Of Brp/crp");
		System.out.println(numberBrpCrp);
		UTIL.isDisplayed(driver, NUMBER_OF_BRP_CRP_XPATH, "Number Of Brp/crp");

		// verify "BRP/CRP" text by using of Substring
		UTIL.isDisplayed(driver, NUMBER_OF_BRP_CRP_TEXT_XPATH, "Number of BRP/CRP Text");

		String numberOfBrpCrpTextSubstring =UTIL.getText(driver, NUMBER_OF_BRP_CRP_TEXT_XPATH,"Number of BRP/CRP Text" );
		String numberOfBrpCrpTextSubstring1=numberOfBrpCrpTextSubstring.substring(10, 17);
		System.out.println(numberOfBrpCrpTextSubstring1);
		UTIL.labelTextValidation(numberOfBrpCrpTextSubstring1, "BRP/CRP", "BRP/CRP text field");

	}

	public static void activeBrpCrp() throws IOException
	{
		String activeBrpCrp=UTIL.getText(driver, NUMBER_OF_ACTIVE_BRP_CRP_XPATH, "Active BRP/CRP");
		System.out.println(activeBrpCrp);

		UTIL.isDisplayed(driver, NUMBER_OF_ACTIVE_BRP_CRP_XPATH, "Active BRP/CRP");

	}

	public static void certificationData() throws IOException
	{
		UTIL.isDisplayed(driver, CERTIFICATION_DATA_XPATH, "Certification data Text field");


		//Total certification Nomination

		String TotalNumberCertification =UTIL.getText(driver, EXACT_NUMBER_CERTIFICATION_DATA, "Total certification Data");
		System.out.println(TotalNumberCertification);

		UTIL.isDisplayed(driver, EXACT_NUMBER_CERTIFICATION_DATA, "Total certification Data");

		//Total certificate Nomination TEXT

		UTIL.isDisplayed(driver, TOTAL_CERTIFICATION_NOMINATION_TEXT_XPATH, "TOTAL_CERTIFICATION_NOMINATION TEXT FIELD");

		//verify nomination text String based
		String totalCertificationNominationText=UTIL.getText(driver, TOTAL_CERTIFICATION_NOMINATION_TEXT_XPATH, "TOTAL_CERTIFICATION_NOMINATION TEXT FIELD");
		String totalCertificationNominationTextSubstring =totalCertificationNominationText.substring(18, 28);
		UTIL.labelTextValidation(totalCertificationNominationTextSubstring, "Nomination", "Nomination Text Field");
	}

	public static void schoolVerifiedByBrpCrp() throws IOException
	{
		UTIL.isDisplayed(driver, SCHOOL_VERIFIED_BY_BRP_CRP_TEXT, "SCHOOL_VERIFIED_BY_BRP_CRP");

		//BRP/CRP digit

		String totalVerifiedBrpCrp=UTIL.getText(driver, TOTAL_VERIFIED_BY_BRP_CRP_XPATH, "Total verified by brp crp");
		System.out.println(totalVerifiedBrpCrp);

		UTIL.isDisplayed(driver, TOTAL_VERIFIED_BY_BRP_CRP_XPATH, "Total verified by brp crp");

	}

	public static void schoolVerifiedByExternal() throws IOException
	{
		UTIL.isDisplayed(driver, SCHOOL_VERIFIED_BY_EXTERNAL_TEXT, "School Verified By External");

		// external with Exact digit which is mention in the application

		String numberVerifiedSchoolByExternal=UTIL.getText(driver, NUMBER_VERIFIED_SCHOOL_BY_EXTERNAL, "Number of verified school by external");
		System.out.println(numberVerifiedSchoolByExternal);

		UTIL.isDisplayed(driver, NUMBER_VERIFIED_SCHOOL_BY_EXTERNAL, "Number of verified school by external");


		//total_number_of_school_verified_by_external

		UTIL.isDisplayed(driver, APPROVED_BY_EXTERNAL_TEXT, "Approved By External");

		//approved_by_external

		String numberOfApprovedExternal=UTIL.getText(driver, NUMBER_OF_APPROVED_BY_EXTERNAL, "Number of Approved by External");
		System.out.println(numberOfApprovedExternal);

		UTIL.isDisplayed(driver, NUMBER_OF_APPROVED_BY_EXTERNAL, "Number of Approved by External");

		//Approved by external: 216
		//BY SYBSTRING
		String numberOfApprovedExternalSubstring=numberOfApprovedExternal.substring(22, 25);
		UTIL.labelTextValidation(numberOfApprovedExternalSubstring , "216" , "Number of approved by external");

	}


	public static void downloadedDocuments() throws IOException
	{
		//sl

		UTIL.isDisplayed(driver , SERIAL_NO_XPATH , "Serial Number");

		//Details

		UTIL.isDisplayed(driver , DETAILS_XPATH , "Details");

		//Action

		UTIL.isDisplayed(driver, ACTION_XPATH , "Action");

		//verify the number of documents are available in TABLE 10
		List<String> list = new ArrayList<String>();
		list = UTIL.getElements(driver,  NUMBER_OF_DOCUMENT_AVALAIBLE_XPATH, "Number of Document Available");
		System.out.println("List of values : " +list.toString());
	}


	public static void noRecordFound()
	{  
		List<String> list = new ArrayList<String>();
		list=UTIL.getElements(driver, NO_RECORD_FOUND_XPATH, "NO RECORD FOUND FIELD");

		if(list.size() < 0)
		{
			System.out.println("No Records text is available");
		}
		else
		{
			System.out.println("No Records text is NOT available");
		}

	}


	


}
