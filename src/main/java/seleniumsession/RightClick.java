package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		//Performs a context-click at middle of the given element. 
		//First performs a mouseMove to the location of the element.
		
		List<WebElement> option =
				driver.findElements
				(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,' context-menu-icon')]"));
		for(WebElement e:option) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}

	}

}
