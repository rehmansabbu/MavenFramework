package com.ui.page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.test.ui.browsersetup.BrowserSetup;

public class PageFour extends BrowserSetup  {

	//clickOnNumberOfGovtSchools
	public static String NUMBER_OF_GOVTSCHOOLS_XPATH="//h1[@class='school_cnt']";

	//click on Search button
	public static String SEARCH_XPATH="//button[@class='btn btn-primary']";

	//District Wise School
	public static String DISTRICT_WISE_SCHOOL_XPATH= "//table[@id='export-table']/tbody/tr";

	//Export to xlsx
	public static String  EXPORT_xlsx_XPATH= "//button[contains(text(),'Export to xlsx')]";

	//District school report Table Head
	public static String DISTRICT_REPORT_TABLE_HEAD_XPATH="//table[@id='export-table']/thead";

	//District column
	public static String DISTRICT_COLUMN_XPATH="//table[@id='export-table']/tbody/tr/td/a";

	//total number record and validate the total records.
	public static String TOTAL_RECORD_XPATH="//table[@id='export-table']/tbody/tr[25]/td";


	public static void clickOnNumberOfGovtSchools() throws IOException
	{
		UTIL.click(driver, NUMBER_OF_GOVTSCHOOLS_XPATH, "Clicked On Number of Gov school");

	}
	public static void districtWiseSchoolReport() throws InterruptedException, IOException
	{
		//3) Click on Search button & Verify the District Wise School Report.

		UTIL.click(driver, SEARCH_XPATH, "Clicked On Search");
		
		Thread.sleep(3000);
		
		List<String> list = new ArrayList<String>();
		list=UTIL.getElements(driver, DISTRICT_WISE_SCHOOL_XPATH, "District Wise School Report");
		System.out.println("The District Wise School Report is::  " +list );
	
	}

	//4)Verify the Export to xlsx is present
	
	public static void exportToXlsxIsPresent() throws IOException
	{
		UTIL.isDisplayed(driver, EXPORT_xlsx_XPATH, "Export To Xls File");
	}

	//5 Verify the #SL, District, Total No. of school, Pre Primary,Primary, Upper Primary, secondary and Higher Secondary row is present.

	public static void slDistrictTotalnoOfSchoolPrimaryUpperPrimarySecondaryHigherSecondaryRowIsPresent() throws IOException
	{
		UTIL.getText(driver, DISTRICT_REPORT_TABLE_HEAD_XPATH, "District Heading");
		UTIL.isDisplayed(driver, DISTRICT_REPORT_TABLE_HEAD_XPATH, "District Heading");
	
	}


	//6) Also verify the list the district and print one by one.

	public static void verifyTheListTheDistrictAndPrintOneByOne()
	{
		List<String> list=new ArrayList<String>();
		list=UTIL.getElements(driver, DISTRICT_COLUMN_XPATH, "District Column");
		System.out.println("The District Is::: " +list);
	}


	//7)	Verify the total number record and validate the total records.

	public static void totalNumberOfRecordAndValdateTheTotalRecord()
	{
		List<String> list=new ArrayList<String>();
		list=UTIL.getElements(driver, TOTAL_RECORD_XPATH, "Total Record");
		System.out.println("The Total Is::: " +list);
	}


}
