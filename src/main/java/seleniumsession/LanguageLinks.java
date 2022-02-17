package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(); 
	    //driver.get("https://www.google.co.in/");
	  // By locator= By.xpath("//div[@id=\"SIvCob\"]/a");
	  // clickOnLink(locator,"हिन्दी");
	    
	   driver.get("https://www.freshworks.com/");
	   By footer= By.xpath(" //ul[@class='footer-nav']//a");
	   clickOnLink(footer,"Careers");


	}
	
	public static void clickOnLink(By locator,String LinkText) {
		List <WebElement> element= driver.findElements(locator);
	    System.out.println(element.size());
	   for(WebElement e:element) {
		  String text= e.getText();
		  System.out.println(text);
		 if(text.contains(LinkText));
		  e.click();
		  break;
		   
	   }
		
	}
	

}
