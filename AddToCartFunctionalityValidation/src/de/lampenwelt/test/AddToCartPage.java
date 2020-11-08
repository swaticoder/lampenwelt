package de.lampenwelt.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumImplementaion.SeleniumImplementation;

public class AddToCartPage {
     
	@FindBy(xpath="//*[@id=\"main-nav\"]/li[3]/a/span")
	WebElement mainMenuList;
	@FindBy(xpath="//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[4]/main/div[9]/ul/li[5]/div[2]/a/p[2]/span")
	WebElement item1;
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/div[1]/div[2]/div[3]/span/div/p[1]/span")
	WebElement item1Amount;
	@FindBy(xpath="//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[4]/main/div[9]/ul/li[10]/div[2]/a/p[2]/span")
	WebElement item2;
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/div[2]/div[2]/div[3]/span/div/p[1]/span")
	WebElement item2Amount;
	@FindBy(xpath="//*[@id=\"top\"]/body/div[1]/div/div[2]/div/div[4]/main/div[9]/ul/li[7]/div[2]/a/p[2]/span")
	WebElement item3;
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/div[3]/div[2]/div[3]/span/div/p[1]/span")
	WebElement item3Amount;

	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/div[1]/div[2]/div[2]/select")
	WebElement addmoreunit;
	@FindBy(xpath="//*[@id=\"btnAddToCart\"]/span")
	WebElement addToCart;
	@FindBy(xpath="//*[@id=\"header\"]/div[1]/div[5]/a/span[1]")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/div[1]/div[2]/div[4]/a")
	WebElement remove;
	@FindBy(xpath="//*[@id=\"shopping-cart-totals-table\"]/tbody/tr[1]/td[2]/span/font/font")
	WebElement subTotalNet;
	@FindBy(xpath="//*[@id=\"shopping-cart-totals-table\"]/tbody/tr[2]/td[2]/span/span/font/font")
	WebElement shippingAmount;
	@FindBy(xpath="//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span/font/font")
	WebElement netAmount;
	
	
	
	
	SeleniumImplementation selenium;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		selenium= new SeleniumImplementation();
	}
	//add1st data
	public boolean validateAddToCart(WebDriver driver) {
		selenium.performMouseHower(mainMenuList, driver);
		selenium.click(mainMenuList);
		selenium.performMouseHower(item1, driver);
		selenium.click(item1);
		selenium.click(addToCart);
		selenium.click(cart);
		//add 2nd data
		selenium.refresh(driver);
		driver.navigate().to("https://www.lampenwelt.de/");
		driver.manage().window().maximize();
		selenium.performMouseHower(mainMenuList, driver);
		selenium.click(mainMenuList);
		selenium.performMouseHower(item2, driver);
		selenium.click(item2);
		selenium.click(addToCart);
		selenium.click(cart);
		//add 3rd data
		driver.navigate().to("https://www.lampenwelt.de/");
		driver.manage().window().maximize();
		selenium.performMouseHower(mainMenuList, driver);
		selenium.click(mainMenuList);
		selenium.performMouseHower(item3, driver);
		selenium.click(item3);
		selenium.click(addToCart);
		selenium.click(cart);
		selenium.refresh(driver);
		// remove an item
		selenium.click(remove);
		//again add
		driver.navigate().to("https://www.lampenwelt.de/");
		driver.manage().window().maximize();
		selenium.performMouseHower(mainMenuList, driver);
		selenium.click(mainMenuList);
		selenium.performMouseHower(item3, driver);
		selenium.click(item3);
		selenium.click(addToCart);
		selenium.click(cart);
		selenium.refresh(driver);
		
        //add quantity
		selenium.performMouseHower(addmoreunit, driver);		
     	selenium.clear(addmoreunit);
		selenium.setText("12", addmoreunit);
		
		
		//Amount Verification
		String observedItemAmount1 =item1Amount.getText();
		System.out.println(observedItemAmount1);
		String observedItemAmount2 =item2Amount.getText();
		System.out.println(observedItemAmount2);
		String observedItemAmount3 =item3Amount.getText();
    	System.out.println(observedItemAmount3);
    	
    	String str1=observedItemAmount1.substring(0,6);
    	System.out.println(str1);
    	String str2=observedItemAmount2.substring(0,6);
    	System.out.println(str2);
    	String str3=observedItemAmount3.substring(0,6);
    	System.out.println(str3);
    	
    	float num1= Float.parseFloat(str1);
    	float num2= Float.parseFloat(str2);
    	float num3= Float.parseFloat(str3);
    	
    	float totalproductamount=num1+num2+num3;
    	System.out.println("amount"  +  totalproductamount);
    	
//		String observedItemAmount1 =item1Amount.getText();
		System.out.println(observedItemAmount1);
//		String observedItemAmount2 =item2Amount.getText();
		System.out.println(observedItemAmount2);
  //  	String str1=observedItemAmount1.substring(0,6);
    	System.out.println(str1);
   // 	String str2=observedItemAmount2.substring(0,6);
    	System.out.println(str2);
    	
		return selenium.validateText(driver, cart, "3");
		
		
	}
	
	
}
