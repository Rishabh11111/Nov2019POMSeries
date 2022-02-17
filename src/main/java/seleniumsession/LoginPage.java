package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {
		BrowserUtility br = new BrowserUtility();
		WebDriver driver = br.LaunchBrowser("chrome");
		br.enterUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(br.getPageTitle());
		
		By EmailId=By.id("input-email");
		By password=By.id("input-password");
		ElementUtil el = new ElementUtil(driver);
		el.doSendkey(EmailId, "rishabhmishra429@gmail.com");
		el.doSendkey(password, "rishabhmishra429");
		
		br.quitBrowser();

	}

}
