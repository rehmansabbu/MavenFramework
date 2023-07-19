package com.ui.test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindow {
	
	public static void main(String[] args) throws InterruptedException 
		
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM WITH JAVA PRACTICE AGAIN\\MavenFramework\\sourcefile\\ChromeDriverExe\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	// Click On New Seperate Windows
	//WebElement Click_Button=driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]"));
	WebElement Click_Button=driver.findElement(By.xpath("//a[contains(text(),'Open Seperate Multiple Windows')]"));
	
	Click_Button.click();
	
	//Click On Button
	//driver.findElement(By.xpath("//button[@class='btn btn-primary")).click();
	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")).click();
	
	// This way we can handle newly window & tabed window
	
	Set<String> windowid=driver.getWindowHandles();
	Iterator<String>itr=windowid.iterator();
	
	String parent_window=itr.next();  
	System.out.println("Parent Window is "+driver.getCurrentUrl());
	String child_window=itr.next();
	driver.switchTo().window(child_window);
	
	System.out.println("The child url is  "+driver.getCurrentUrl());
	
	Thread.sleep(2000);
	
	driver.close();
	
	driver.switchTo().window(parent_window);
	
	System.out.println("Main Window Titel is" +driver.getTitle());

}
}