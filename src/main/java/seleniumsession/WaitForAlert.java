package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.name("proceed")).click();
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    Alert alert= wait.until(ExpectedConditions.alertIsPresent());
//	    alert.getText();
//	    alert.accept();

	   Alert text= waitForAlert(10);
	   System.out.println(text);
	}
	public static Alert waitForAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	    return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static String getAlertText(int timeOut) {
		return waitForAlert(timeOut).getText();
	}
	public static void  acceptAlert(int timeOut) {
		 waitForAlert(timeOut).accept();
	}
	public static void dismissAlertText(int timeOut) {
		 waitForAlert(timeOut).dismiss();
	}
	

}
