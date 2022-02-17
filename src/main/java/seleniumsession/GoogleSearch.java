package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
	   
	    Thread.sleep(3000);
	    List<WebElement> element=driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));
	    System.out.println(element.size());
	    for(WebElement e:element) {
	    	String text=e.getText();
	    	if(text.equals("naveen automation labs youtube")) {
	    	e.click();
	    	break;
	    	}
	    }

	}

}
