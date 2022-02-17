package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollingTimeConcept {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/login");
	    By emailid= By.id("input-email");
	    By password = By.id("password");
	    
	   // WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
	    //wait.pollingEvery(Duration.ofSeconds(2));
	    //WebElement email_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(emailid));
	   // email_ele.sendKeys("rishabh@gmail.com");
	    waitForElementVisible(emailid, 10, 2).sendKeys("rishabh@gmail.com");

	}

	public static WebElement waitForElementVisible(By locator, int timeOut, int pollingTime) {
		WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(timeOut));
	    wait.pollingEvery(Duration.ofSeconds(pollingTime));
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
