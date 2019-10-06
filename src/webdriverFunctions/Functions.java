package webdriverFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Functions  {
	
	public WebDriver driver;
	public void clearcookies() {
		
		driver.manage().deleteAllCookies();		
	}
	public void maxscreen() {
		driver.manage().window().maximize();
	}
	public void pageloadtime() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	public void waittime() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
}
	
	
	
	
	
	

