package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrl {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/login");
	    driver.findElement(By.linkText("Register")).click();
	    
	   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  // if(wait.until(ExpectedConditions.urlContains("account/register"))){
	//	   System.out.println(driver.getCurrentUrl());
	    	
//	    }

	   String url= waitForUrlContains("account/register", 10);
	   System.out.println(url);
	}
	/**
	 * An expectation for the URL of the current page to contain specific text
	 * @param urlFraction
	 * @param timeOut
	 * @return
	 */
	public static String waitForUrlContains(String urlFraction , int timeOut) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		   if(wait.until(ExpectedConditions.urlContains(urlFraction))){
			   return driver.getCurrentUrl();
		    	
		    }
		   return null;
	}
	/**
	 * An expectation for the URL of the current page to be a specific url.
	 * @param urlFraction
	 * @param timeOut
	 * @return
	 */
	public static String waitForUrlToBe(String urlFraction , int timeOut) {
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		   if(wait.until(ExpectedConditions.urlToBe(urlFraction))){
			   return driver.getCurrentUrl();
		    	
		    }
		   return null;
	}
	

}
