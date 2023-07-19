package com.ui.page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.ui.browsersetup.BrowserSetup;


public class PageOneFlipkart extends BrowserSetup
{
	
	
	private static final char[] Enabled = null;
	public static String flipkart_Image_Xpath = "//img[@class='_1e_EAo']";  
	public static String login_Button_Xpath = "//a[@class='_3Ep39l']";
	public static String more_Button_Xpath = "//div[@class='_2aUbKa']";
	public static String cart_Button_Xpath = "//span[contains(text(),'Cart')]";
	
	public static String electronics_Xpath = "//span[contains(text(),'Electronics')]";
	public static String tv_Appliances_Xpath = "//span[contains(text(),'TVs & Appliances')]";
	public static String men_Xpath = "//span[contains(text(),'Men')]";
	public static String women_Xpath = "//span[contains(text(),'Women')]";
	public static String baby_Kids_Xpath = "//span[contains(text(),'Baby & Kids')]";
	public static String home_Furniture_Xpath = "//span[contains(text(),'Home & Furniture')]";
	public static String sports_Books_More_Xpath = "//span[contains(text(),'Sports, Books & More')]";
	public static String flights_Xpath = "//a[contains(text(),'Flights')]";
	public static String offer_Zone_Xpath = "//a[contains(text(),'Offer Zone')]";
	
	public static String jeans_Xpath="//a[contains(text(),'Jeans')]";
	public static String text_FlipkartPresents_Validate_Xpath="//p[contains(text(),'Flipkart presents a comprehensive range of men')]";
	public static String mensJeans_Xpath="//h1[@class='_2yAnYN']";
	public static String MensJeansShowingXpath = "//span[@class='eGD5BM']";
	public static String sortByPopularity_Xpath= "//div[@class='_3ywJNQ']";
	
	public static String popularity_Clicked = "//div[contains(text(),'Popularity')]";
	public static String price_low_high_Clicked = "//div[contains(text(),'Price -- Low to High')]";
	public static String price_High_Low_Clicked = "//div[contains(text(),'Price -- High to Low')]";
	public static String newestFirst_Xpath="//div[@class='_1xHtJz xufquN']";

	// ****LOGIN ****
	
	public static String username_Xpath = "//input[@class='_2zrpKA _1dBPDZ']";
	public static String password_Xpath = "//input[@class='_2zrpKA _3v41xv _1dBPDZ']";
	public static String submit_Xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']";
	public static String SportsShoes_XPATH= "//a[@title='Sport Shoes'][1]";
	
	public static String nameOfShoes_Xpath = "//span[@class='_35KyD6']";
	public static String priceOfShoes_Xpath="//div[@class='_1vC4OE _3qQ9m1']";
	public static String ratingOfShoes_Xpath="//span[@class='_38sUEc']";
	public static String availableOfferOfShoes_Xpath = "//div[@class='_3D89xM']";
	
	public static String deliverTo_Xpath="//span[contains(text(),'Deliver to')]";
	public static String enterDelivery_Pincode_Xpath="//input[@class='_20PCkk']";
	public static String clickOnCheck_Xpath="//span[contains(text(),'Check')]";
	public static String timeOfDelivery_Xpath="//div[@class='_29Zp1s']";
	
	public static String sizeOfShoes_Availabality_Xpath = "//ul[@class='fUBI-_']//li[@class='_3hSwtk _2UBURg']";
	public static String buyNow_Xpath = "//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']";
	
	public static String orderSummary_Xpath="//span[contains(text(),'Order Summary')]";
	public static String orderSummaryDetail_Xpath="//div[@class='_3vIvU_']";
	public static String dateOfOrderSummary_Xpath="//div[@class='bzD9az']";
	public static String continue_Xpath="//button[contains(text(),'CONTINUE')]";
	public static String paymentOption_Xpath="//span[contains(text(),'Payment Options')]";
	
	public static String men_Submenu_List_Bold_Xpath = "//a[@class='_1jkBF2 _2K-jmG -FJR5L']";
	
	
	
	
	public static void flipkartPage() throws IOException, InterruptedException
	{
		   
		    //For popup closing window
			UTIL.click(driver, "//button[@class='_2AkmmA _29YdH8']", " Click on popup window");
			
			//Url validation
			UTIL.urlValidation(driver, "https://www.flipkart.com/");
			
			//verify flipcart image , login button , more , cart.
			UTIL.getAttribute(driver, flipkart_Image_Xpath, "src", "Flipkart Image Link");
			
			// Login Button
			UTIL.isEnabled(driver, login_Button_Xpath, "Login Button");
			
			//More 
			UTIL.isDisplayed(driver, more_Button_Xpath, "More Button");
			
			//Cart
			UTIL.isDisplayed(driver, cart_Button_Xpath, "Cart Button");
			
			
			/*
			 4.Verify the availability of Electronics , TVs &Appliance ,Men 
			
			Women, Baby & Kids,Home & Furniture ,Sport-books & More ,Flights , Offer Zone.
			
			*/
			
			UTIL.getText(driver, electronics_Xpath, "Electronics");
			
			UTIL.getText(driver, tv_Appliances_Xpath, " Tv_Appliances ");
			
			UTIL.getText(driver, men_Xpath, "Men");
			
			UTIL.getText(driver, women_Xpath, "Women");
			
			UTIL.getText(driver, baby_Kids_Xpath, "Baby_Kids");
			
			UTIL.getText(driver, home_Furniture_Xpath, "Home & Furniture");
			
			UTIL.getText(driver, sports_Books_More_Xpath, "sports_Books_More");
			
			UTIL.getText(driver, flights_Xpath, "Flights");
			
			UTIL.getText(driver, offer_Zone_Xpath, "offer_Zone");
			
			
			/*
			
			5.keep on Cursors on Men list will open then Click on jeans & verify the link of the jeans.
			
			*/
			UTIL.moveToElement(driver, men_Xpath, "MouseOverMen");
			
			Thread.sleep(4000);
			
			
			UTIL.click(driver, jeans_Xpath, "Clicked On Jeans");
			//6.verify the Text - "Flipkart presents a comprehensive range"
			
			UTIL.textValidation(driver, text_FlipkartPresents_Validate_Xpath, "Flipkart presents a", "");
			
			// 7.verify the Text - "Men's Jeans(Showing 1 – 40 products of 80,087 products)".
			
			UTIL.getText(driver, mensJeans_Xpath, "Men's Jeans");
			UTIL.getText(driver, MensJeansShowingXpath, "MensJeansShowing");
			
			//8.verify the Text Popularity  , Price - Low to High  , Price - High to low ,Newest First.
			
			UTIL.getText(driver, sortByPopularity_Xpath, "Sorting by popularity");
			
			
			//9.Click on popularity and verify brand of jeans.
			
			UTIL.click(driver, popularity_Clicked, "Clicked On Popularity");
			Thread.sleep(3000);
			
			//10.Click on Price - Low to High & verify brand of jeans.
			UTIL.click(driver, price_low_high_Clicked, "Low to High");
			Thread.sleep(3000);
			
			//11.Click on Price - High to low & verify brand of jeans.
			UTIL.click(driver, price_High_Low_Clicked, "High to Low");
			Thread.sleep(3000);
			
			//12.click on Newest First & verify brand of jeans.
			UTIL.click(driver, newestFirst_Xpath, "Newest");
			
			driver.navigate().back();
			
			
			
	}
	
	@SuppressWarnings("null")
	public static void loginFlipkartPage() throws IOException, InterruptedException
	{
		
		Thread.sleep(3000);
		
		//UTIL.moveToElement(driver, login_Button_Xpath, "Mouse over on Login button");
		
		UTIL.click(driver, login_Button_Xpath, "Clicked On Login Button");
		UTIL.pageLoad(driver);
		
		UTIL.enterData(driver, username_Xpath, "8578905140" , "Enter Username");
		UTIL.pageLoad(driver);
		
		UTIL.enterData(driver, password_Xpath, "zikra_78688", "Enter Password");
		UTIL.pageLoad(driver);
		
		UTIL.click(driver, submit_Xpath, "Clicked On Submit Button");
		
		
		//3)-verify the url after login
		
		UTIL.urlValidation(driver, "https://www.flipkart.com/");
		
	//4)-keep the cursor on Baby & Kids & click on sports shoes.
		Thread.sleep(3000);
		UTIL.moveToElement(driver, baby_Kids_Xpath, "keep the cursor on Baby & Kids");
		
		Thread.sleep(5000);
		
		//UTIL.click(driver, SportsShoes_XPATH, "Clicked on SportsShoes");
		
		UTIL.click(driver, SportsShoes_XPATH, "Clicked On Sport Shoes");
		
		//5)select popularity shoes and verify the item name of shoes and price & size & then click on selected shoes.
		
		driver.findElement(By.linkText("Lace Running Shoes For Boys & Girls")).click();
		
		
		Set<String> windowId=driver.getWindowHandles();
		
		Iterator<String> itr= windowId.iterator();
		
		String parentWindow=itr.next();
		System.out.println("The current URL of Parent :::" +driver.getCurrentUrl());
		
		String childWindow=itr.next();
		driver.switchTo().window(childWindow);
		System.out.println("The current URL of Child :::" +driver.getCurrentUrl());
		
		//Verify the item name of shoes and price & size.
		UTIL.getText(driver, nameOfShoes_Xpath, "Name Of Shoes");
		Thread.sleep(2000);
		UTIL.getText(driver, priceOfShoes_Xpath, "Price Of Shoes");
		Thread.sleep(2000);
		UTIL.getText(driver, ratingOfShoes_Xpath, "Rating Of Shoes");
		Thread.sleep(2000);
		UTIL.getText(driver, availableOfferOfShoes_Xpath, "Available Of Shoes");
		Thread.sleep(2000);
		
		//Deliver TO
		
		UTIL.isDisplayed(driver, deliverTo_Xpath, "Availabality of Deliver To");
		Thread.sleep(2000);

		UTIL.enterData(driver, enterDelivery_Pincode_Xpath, "829122", "Enter PinCode");
		Thread.sleep(2000);

		UTIL.click(driver, clickOnCheck_Xpath, "Click on Check");
		Thread.sleep(2000);

		UTIL.getText(driver, timeOfDelivery_Xpath, "Time Of Delivery");
		 
		Thread.sleep(4000);
 
		
		UTIL.scrollDown(driver);
		
		Thread.sleep(4000);
		
		
		List<WebElement> list=driver.findElements(By.xpath(sizeOfShoes_Availabality_Xpath));
		
		int listSize=list.size();
		String listIs = "";
		int i;
		
		System.out.println(listSize);
		
		for(i=0; i<=listSize-6; i++)
		{
			
			 listIs=list.get(i).getText();
			 System.out.println(listIs);
			 
			 if(listIs.valueOf(Enabled) != null )
				{
					list.get(i).click();
					System.out.println("size is Available::" +i);
					break;
				}
				
				else
				{
					System.out.println("Size is Not Avaulable");
				}		
			
		}
		
			
		Thread.sleep(4000);
		UTIL.scrollDown(driver);
		Thread.sleep(2000);
		UTIL.click(driver, buyNow_Xpath, "Buy Now");
		System.out.println("After buy now ::" +driver.getCurrentUrl());
		
		Thread.sleep(10000);
		
		//order Summery
		UTIL.getText(driver, orderSummary_Xpath, "Order Summary");
		UTIL.isDisplayed(driver, orderSummary_Xpath, "Order Summary Availabality");
		
		Thread.sleep(3000);
		
		UTIL.getText(driver, orderSummaryDetail_Xpath, "Order Summary In Detail");
		UTIL.getText(driver, dateOfOrderSummary_Xpath, "Date Of Order");
		Thread.sleep(3000);
		
		UTIL.click(driver, continue_Xpath, "Continue");
		System.out.println("After buy now ::" +driver.getCurrentUrl());
		Thread.sleep(3000);
		
		UTIL.getText(driver, paymentOption_Xpath, "Payment Option");
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(parentWindow);
		System.out.println("The current TITLE of Parent :::" +driver.getTitle());
		
		
		// MOUSE OVER TO MEN and CHECK THE MAIN BOLD MENU
		Thread.sleep(3000);
		UTIL.moveToElement(driver, men_Xpath, "Keep The cursor on MEN");
		
		Thread.sleep(3000);
		
		List<String>lst=new ArrayList<String>();
		lst=UTIL.getElements(driver, men_Submenu_List_Bold_Xpath, "Submenu List of MEN");
		System.out.println("The list is"+lst);
		
		
		
		
		
		
	}

}
