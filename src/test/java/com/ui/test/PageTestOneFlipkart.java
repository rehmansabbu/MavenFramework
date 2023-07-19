package com.ui.test;
import java.io.IOException;
import org.testng.annotations.Test;
import com.test.ui.browsersetup.BrowserSetup;
import com.ui.page.PageOneFlipkart;


public class PageTestOneFlipkart extends BrowserSetup

{
	
	public static PageOneFlipkart p = new  PageOneFlipkart();
		
	@Test(priority = 1)
	public static void flipKartTestPage() throws IOException, InterruptedException
	{
		
		System.out.println("***** Welcome to FlipKart Page *****");
		
		p.flipkartPage();
		
		
	}
	@Test(priority = 2)
	
	public static void Login() throws IOException, InterruptedException
	{
		System.out.println("********* Login ***********");
		
		p.loginFlipkartPage();	
	}
	
	
	
	
	
	
	

}
