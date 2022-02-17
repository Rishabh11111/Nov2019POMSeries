package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/login");
	    
	    By email = By.id("input-email");
	    By pwd = By.id("input-password");
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//create a object of webdriverwait class
//	   WebElement element=  wait.until(ExpectedConditions.presenceOfElementLocated(email));
//	    element.sendKeys("rishabh@gmail.com");
	    
//	    driver.findElement(pwd).sendKeys("risasdk");//not wait becuse this is regular method and webdriverwait only work on the email
	    //feald.
	    waitForElementPresence(email, 10).sendKeys("rishabh@gmail.com");
	    getElement(pwd).sendKeys("gsgsgs");
	}
	
	public static WebElement getElement(By locator ) {
	
		return driver.findElement(locator);
	}

	public static WebElement waitForElementPresence(By locator , int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		   
	}
	public static WebElement waitForElementVisible(By locator , int timeOut) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		   
	}

}
