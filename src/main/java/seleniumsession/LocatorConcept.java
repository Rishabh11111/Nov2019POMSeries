package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		//1.
		//driver.findElement(By.id("input-email")).sendKeys("rishabh@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("rishabh@123");
		
		
		//2.
		//WebElement emailId=driver.findElement(By.id("input-email"));
		//WebElement password=driver.findElement(By.id("input-password"));
		//emailId.sendKeys("rishabh@gmail.com");
		//password.sendKeys("rishabh@123");
		
		//3.
		//By EmailId=By.id("input-email");
		//By password=By.id("input-password");
		//WebElement emailId=driver.findElement(EmailId);
		//WebElement Password=driver.findElement(password);
		//emailId.sendKeys("rishabh@gmail.com");
		//Password.sendKeys("rishabh@123");
		
		//4.
		//By locator with genric method
		//By EmailId=By.id("input-email");
		//By password=By.id("input-password");
		//getElement(EmailId).sendKeys("rishabh@gmail.com");
		//getElement(password).sendKeys("rishabh@123");
		
		//5.
		//By locator with genric getelement method and action genric method
		//By EmailId=By.id("input-email");
		//By password=By.id("input-password");
		//doSendkey(EmailId, "rishabh@gmail.com");
		//doSendkey(password, "rishabh@123");
		
		//6.By locator with  getelement method and action genric method with util class.
		//ElementUtil eleUtil= new ElementUtil(driver);
		//By EmailId=By.id("input-email");
		//By password=By.id("input-password");
		//eleUtil.doSendkey(EmailId, "rishabh@gmail.com");
		//eleUtil.doSendkey(password, "rishabh@123");
		
		//7.crete By locator with  getelement method and action genric method  with
		//switc case in same class.
		
		
		//8.crete By locator with  getelement method ,action genric method   with
		//switc case in diffrent  class.
		String eid="input-email";
		String pass="input-password";
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendkey("id", eid,"rishabh@gmail.com");
		eleUtil.doSendkey("id", pass,"rishabh123");
	}	
		
	//public static WebElement getElement(By locator) {
		//return driver.findElement(locator);
	//}
	
	//public static void doSendkey(By locator,String value) {
	//	getElement(locator).sendKeys(value);
		
	//}
	
	

}
