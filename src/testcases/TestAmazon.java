package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import locators.AmazonLocator;
import values.TestData;
import webdriverFunctions.Functions;

public class TestAmazon extends Config {
	//Functions FU=new Functions();
	AmazonLocator AL= new AmazonLocator();
	TestData TD = new TestData();
	
	@Test
	public void SearchMusic() {
		
		System.out.println("This is Amazon Music Search Test");
		String expected = "Music";
		driver.findElement(By.xpath(AL.searchbox)).sendKeys(TD.searchMusic);
		driver.findElement(By.xpath(AL.searchbutton)).click();
		WebElement exp =driver.findElement(By.xpath(AL.searchresult));
		String actual = exp.getText();
		//getting rid of the "" from the actual search result
		String actualvalue = actual.replaceAll("\"","");
		Assert.assertEquals(actualvalue, expected);
		
		
		
	}
	
	
	
	
	
	

}
