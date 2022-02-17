package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitNonWebElement {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	   // WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	  //  wait.until(ExpectedConditions.titleContains("Amazon"));
	 //   System.out.println(driver.getTitle());
	  String tit=  doGetPageTitle("Amazon", 10);
	  System.out.println(tit);

	}
	public static Boolean waitForPageTitle(String title , int timeOut) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	   return wait.until(ExpectedConditions.titleContains(title));
	}
	public static String doGetPageTitle(String title , int timeOut) {
		if(waitForPageTitle(title, timeOut)){
		return driver.getTitle();	
		}
		return null;
	}

}
