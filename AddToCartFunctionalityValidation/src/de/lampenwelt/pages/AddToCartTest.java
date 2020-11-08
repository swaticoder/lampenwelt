package de.lampenwelt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import de.lampenwelt.test.AddToCartPage;

public class AddToCartTest {
	WebDriver driver;
	AddToCartPage page;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati\\eclipsenovember061\\AddToCartFunctionalityValidation\\src\\Resource\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.lampenwelt.de/");
		driver.manage().window().maximize();
		page=new AddToCartPage(driver);
		
	
	}
	
	
	@Test
	public void validateAddToCart() {
		Assert.assertTrue(page.validateAddToCart(driver));
		
	}
	
	
	@Test
	public void validateNetCartamountallitemadded() {
		
		
	}
	
	@Test
	public void validateNetCartamountoneitemdeleted() {
		
	}
	
	@Test
	public void validateNetCartamountoneitemaddedagain() {
		
	}
	
	@Test
	public void validateTotalAmountallitemareadded() {
		

	}
	
	@Test
	public void validateTotalamountoneitemdeleted() {
		
	}
	
	@Test
	public void validateTotalamountaddedagain() {
		
	}
}
