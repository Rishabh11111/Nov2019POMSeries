package seleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://londonfreelance.org/courses/frames/index.html");
	    By framLocator =By.name("main");
	    waitForFrameByLocator(10, framLocator);
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	   String header = driver.findElement(By.xpath("/html/body/h2")).getText();
	    System.out.println(header);

	}

	public static WebDriver waitForFrameByIndex(int timeout, int index) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		   return  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	public static WebDriver waitForFrameByLocator(int timeout, By framLocator) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		   return  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framLocator));
	}
}
