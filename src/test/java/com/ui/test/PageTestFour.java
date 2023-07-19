package com.ui.test;
import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.test.ui.browsersetup.BrowserSetup;
import com.test.ui.customlistner.CustomListnerForScreenshort;
import com.ui.page.PageFour;


@Listeners(CustomListnerForScreenshort.class)
public class PageTestFour extends BrowserSetup
{
	
	public static PageFour Four=new PageFour();
	
	@Test
	public static void clickedOnNumberOfGovtSchools() throws InterruptedException, IOException
	{
		System.out.println("Start the working on TestCase 4");
		
		log.trace("This is an Trace message");
		log.info("This is an inforamtion message");
		log.warn("This is warning message");
		log.error("This is an error message");
		log.fatal("This is an fatal message");
		
		//Four.clickOnNumberOfGovtSchools();
		//Four.districtWiseSchoolReport();
		Four.exportToXlsxIsPresent();
		Four.slDistrictTotalnoOfSchoolPrimaryUpperPrimarySecondaryHigherSecondaryRowIsPresent();
		Four.verifyTheListTheDistrictAndPrintOneByOne();
		Four.totalNumberOfRecordAndValdateTheTotalRecord();
		System.out.println("Finish the working on TestCase 4");
	}
	
	
	

}
