package com.qa.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HRM_Login {

	@Test
	
	public void login()
	
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Bala\\Driver\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.testingmasters.com/hrm");
	    // completed..
		

	}

}
