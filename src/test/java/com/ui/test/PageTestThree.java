package com.ui.test;
import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.test.ui.browsersetup.BrowserSetup;
import com.test.ui.customlistner.CustomListnerForScreenshort;
import com.ui.page.PageThree;


@Listeners(CustomListnerForScreenshort.class)
public class PageTestThree extends BrowserSetup
{
	//static Logger logger = LogManager.getLogger(PageTestThree.class);
	public static PageThree Three=new PageThree();


	@Test
	public static void numberOfGovtSchools() throws IOException
	{   
		System.out.println("Start the working on TestCase 3");
		Three.clickOnNumberOfGovtSchools();
		Three.verifyCalFaqNotifictaionSettingLogout();
		Three.schoolReportStudentTransferReportMergeSchoolReport();
		Three.allReportPresentPrintIconPresent();
		Three.verifyDistrictBlockClusterDropdownPresent();
		Three.validateDistrictDropdownDisable();
		Three.searchHideButtonPresent();
		Three.districtWiseReportIsPresent();
		Three.searchButtonIsWorkingOrNotVerifyTheSearchedResult();
		System.out.println("Finish the working on TestCase 3");

	}

}
