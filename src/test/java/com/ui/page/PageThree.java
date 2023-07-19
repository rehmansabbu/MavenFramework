package com.ui.page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.test.ui.browsersetup.BrowserSetup;
public class PageThree extends BrowserSetup  {

	//clickOnNumberOfGovtSchools
	public static String NUMBER_OF_GOVTSCHOOLS_XPATH="//h1[@class='school_cnt']";

	//View School MIS, School Activity and School MIS
	public static String VIEW_SCHOOL_MIS_XPATH="//h3[@id='titleHeader']";
	public static String SCHOOL_ACTIVITY_XPATH="//li[@id='sFL']";
	public static String SCHOOL_MIS_XPATH="//li[@id='sSL']";

	//Calendar, FAQ, Notification, Setting and logout icon
	public static String CALENDAR_XPATH="//i[@class='fa fa-calendar']";	
	public static String FAQ_XPATH="//i[@class='fa fa-question-circle-o']";	
	public static String NOTIFICATIONS_XPATH="//i[@class='icon-notification']";	
	public static String SETTING_XPATH="//i[@class='icon-gears']";	
	public static String LOGOUT_XPATH="//i[@class='fa fa-power-off']";	

	//school report, Student school Transfer Report, Merge school Report
	public static String SCHOOL_REPORT_XPATH="//a[@class='nav-item nav-link active']";
	public static String STUDENT_SCHOOL_TRANSFERREPORT_XPATH="//a[contains(text(),'Student School Transfer Report')]";
	public static String MERGE_SCHOOLREPORT_XPATH="//a[contains(text(),'Merge School Report')]";

	//All Report & print icon
	public static String ALLREPORT_XPATH="//a[@class='nav-item nav-link bg-primary allreport']";
	public static String PRINTICON_XPATH="//i[contains(@class,'fa-print')]";

	//District, Block and Cluster drop down
	public static String DISTRICT_XPATH="//select[@id='selDist']";
	public static String BLOCK_XPATH="//select[@id='selBlock']";
	public static String CLUSTER_XPATH="//select[@id='selCluster']";

	//search and hide button
	public static String SEARCH_XPATH="//button[@class='btn btn-primary']";
	public static String HIDE_BUTTON_XPATH="//a[@class='searchopen']";

	//District Wise School
	public static String DISTRICT_WISE_SCHOOL_XPATH="//div[@class='table-responsive grid-data']//table[@id='export-table']/tbody/tr";


	//3)Click on the number of govt school then Verify the View School MIS, School Activity and School MIS are present.

	public static void clickOnNumberOfGovtSchools() throws IOException

	{
		UTIL.click(driver, NUMBER_OF_GOVTSCHOOLS_XPATH, "Clicked On NUMBER_OF_GOVT SCHOOLS");


		//View School MIS, School Activity and School MIS
		UTIL.getText(driver, VIEW_SCHOOL_MIS_XPATH, "VIEW_SCHOOL_MIS");
		UTIL.isDisplayed(driver, VIEW_SCHOOL_MIS_XPATH, "VIEW_SCHOOL_MIS");

		UTIL.getText(driver, SCHOOL_ACTIVITY_XPATH, "SCHOOL_ACTIVITY");
		UTIL.isDisplayed(driver, SCHOOL_ACTIVITY_XPATH, "SCHOOL_ACTIVITY");

		UTIL.getText(driver, SCHOOL_MIS_XPATH, "School MIS");
		UTIL.isDisplayed(driver, SCHOOL_MIS_XPATH, "School MIS");


	}

	//4)Verify the Calendar, FAQ, Notification, Setting and logout icon are present.

	public static void verifyCalFaqNotifictaionSettingLogout() throws IOException
	{

		UTIL.getText(driver, CALENDAR_XPATH, "Calendar");
		UTIL.isDisplayed(driver, CALENDAR_XPATH, "Calendar");

		UTIL.getText(driver, FAQ_XPATH, "FAQ");
		UTIL.isDisplayed(driver, FAQ_XPATH, "FAQ");

		UTIL.getText(driver, NOTIFICATIONS_XPATH, "NOTIFICATIONS");
		UTIL.isDisplayed(driver, NOTIFICATIONS_XPATH, "NOTIFICATIONS");

		UTIL.getText(driver, SETTING_XPATH, "SETTING");
		UTIL.isDisplayed(driver, SETTING_XPATH, "SETTING");

		UTIL.getText(driver, LOGOUT_XPATH, "LOGOUT");
		UTIL.isDisplayed(driver, LOGOUT_XPATH, "LOGOUT");

	}


	//5)Verify the school report, Student school Transfer Report, Merge school Report, 


	public static void schoolReportStudentTransferReportMergeSchoolReport() throws IOException
	{
		UTIL.getText(driver, SCHOOL_REPORT_XPATH, "School report");
		UTIL.isDisplayed(driver, SCHOOL_REPORT_XPATH, "School report");

		UTIL.getText(driver, STUDENT_SCHOOL_TRANSFERREPORT_XPATH, "STUDENT_SCHOOL_TRANSFER REPORT");
		UTIL.isDisplayed(driver, STUDENT_SCHOOL_TRANSFERREPORT_XPATH, "STUDENT_SCHOOL_TRANSFER REPORT");

		UTIL.getText(driver, MERGE_SCHOOLREPORT_XPATH, "MERGE_SCHOOL REPORT");
		UTIL.isDisplayed(driver, MERGE_SCHOOLREPORT_XPATH, "MERGE_SCHOOL REPORT");


	}

	//6)Verify the All Report is present and print icon is present.
	public static void allReportPresentPrintIconPresent() throws IOException
	{

		UTIL.getText(driver, ALLREPORT_XPATH, "All report");
		UTIL.isDisplayed(driver, ALLREPORT_XPATH, "All Report");

		UTIL.getText(driver, PRINTICON_XPATH, "PRINT ICON");
		UTIL.isDisplayed(driver, PRINTICON_XPATH, "PRINT ICON");

	}

	//7)Verify the District, Block and Cluster drop down is present And also validate the District drop_down is disable.

	public static void verifyDistrictBlockClusterDropdownPresent() throws IOException
	{
		UTIL.getText(driver, DISTRICT_XPATH, "District");
		UTIL.isDisplayed(driver, DISTRICT_XPATH, "District");

		UTIL.getText(driver, BLOCK_XPATH, "BLOCK");
		UTIL.isDisplayed(driver, BLOCK_XPATH, "BLOCK");

		UTIL.getText(driver, CLUSTER_XPATH, "CLUSTER");
		UTIL.isDisplayed(driver, CLUSTER_XPATH, "CLUSTER");


	}

	//also validate the District drop_down is disable
	public static void validateDistrictDropdownDisable() throws IOException
	{
		UTIL.isEnabled(driver, DISTRICT_XPATH, "District Field");
	}


	//8)Verify the search and hide button is present.
	public static void searchHideButtonPresent() throws IOException
	{
		UTIL.getText(driver, SEARCH_XPATH, "Search Button");
		UTIL.isDisplayed(driver, SEARCH_XPATH, "Search Button");

		UTIL.getText(driver, HIDE_BUTTON_XPATH, "HIDE_BUTTON");
		UTIL.isDisplayed(driver, HIDE_BUTTON_XPATH, "Search HIDE_BUTTON");


	}

	//9)Verify the District Wise School Report is present.
	public static void districtWiseReportIsPresent()
	{
		List<String> list = new ArrayList<String>();
		list = UTIL.getElements(driver,  DISTRICT_WISE_SCHOOL_XPATH, "Number of Document Available");
		System.out.println("List of values : " +list.toString());
	}

	//10)Verify the search button is working or not and also verify the searched results

	public static void searchButtonIsWorkingOrNotVerifyTheSearchedResult() throws IOException
	{
		//search button is working or not
		UTIL.isEnabled(driver, SEARCH_XPATH, "Search Field");

		//verify the searched results
		UTIL.click(driver, SEARCH_XPATH, "Clicked on Search Button");


		//searched results
		List<String> list = new ArrayList<String>();
		list=UTIL.getElements(driver, DISTRICT_WISE_SCHOOL_XPATH, "District wise report");
		System.out.println("The List is : " +list.toString());


	}


}
