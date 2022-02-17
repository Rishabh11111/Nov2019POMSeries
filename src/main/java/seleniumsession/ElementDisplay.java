package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplay {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email=By.id("input-email");
		//1.isDisplayed()
		//if(driver.findElement(email).isDisplayed()) {
		//	driver.findElement(email).sendKeys("ris@gmail.com");
		//}
		
		//2. with genric
		if(doIsDisplayed(email)) {
			doSendKey(email, "ri@gmailcom");
			//System.out.println();
		}

}
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public static void doSendKey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
}