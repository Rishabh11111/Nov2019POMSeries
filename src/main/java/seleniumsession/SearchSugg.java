package seleniumsession;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSugg {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
		///click search sugeation value.
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://automationpractice.com");
	    driver.findElement(By.id("search_query_top")).sendKeys("Dress");
	    Thread.sleep(4000);
	   // WebElement ele = driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed ')]"));
	  
	    //ele.click();
	    
	    //with genric
	    SelectSuggestion("Casual Dresses > Printed");

	}
	
	public static void SelectSuggestion(String suggestion) {
		WebElement ele = driver.findElement
				(By.xpath
						("//div[@class='ac_results']//li[contains(text(),'"+suggestion+"')]"));
		  
	    ele.click();

		
	}

}
