package com.qa.tests;

import org.openqa.selenium.chrome.ChromeDriver;


public class HRM_Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\Bala\\Driver\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.testingmasters.com/hrm");
	
		

	}

}
