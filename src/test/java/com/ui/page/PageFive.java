package com.ui.page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.test.ui.browsersetup.BrowserSetup;



public class PageFive extends BrowserSetup {

	public static String clickOnNumberOfTeachers_Xpath="//h1[@class='teacher_cnt']";

	public static String viewTeacherMIS_Xpath="//h3[@id='titleHeader']";
	public static String homeLink_Xpath="//i[@class='icon-home']";
	public static String teacherActivity_Xpath="//li[@id='sFL']";
	public static String teacherMIS_Xpath="//li[@id='sSL']";
	public static String serviceBook_Xpath="//a[contains(text(),'Service Book')]";
	public static String teacherAttendence_Xpath="//a[@class='nav-item nav-link active']";
	public static String allReport_Xpath="//a[@class='nav-item nav-link bg-primary allreport']";
	public static String printIcon_Xpath="//i[contains(@class,'fa-print')]";

	public static String clickOnServiceBook_Xpath="//a[contains(text(),'Service Book')]";
	public static String districtDisabled_Xpath= "//select[@id='selDist']";

	public static String block_Xpath="//select[@id='selBlock']";
	public static String cluster_Xpath="//select[@id='selCluster']";
	public static String school_Xpath="//select[@id='selSchool']";
	public static String searchClick_Xpath="//button[contains(@class,'btn btn-primary')]";
	public static String printTheReport_Xpath="bb";

	public static String hideButton_Xpath="//a[contains(@class,'searchopen')]";

	public static String TeacherId_Xpath="//input[@id='txtTchId']";
	public static String reportThroughTeacherId_Xpath="//div[@id='datatable_wrapper']/table/tbody/tr";
	

	public static String natureOfAppointment_Xpath="//select[@id='selNatureOfAppointment']";

	public static String excelIcon_Xpath="//button[@class='dt-button buttons-excel buttons-html5']//span//img";

	public static String statusWise_Xpath="//select[@id='StatusId']";
	public static String statusWiseReport_Xpath="//div[@id='datatable_wrapper']/table/tbody";

	public static String clickOnTeacherAttendence_Xpath="//a[@class='nav-item nav-link active']";
	public static String dateSelect_Xpath="//input[@id='attendanceDate']";
	public static String managementSelect_Xpath="//select[@id='selManagement']";
	public static String TeacherAttendenceReport_Xpath="//div[@id='TeacherAttendenceReport']//table/tbody/tr/td";

	public static String back_Xpath="//button[@id='backBtn']";
	public static String exportToXlsx_Xpath="//button[@class='btn btn-default xlsx']";

	public static String clickOnAllReport_Xpath="//a[@class='nav-item nav-link bg-primary allreport']";


	//1) Click on Number Of Teachers and Verify the Teacher MIS Summary & page.

	public static void clickOnNumberOfTeachers() throws IOException
	{
		UTIL.click(driver, clickOnNumberOfTeachers_Xpath, "clickOnNumberOfTeachers");
		UTIL.urlValidation(driver, "https://evidyavahini.jharkhand.gov.in/Teacher/TeacherTransfer/teacherSummary");

	}

	//2)	 Verify  - View Teacher MIS , Home Link , Teacher Activity , Teacher MIS , 
	//Service Book , Teacher Attendance , All Report , print icon
	public static void verifyViewTeacherMisHomeTeacherActivityTeacherMisServiceBookTeacherAttendanceAllReportPrintIcon() throws IOException
	{
		UTIL.getText(driver, viewTeacherMIS_Xpath, "viewTeacherMIS");
		UTIL.isDisplayed(driver, viewTeacherMIS_Xpath, "viewTeacherMIS");

		UTIL.getText(driver, homeLink_Xpath, "homeLink");
		UTIL.isDisplayed(driver, homeLink_Xpath, "homeLink");

		UTIL.getText(driver, teacherActivity_Xpath, "teacherActivity");
		UTIL.isDisplayed(driver, teacherActivity_Xpath, "teacherActivity");

		UTIL.getText(driver, teacherMIS_Xpath, "teacherMIS");
		UTIL.isDisplayed(driver, teacherMIS_Xpath, "teacherMIS");

		UTIL.getText(driver, serviceBook_Xpath, "serviceBook");
		UTIL.isDisplayed(driver, serviceBook_Xpath, "serviceBook");

		UTIL.getText(driver, teacherAttendence_Xpath, "teacherAttendence");
		UTIL.isDisplayed(driver, teacherAttendence_Xpath, "teacherAttendence");

		UTIL.getText(driver, allReport_Xpath, "allReport");
		UTIL.isDisplayed(driver, allReport_Xpath, "allReport");

		UTIL.getText(driver, printIcon_Xpath, "printIcon");
		UTIL.isDisplayed(driver, printIcon_Xpath, "printIcon");

	}


	//3)Click on Service Book  
	public static void serviceBookVerifyDistricDisabled() throws IOException
	{
		UTIL.click(driver, serviceBook_Xpath, "serviceBook");
		UTIL.urlValidation(driver, "https://evidyavahini.jharkhand.gov.in/Teacher/TeacherTransfer/ServiceBook");
	}

	//4)In service book select  randomally  block , cluster , school  and click on search and print the report.
	public static void inServiceBookSelectBlockClusterSchoolClickOnSearch() throws IOException
	{
		UTIL.selectRandomValue(driver, block_Xpath, "block");
		UTIL.selectRandomValue(driver, cluster_Xpath, "cluster");
		UTIL.selectRandomValue(driver, school_Xpath, "school");

		UTIL.click(driver, searchClick_Xpath, "searchClick");

	}

	//5)	Verify Hide button Is Displayed	
	public static void verifyHideButtonDisplayed() throws IOException
	{
		UTIL.getText(driver, hideButton_Xpath, "HideButton");
		UTIL.isDisplayed(driver, hideButton_Xpath, "hideButton");
	}

	//6)Verify the report by Teacher id ,mobile no and click on search.
	public static void verifyReportByTeacherIDClickOnSearch() throws IOException, InterruptedException
	{
		driver.navigate().back();
		
		UTIL.click(driver, serviceBook_Xpath, "Clicked Service Book");
		
		Thread.sleep(3000);
		
		UTIL.enterData(driver, TeacherId_Xpath , "562718", "Entered Teacher Id");
		
		UTIL.click(driver, searchClick_Xpath, "searchClick");
		
		List<String> list = new ArrayList<String>();
		list=UTIL.getElements(driver, reportThroughTeacherId_Xpath, "Teacher Report");
		 System.out.println("List of values : " +list.toString());


	}
	//7)	Select district and randomly select nature  of Appoinment and click on search and print the report.
	public static void selectNatureOfAppointmentClickOnSearch() throws IOException
	{
		driver.navigate().back();
		UTIL.click(driver, serviceBook_Xpath, "Clicked on serviceBook");
		UTIL.selectRandomValue(driver, natureOfAppointment_Xpath, "natureOfAppointment");
		UTIL.click(driver, searchClick_Xpath, "searchClick");

	}

	//8)	Verify excel icon isdisplayed
	public static void excelIconIsDisplayed() throws IOException
	{
		UTIL.getText(driver, exportToXlsx_Xpath, "Export To Xlsx");
		UTIL.isDisplayed(driver, exportToXlsx_Xpath, "Export To Xlsx");

	}
	
	//9)Select status wise report like-Active,Inactive,freze and unfreze and print by one by statuts wise.
	public static void statusWiseReport() throws IOException
	{
      driver.navigate().back();
      UTIL.click(driver, serviceBook_Xpath, "Service Book");
      UTIL.selectRandomValue(driver, statusWise_Xpath, "Status Wise");
      UTIL.click(driver, searchClick_Xpath, "SearchClick");
      
      List<String> list = new ArrayList<String>();
      list=UTIL.getElements(driver, statusWiseReport_Xpath, "StatusWiseReport");
      System.out.println("List of values : " +list.toString());	
	}
	//10)	Click on Teacher Attendance ,Verify District  ISDISABLED, select date randomly ,
	//choose department of education and click on search ,and print the report on by one.
	public static void clickOnTeacherAttendanceChooseDepartmentOfEducationClickOnSearchPrintReport() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		UTIL.click(driver, teacherAttendence_Xpath, "Teacher Attendence");
		UTIL.isEnabled(driver, districtDisabled_Xpath, "District");
		
		UTIL.selectRandomValue(driver, dateSelect_Xpath, "Date Select");
		UTIL.selectRandomValue(driver,managementSelect_Xpath , "Management Select");
		UTIL.click(driver, searchClick_Xpath, "SearchClick");
		UTIL.getElements(driver, TeacherAttendenceReport_Xpath, "TeacherAttendenceReport");
		
	}
	
	//11)	Verify export to xlsx
	public static void verifyExportToXlsx() throws IOException
	{
       UTIL.getText(driver, exportToXlsx_Xpath, "ExportToXlsx");
       UTIL.isDisplayed(driver, exportToXlsx_Xpath, "ExportToXlsx");
	}
	//12)	Print the result block wise attendance report in detail
	public static void blockWiseAttendanceReport()
	{
      
	}
	//13)	Verify the and print the total  number of teacher,total school,school submitted attendance,
	//total present,total absent
	public static void printAttendanceReport()
	{
      
	}
	//14)	Click on All report and verify sl#,ReportName,Description,View and print in detail one by one.
	public static void clickOnAllReportAndVerify() throws IOException
	{
      UTIL.click(driver, allReport_Xpath, "AllReport");
	}
	//15)	View report verify one by one with link.
	public static void viewReport()
	{

	}























}
