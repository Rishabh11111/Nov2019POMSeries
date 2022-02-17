package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://demo.opencart.com/index.php?route=account/login");
	    
	    //login-10s
	    driver.findElement(By.id("input-email")).sendKeys("ri@gmail.com");
	    
	    //pass-5sec
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   WebElement pass= driver.findElement(By.id("test"));
	   pass.sendKeys("tews");
	   
	   //home page-20sec
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   //login page=5sec
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   //no wait
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	}

}
