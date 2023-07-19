package com.test.ui.properties.declared;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinkProperties {

	public static String brokenLink(WebDriver driver,String url)
	{

		try {

			//Collect all the links from the webpage. All the links are associated with the Tag ‘a‘.
			List<WebElement> list=driver.findElements(By.tagName("a"));

			//size count of link
			System.out.println(list.size());

			for(int i = 0; i < list.size();  i++)
			{
				//Create a list of type WebElement to store all the Link elements in to it.
				WebElement element = list.get(i);
				url = element.getAttribute("href");

				verifyLink(url);
			}
		} 
		catch (Exception e)
		{

			e.printStackTrace();
		}

		return url;


	}

	public static void verifyLink(String urlLink)
	{

		try 
		{
			//URL Class -create the object of URL Class-(i.e - link)
			URL link = new URL(urlLink);
		

			//create a connection using URL object(i.e - link)
			HttpURLConnection httpConn = (HttpURLConnection) link .openConnection();

			//Set the timeOut for 3 seconds
			httpConn.setConnectTimeout(3000);

			//httpConn using connect() method
			httpConn.connect();

			//Using getResponseCode() to get response code
			if(httpConn.getResponseCode() == 200)
			{
				System.out.println(urlLink   + "_"  +httpConn.getResponseMessage());

			}

			if(httpConn.getResponseCode() == 404)
			{
				System.out.println(urlLink  +"_"  +httpConn.getResponseMessage());
			}
		}                  


		catch (Exception e)
		{

			System.out.println(e.getMessage());
		}

	}


}
