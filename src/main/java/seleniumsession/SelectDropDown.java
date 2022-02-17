package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
		///click search sugeation value.
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    
	    By country=By.id("Form_submitForm_Country");
	    By state=By.id("Form_submitForm_State");
	    
//	    WebElement country_ele = driver.findElement(country);
//	    WebElement state_ele = driver.findElement(state);
//	    
//	    Select select = new Select(country_ele);
//	    
//	    select.selectByIndex(5);
//	    select.selectByVisibleText("india");
//	    select.selectByValue("Austrailia");
//	    
//	    Select select1 = new Select(state_ele);
//	    select1.deselectByVisibleText("karnataka");
	    
	    //doSelectDropDownByIndex(country, 5);
	    //Thread.sleep(3000);
	   // DoSelectValueByIndex(state, 5);
	    
	    doSelectDropDownByVisible(country, "India");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select=new Select(getElement( locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownByValue(By locator,String value) {
		Select select=new Select(getElement( locator));
		select.selectByValue(value);;
	}
	public static void doSelectDropDownByVisible(By locator,String visible) {
		Select select=new Select(getElement( locator));
		select.selectByVisibleText(visible);;
	}
	
}
