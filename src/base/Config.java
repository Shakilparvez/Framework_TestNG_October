package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import webdriverFunctions.Functions;

public class Config extends Functions{
	
	
	//public WebDriver driver;
	
	@BeforeMethod
	public void beforeEachMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		clearcookies();
		maxscreen();
		pageloadtime();
		waittime();
	
	}	
	
	@AfterMethod
	public void afterEachMethod() {
		
		driver.quit();
	}
	
	}



