package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetValueAttribute {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email=By.id("input-email");
		doSendKey(email, "rishabh@gmail.com");
		//1.getAttribute
		//String attr=driver.findElement(email).getAttribute("value");
		//System.out.println(attr);
		//1.1 with genric
		String attr=doGetAttribute(email, "value");
		System.out.println(attr);
		//String text= doGetText(email);
		//System.out.println(text);
		

	}
	
	public static String doGetAttribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	public static String doGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	public static void doClick(By locator) {
		getElement( locator).click();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
}
	public static void doSendKey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

}
