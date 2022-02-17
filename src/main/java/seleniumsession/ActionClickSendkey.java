package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickSendkey {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/register");
	    By fn =By.id("input-firstname");
	    By ln= By.id("input-lastname");
	    
	    By login  = By.xpath("//input[@value='Continue']");
	   
	    //1.
//	    Actions act = new Actions(driver);
//	    act.sendKeys(driver.findElement(fn), "rishab");
//	    act.sendKeys(driver.findElement(ln), "mishar");
//	    act.click(driver.findElement(login)).perform();
	    
	    //2.with genric method
	    ActiondoSendkey(fn,"rishabh");
	    ActiondoSendkey(ln, "mishra");
	    doClick(login);
		
	}
	
	public static WebElement getEement(By locator) {
		return driver.findElement(locator);
	}
	public static void ActiondoSendkey(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getEement(locator), value).perform();
	}
	public static void doClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getEement(locator)).perform();
	}
}
