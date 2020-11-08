package SeleniumImplementaion;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;


public class SeleniumImplementation {

	Actions action;
	
	public void performMouseHower(WebElement element, WebDriver driver) {
		action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void setText(String text,WebElement element) {
		element.sendKeys(text);
	}
	
	
	public void pressEnter() {
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void scrollDown (WebDriver driver) {
		JavascriptExecutor executor= (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,2000)","");
	}
	

	
	public void click(WebElement element) {
		element.click();
	}
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	public void refresh	(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	
	public boolean validateText(WebDriver driver, WebElement element, String expectedText) {
		String observedText =element.getText();
		System.out.println(observedText);
		if(observedText.equals(expectedText)) {
			return true;
		}
		return false;
			}
	

		
	}
	

