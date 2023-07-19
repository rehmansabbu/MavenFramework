package com.ui.page;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.test.ui.browsersetup.BrowserSetup;

public class PageTwo extends BrowserSetup {

	public static String HOME_XPATH=  "//span[contains(text(),'Home')]";
	public static String HomeLINK_XPATH = "//li[@class='dashbrd active']//a";

	public static String USER_MANNAGEMENT_XPATH="//span[contains(text(),'User Management')]";
	public static String UserManagementImageIcon_XPATH="//i[@class='icon-user_management usermanagement']";
	public static String ManageUser_XPATH= "//a[contains(text(),'Manage User')]";
	public static String ManageUser_LINK_XPATH= "//li[@class='active arrow-up']//ul[@class='submenu']//li[1]//a";
	public static String ManageProfile_XPATH="//a[contains(text(),'Manage Profile')]";
	public static String ManageProfile_LINK_XPATH="//li[@class='active arrow-up']//ul[@class='submenu']//li[2]//a";

	public static String ManageSchool_XPATH="//span[contains(text(),'Manage School')]";
	public static String ManageSchoolIcon_XPATH="//i[@class='icon-manage_school manageschool']";
	public static String ViewUpdateSchool_XPATH="//a[contains(text(),'View-Update School')]";
	public static String ViewUpdateSchool_LINK_XPATH="//li[@class='active arrow-up']//li[1]//a";
	public static String SchoolMis_XPATH="//a[contains(text(),'School MIS')]";
	public static String SchoolMis_LINK_XPATH="//li[@class='active arrow-up']//li[2]//a";

	public static String TeacherActivity_Xpath="//span[contains(text(),'Teacher Activity')]";
	public static String TeacherActivity_ICON_Xpath="//i[@class='icon-teacher_activity teacheractivity']";
	public static String RegistrationViewUpdate_Xpath="//a[contains(text(),'Registration- View-Update')]";
	public static String RegistrationViewUpdate_LINK_Xpath="//li[@class='active arrow-up']//li[1]//a";
	public static String DetailedProfileUpdate_Xpath="//a[contains(text(),'Detailed Profile Update')]";
	public static String DetailedProfileUpdate_LINK_Xpath="//li[@class='active arrow-up']//li[2]//a";
	public static String UpdateServiceStatus_Xpath="//a[contains(text(),'Update Service Status')]";
	public static String UpdateServiceStatus_LINK_Xpath="//li[@class='active arrow-up']//li[3]//a";
	public static String TeacherMis_Xpath="//a[contains(text(),'Teacher MIS')]";
	public static String TeacherMis_LINK_Xpath="//li[@class='active arrow-up']//li[4]//a";

	public static String StudentActivity_XPATH="//span[contains(text(),'Student Activity')]";
	public static String StudentActivity_ICON_XPATH="//i[@class='icon-student_activity studentactivity']";
	public static String StudentProgression_XPATH="//a[contains(text(),'Student Progression')]";
	public static String StudentProgression_LINK_XPATH="//li[@class='active arrow-up']//li[1]//a";
	public static String ViewRegisterStudents_XPATH="//a[contains(text(),'View-Register Students')]";
	public static String ViewRegisterStudents_LINK_XPATH="//li[@class='active arrow-up']//li[2]//a";
	public static String BulkUpload_XPATH="//a[contains(text(),'Bulk Upload')]";
	public static String BulkUpload_LINK_XPATH="//li[@class='active arrow-up']//li[3]//a";
	public static String StudentMis_XPATH="//a[contains(text(),'Student MIS')]";
	public static String StudentMis_LINK_XPATH="//li[@class='active arrow-up']//li[4]//a";
	public static String SchoolUnfrezeMis_XPATH="//a[contains(text(),'School Un-freeze MIS')]";
	public static String SchoolUnfrezeMis_LINK_XPATH="//li[@class='active arrow-up']//li[5]//a";

	public static String LearningTrackingFormat_XPATH="//span[contains(text(),'Learning Tracking Format')]";
	public static String LearningTrackingFormat_ICON_XPATH="//i[@class='icon-learning_level_monitoring learninglevel']";
	public static String ManageTopic_XPATH="//a[contains(text(),'Manage Topic')]";
	public static String ManageTopic_LINK_XPATH="//li[@class='active arrow-up']//li[1]//a";
	public static String ManageGroups_XPATH="//a[contains(text(),'Manage Groups')]";
	public static String ManageGroups_LINK_XPATH="//li[@class='active arrow-up']//li[2]//a";
	public static String ManageCompetency_XPATH="//a[contains(text(),'Manage Competency')]";
	public static String ManageCompetency_LINK_XPATH="//li[@class='active arrow-up']//li[3]//a";
	public static String LTF_MIS_XPATH="//a[contains(text(),'LTF MIS')]";
	public static String LTF_MIS_LINK_XPATH="//li[@class='active arrow-up']//li[4]//a";

	public static String Monitoring_XPATH="//span[contains(text(),'Monitoring')]";
	public static String Monitoring_ICON_XPATH="//i[@class='fa fa-bar-chart monitoring']";
	public static String Monitoring_Question_XPATH="//a[contains(text(),'Monitoring Question')]";
	public static String Monitoring_Question_LINK_XPATH="//li[@class='active arrow-up']//li[1]//a";
	public static String Monitoring_MIS_XPATH="//a[contains(text(),'Monitoring MIS')]";
	public static String Monitoring_MIS_LINK_XPATH="//li[@class='active arrow-up']//li[2]//a";

	public static String Certification_XPATH="//span[contains(text(),'Certification')]";
	public static String Certification_ICON_XPATH="//i[@class='fa fa-certificate certi']";
	public static String Certification_MIS_XPATH="//a[contains(text(),'Certification MIS')]";
	public static String Certification_MIS_LINK_XPATH="//li[@class='active arrow-up']//li//a";


	public static String MidDayMeal_Xpath="//span[contains(text(),'Mid-day Meal')]";
	public static String MidDayMeal_ICON_Xpath="//i[@class='fa fa-cutlery mdm']";
	public static String DailyMenu_Xpath="//a[contains(text(),'Daily Menu')]";
	public static String DailyMenu_LINK_Xpath="//li[@class='active arrow-up']//li[1]//a";
	public static String StudentExpenses_Xpath="//a[contains(text(),'Student Expenses')]";
	public static String StudentExpenses_LINK_Xpath="//li[@class='active arrow-up']//li[2]//a";
	public static String StockReport_Xpath="//a[contains(text(),'Stock Report')]";
	public static String StockReport_LINK_Xpath="//li[@class='active arrow-up']//li[3]//a";
	public static String DailyConsumptionReport_Xpath="//a[contains(text(),'Daily Consumption Report')]";
	public static String DailyConsumptionReport_LINK_Xpath="//li[@class='active arrow-up']//li[4]//a";
	public static String CookDetail_Xpath="//a[contains(text(),'Cook Details')]";
	public static String CookDetails_LINK_Xpath="//li[@class='active arrow-up']//li[5]//a";
	public static String MDM_MIS_Xpath="//a[contains(text(),'MDM MIS')]";
	public static String MDM_MIS_LINK_Xpath="//li[@class='active arrow-up']//li[6]//a";
	public static String UpdateOpeningStock_Xpath="//a[contains(text(),'Update Opening Stock')]";
	public static String UpdateOpeningStock_LINK_Xpath="//li[@class='active arrow-up']//li[7]//a";

	public static String GrievanceRedressal_XPATH="//span[contains(text(),'Grievance Redressal')]";
	public static String GrievanceRedressal_ICON_XPATH="//i[@class='icon-grievance_redressal grievance']";
	public static String RaiseAttendGrievance_XPATH="//a[contains(text(),'Raise-Attend Grievance')]";
	public static String RaiseAttendGrievance_LINK_XPATH="//li[@class='active arrow-up']//li[1]//a";
	public static String GrievanceMIS_XPATH="//a[contains(text(),'Grievance MIS')]";
	public static String GrievanceMIS_LINK_XPATH="//li[@class='active arrow-up']//li[2]//a";

	public static String Notifications_XPATH="//span[contains(text(),'Notifications')]";
	public static String Notifications_ICON_XPATH="//i[@class='icon-notification notification']";
	public static String CreateNotifications_XPATH="//a[contains(text(),'Create Notification')]";
	public static String CreateNotifications_LINK_XPATH="//li[@class='active arrow-up']//li[1]//a";
	public static String Inbox_XPATH="//a[contains(text(),'Inbox')]";
	public static String Inbox_LINK_XPATH="//li[@class='active arrow-up']//li[2]//a";

	public static String FAQ_XPATH="//span[contains(text(),'FAQ')]";
	public static String FAQ_ICON_XPATH="//i[@class='icon-faq faq']";
	public static String FAQ_SUBMENU_LINK_XPATH="//li[@class='active arrow-up']//li//a";
     

	//2) Verify the Home link with text which is appear on the application which in left side of the application.
	public static void homeLink() throws IOException
	{
		UTIL.isDisplayed(driver, HOME_XPATH, "Home Field");

		//LINK
		String expected=UTIL.getAttribute(driver , HomeLINK_XPATH , "href", "Home Attribute link value");
		String actual="https://evidyavahini.jharkhand.gov.in/dashboard";
		UTIL.labelTextValidation(expected, actual, "Link matched");		

	}

	//3) Verify the User Management link with text and image also verify the Manage User and Manage Profile with text and image.
	public  static void userManagement() throws InterruptedException, IOException
	{

		UTIL.getText(driver, USER_MANNAGEMENT_XPATH , "User Management Text ");

		UTIL.isDisplayed(driver,UserManagementImageIcon_XPATH, "User Management Icon");

		UTIL.click(driver, USER_MANNAGEMENT_XPATH, "Clicked on UserManagement");

		//also verify the Manage User and Manage Profile with text and image

		UTIL.getText(driver , ManageUser_XPATH , "Manage User");
		UTIL.getAttribute(driver, ManageUser_LINK_XPATH , "href", "Manage User");

		UTIL.getText(driver, ManageProfile_XPATH, "Manage Profile");
		UTIL.getAttribute(driver , ManageProfile_LINK_XPATH , "href", "Manage Profile");

		Thread.sleep(3000);

		UTIL.click(driver, USER_MANNAGEMENT_XPATH, "Clicked on UserManagement");

	}

	//4)Verify the Manage School link with link text  also view update school and School MIS with text.
	public static void manageSchool() throws InterruptedException, IOException
	{
		UTIL.getText(driver, ManageSchool_XPATH, "Manage School");
		UTIL.isDisplayed(driver, ManageSchoolIcon_XPATH, "Manage School Icon");
		UTIL.click(driver, ManageSchool_XPATH, "Clicked on Manage school");

		UTIL.getText(driver, ViewUpdateSchool_XPATH, "View Update School");
		UTIL.getAttribute(driver, ViewUpdateSchool_LINK_XPATH, "href", "View update school");

		UTIL.getText(driver, SchoolMis_XPATH, "School MIS");
		UTIL.getAttribute(driver, SchoolMis_LINK_XPATH, "href", "School MIS LINK ");


		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		UTIL.click(driver, ManageSchool_XPATH, "Clicked on Manage school");
	}

	//5) Verify the Teacher Activity with link text and image also Registration View Update, 
	// Detailed profile update, Update Service Status, Teacher MIS with link text.
	public static void teacherActivity() throws InterruptedException, IOException
	{
		UTIL.getText(driver, TeacherActivity_Xpath, "Teacher Activity");
		UTIL.isDisplayed(driver, TeacherActivity_ICON_Xpath, "Teacher Activity ICON");

		UTIL.click(driver, TeacherActivity_Xpath, "Clicked on Teacher Activity");

		UTIL.getText(driver, RegistrationViewUpdate_Xpath, "Registration View Update");
		UTIL.getAttribute(driver, RegistrationViewUpdate_LINK_Xpath, "href", "Registration View Update link");

		UTIL.getText(driver, DetailedProfileUpdate_Xpath, "Detailed Profile Update");
		UTIL.getAttribute(driver, DetailedProfileUpdate_LINK_Xpath, "href", "Detailed Profile Update");

		UTIL.getText(driver, UpdateServiceStatus_Xpath, "Update service Status");
		UTIL.getAttribute(driver, UpdateServiceStatus_LINK_Xpath, "href", "Update Service Status Link");

		UTIL.getText(driver, TeacherMis_Xpath, "Teacher MIS");
		UTIL.getAttribute(driver, TeacherMis_LINK_Xpath, "href", "Teacher MIS Link");


		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		UTIL.click(driver, TeacherActivity_Xpath, "Clicked on Teacher Activity");
	}


	//6) Verify Student Activity with link text and image also verify the Student Progression,View register Student,Bulk Upload 
	//Student MIS,school unfreze MIS link text

	public static void studentActivity() throws InterruptedException, IOException
	{

		UTIL.getText(driver, StudentActivity_XPATH, "Student Activity");
		UTIL.isDisplayed(driver, StudentActivity_ICON_XPATH, "Student Activity Icon");

		UTIL.click(driver, StudentActivity_XPATH, "Clicked on Student Activity");

		UTIL.getText(driver, StudentProgression_XPATH, "Student Progression");
		UTIL.getAttribute(driver, StudentProgression_LINK_XPATH, "href", "Student Progression Link");

		UTIL.getText(driver, ViewRegisterStudents_XPATH, "View Register Student");
		UTIL.getAttribute(driver, ViewRegisterStudents_LINK_XPATH, "href", "View Register Student Link");

		UTIL.getText(driver, BulkUpload_XPATH, "Bulk Upload");
		UTIL.getAttribute(driver, BulkUpload_LINK_XPATH, "href", "Bulk Upload Link");

		UTIL.getText(driver, StudentMis_XPATH, "Student MIS");
		UTIL.getAttribute(driver, StudentMis_LINK_XPATH, "href", "Student MIS Link");

		UTIL.getText(driver, SchoolUnfrezeMis_XPATH, "School Unfreze MIS");
		UTIL.getAttribute(driver, SchoolUnfrezeMis_LINK_XPATH, "href", "School Unfreze MIS LINK");

		Thread.sleep(3000);
		UTIL.click(driver, StudentActivity_XPATH, "Clicked on Student Activity");	

	}

	//7)Verify the Learning Tracking Format link text with image and also verify the Manage Topic, manage Group
	//Manage Competency and LTF MIS Report link text.

	public static void learningTrackingFormat() throws InterruptedException, IOException
	{
		UTIL.getText(driver, LearningTrackingFormat_XPATH, "Learning Tracking format");
		UTIL.isDisplayed(driver, LearningTrackingFormat_ICON_XPATH, "Learning Tracking Format ICON");

		UTIL.click(driver, LearningTrackingFormat_XPATH, "Clicked on Learning Tracking Format");

		UTIL.getText(driver, ManageTopic_XPATH, "Manage Topic");
		UTIL.getAttribute(driver, ManageTopic_LINK_XPATH, "href", "Manage Topic Link");

		UTIL.getText(driver, ManageGroups_XPATH, "Manage Group");
		UTIL.getAttribute(driver, ManageGroups_LINK_XPATH, "href", "Manage Group Link");

		UTIL.getText(driver, ManageCompetency_XPATH, "Manage competency");
		UTIL.getAttribute(driver, ManageCompetency_LINK_XPATH, "href", "Manage Competency Link");

		UTIL.getText(driver, LTF_MIS_XPATH, "LTF MIS");
		UTIL.getAttribute(driver, LTF_MIS_LINK_XPATH, "href", "LTF MIS LINK");

		Thread.sleep(3000);

		UTIL.click(driver, LearningTrackingFormat_XPATH, "Clicked on Learning Trakicng Format");
	}



	// 8) Verify the Monitoring link text with image also verify the Monitoring Question and Monitoring MIS with link text.

	public static void monitoring() throws InterruptedException, IOException
	{
		UTIL.getText(driver, Monitoring_XPATH, "Monitoring");
		UTIL.isDisplayed(driver, Monitoring_ICON_XPATH, "Monitoring ICON");

		UTIL.click(driver, Monitoring_XPATH, "Clicked on Monitoring");

		UTIL.getText(driver, Monitoring_Question_XPATH, "Monitoring Questions");
		UTIL.getAttribute(driver, Monitoring_Question_LINK_XPATH, "href", "Monitoring Question Link");

		UTIL.getText(driver, Monitoring_MIS_XPATH, "Monitoring MIS");
		UTIL.getAttribute(driver, Monitoring_MIS_LINK_XPATH, "href", "Monitoring MIS LINK");

		Thread.sleep(3000);
		UTIL.click(driver, Monitoring_XPATH, "Clicked on Monitoring");

	}

	//9) Verify the Certification link text with image also verify the Certification MIS link text.

	public static void certification() throws InterruptedException, IOException
	{
		// certification_link
		UTIL.getText(driver, Certification_XPATH, "Certification");
		UTIL.isDisplayed(driver, Certification_ICON_XPATH, "Certification Icon");

		UTIL.click(driver, Certification_XPATH, "Clicked On Certification");

		UTIL.getText(driver, Certification_MIS_XPATH, "Certification");
		UTIL.getAttribute(driver, Certification_MIS_LINK_XPATH, "href" , "Certification Link");

		Thread.sleep(3000);
		UTIL.click(driver, Certification_XPATH, "Clicked On Certification");
	}

	//10)	Verify the Mid-Day-Meal link text with image also verify the Daily Menu, Student Expenses, Stock Report, Daily Consumption
	//and Cook detail, Mdm Mis, And update opening stock link text with link.

	public static void midDayMeal() throws InterruptedException, IOException
	{
		//Mid-Day-Meal link

		UTIL.getText(driver, MidDayMeal_Xpath, "Mid Day Meal");
		UTIL.isDisplayed(driver, MidDayMeal_ICON_Xpath, "Mid Day Meal Icon");

		UTIL.click(driver, MidDayMeal_Xpath, "Clicked on Mid Day Meal");

		UTIL.getText(driver, DailyMenu_Xpath, "Daily Menu");
		UTIL.getAttribute(driver, DailyMenu_LINK_Xpath, "href", "Daily Menu Link");

		UTIL.getText(driver, StudentExpenses_Xpath, "Student Expense");
		UTIL.getAttribute(driver, StudentExpenses_LINK_Xpath, "href", "Student Expense Link");

		UTIL.getText(driver, StockReport_Xpath, "Stock Report");
		UTIL.getAttribute(driver, StockReport_LINK_Xpath, "href", "Stock Report Link");

		UTIL.getText(driver, DailyConsumptionReport_Xpath, "Daily Consumption Report");
		UTIL.getAttribute(driver, DailyConsumptionReport_LINK_Xpath, "href", "Daily Consumption Report LinK");

		UTIL.getText(driver, CookDetail_Xpath, "Cook Detail");
		UTIL.getAttribute(driver, CookDetails_LINK_Xpath, "href", "Cook Detail Link");

		UTIL.getText(driver, MDM_MIS_Xpath, "MDM MIS");
		UTIL.getAttribute(driver, MDM_MIS_LINK_Xpath, "href", "MDM MIS LINK");

		UTIL.getText(driver, UpdateOpeningStock_Xpath, "Update opening stock");
		UTIL.getAttribute(driver, UpdateOpeningStock_LINK_Xpath, "href", "Update opening stock link");

		Thread.sleep(3000);
		UTIL.click(driver, MidDayMeal_Xpath, "Clicked On Mid Day Meal");

	}

	//11) Verify the Grievance Redressal link text with image and also verify the Manage Grievance and Grievance MIS link text with link.  
	public static void grievanceRedressal() throws InterruptedException, IOException
	{
		UTIL.getText(driver, GrievanceRedressal_XPATH, "Grievance Redressal");
		UTIL.isDisplayed(driver, GrievanceRedressal_ICON_XPATH, "Grievance Redressal ICON");

		UTIL.click(driver, GrievanceRedressal_XPATH, "Clicked On Grievance Redressal");

		UTIL.getText(driver, RaiseAttendGrievance_XPATH, "Raise Attend Grievance");
		UTIL.getAttribute(driver, RaiseAttendGrievance_LINK_XPATH, "href", "Raise Attend Grievance_LINK");

		UTIL.getText(driver, GrievanceMIS_XPATH, "Grievance MIS");
		UTIL.getAttribute(driver, GrievanceMIS_LINK_XPATH, "href", "Grievance MIS_LINK");

		Thread.sleep(3000);
		UTIL.click(driver, GrievanceRedressal_XPATH, "Clicked On Grievance Redressal");

	}


	// 12) Verify the Notifications link text  with image and also verify the Manage Notification and Notification inbox link text with link.
	public static void notifications() throws InterruptedException, IOException
	{
		//Notifications link

		UTIL.getText(driver, Notifications_XPATH, "Notification");
		UTIL.isDisplayed(driver, Notifications_ICON_XPATH, "Notifications ICON");

		UTIL.click(driver, Notifications_XPATH, "Notification");

		UTIL.getText(driver, CreateNotifications_XPATH, "Create Notifications");
		UTIL.getAttribute(driver, CreateNotifications_LINK_XPATH, "href", "Create Notifications LINK");

		UTIL.getText(driver, Inbox_XPATH, "Inbox");
		UTIL.getAttribute(driver, Inbox_LINK_XPATH, "href", "Inbox Link");

		Thread.sleep(3000);
		UTIL.click(driver, Notifications_XPATH, "Notification");

	}

	//13)Verify the FAQ link text with image and also verify the FAQ link text with link.
	public static void faq() throws InterruptedException, IOException
	{
		UTIL.getText(driver, FAQ_XPATH, "FAQ");
		UTIL.isDisplayed(driver, FAQ_ICON_XPATH, "FAQ ICON");

		//Thread.sleep(3000);

	}


}
