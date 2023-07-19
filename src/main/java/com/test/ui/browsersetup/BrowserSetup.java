package com.test.ui.browsersetup;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.test.ui.customlistner.CustomListnerForScreenshort;
import com.test.ui.excel.dataread.ExcelData;
import com.test.ui.helper.CommonUtil;
import com.test.ui.properties.declared.BrokenLinkProperties;


@Listeners(CustomListnerForScreenshort.class)
public class BrowserSetup {

	public static CommonUtil UTIL = new CommonUtil();
	public static ExcelData FROM_EXCEL_DATA = new ExcelData();
	public static BrokenLinkProperties BRLP = new BrokenLinkProperties();
	
	//log4j log file
	public static Logger log = Logger.getLogger("");

	//Extent Report
	public static ExtentReports report;   //
	public static ExtentTest logger;
	


	public static WebDriver driver;
	public static String URL = "https://evidyavahini.jharkhand.gov.in/";
	public static String Flipkart_URL = "https://www.flipkart.com/";
	
	//public static String CHROME_EXE_FILE_PATH = "sourcefile\\chromedriverExe\\chromedriver.exe";
	public static String CHROME_EXE_FILE_PATH = "sourcefile\\ChromeDriverExe\\chromedriver.exe";
	public static String FIREFOX_EXE_FILE_PATH= "sourcefile\\firefoxdriverExe\\geckodriver.exe";
	public static String IE_EXE_FILE_PATH= "sourcefile\\IEdriverExe\\IEDriverServer.exe";
	
	public static String PORTAL_LOGIN_BUTTON_XPATH="//a[@class='portal-login-btn']";
	public static String SELECT_USERTYPE_XPATH="//select[@id='selUserType']";
	public static String USERNAME_XPATH = "//input[@id='userId']";
	public static String PASSWORD_XPATH = "//input[@id='password']";
	public static String MATH_CAPTCHA_XPATH="//input[@id='mathcaptcha']";
	public static String SIGNIN_XPATH="//button[@id='btnSubmit']";
	public static String INPUT_USERNAME = "df_ramgarh";
	public static String INPUT_PASSWORD = "Sozi@8989";
	public static String browser = "chrome";
	
	
	@BeforeSuite
	public static void setUpSuit() throws IOException
	{
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir") +"/extentReports/AutomationReport_" +UTIL.getCurrentDateTime() +".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		extent.config().setDocumentTitle("welcome");
		extent.config().setReportName("dgfhgfhgfhgfhjg");
		

	}

	@BeforeClass
	public static void launchBrowser() throws  IOException
	{
		logger=report.createTest("Launch Browser");
		logger.info("Browser >> Validation.>>CHROME>>FIREFOX>>IE");

		if(browser.equalsIgnoreCase("chrome"))
		{
            //System.setProperty("webdriver.chrome.silentOutput", "true");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty("webdriver.chrome.driver", CHROME_EXE_FILE_PATH);
			driver=new ChromeDriver();
			logger.pass("PASS Chrome Browser");
		}

		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.silentOutput", "true");
			System.setProperty("webdriver.gecko.driver", FIREFOX_EXE_FILE_PATH);
			driver=new FirefoxDriver();
			logger.pass("PASS Firefox Browser");
		}

		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.silentOutput", "true");
			System.setProperty("webdriver.ie.driver", IE_EXE_FILE_PATH);
			driver=new InternetExplorerDriver();
			logger.pass("PASS IE Browser");
		}


		logger.info("URl OF EVV >> https://evidyavahini.jharkhand.gov.in");
		driver.get(Flipkart_URL);
		logger.pass("SucessfullY PASS the Url");
   
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
/*
		logger.info("Click on PORTAL_LOGIN_BUTTON");
		UTIL.click(driver, PORTAL_LOGIN_BUTTON_XPATH, "PORTAL LOGIN BUTTON FIELD");
		logger.pass("PASS PORTAL_LOGIN_BUTTON "); 

		logger.info("Select User Type");
		UTIL.selectValueFromVisibleText(driver, SELECT_USERTYPE_XPATH, "OFFICER", "SELECT USER TYPE FIELD");
		logger.pass("PASS selectValueFromVisibleText");

		logger.info("Get the Data Username && Password From Excel");
		String username=FROM_EXCEL_DATA.getCellValue("EvvLogin", 4, 0);
		String password=FROM_EXCEL_DATA.getCellValue("EvvLogin", 4, 1);


		logger.info("EnterData UserName && Password");
		UTIL.enterData(driver, USERNAME_XPATH, username, "USER NAME Field");
		UTIL.enterData(driver, PASSWORD_XPATH, password, "PASSWORD Field");
		logger.pass("PASS Both UserName & Password");
		//Enter calculated value


		logger.info("Enter The calculated Value");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("***********Enter Calculated Value***********");
		String calculatedValue=sc.nextLine();
		UTIL.enterData(driver, MATH_CAPTCHA_XPATH, calculatedValue, "MATH CAPTCH CALCULATED VALUE FIELD");
		logger.pass("PASS MATH_CAPTCHA Calculated Value ");

		//Click On SignIn
		UTIL.click(driver, SIGNIN_XPATH, "SIGNIN FIELD");
		logger.pass("PASS SIGNIN_BUTTON ");
      */  
	}

	@AfterClass
	public static void closeBrowser() throws IOException {
		logger = report.createTest("Close browser");
		logger.info("Sucessfully Completed");
		//UTIL.close(driver);
		System.out.println("Successfully closed browser !!!");
		//
		report.flush();	//this is used for to generate the reports after all executions.
	}

}





