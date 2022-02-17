package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://petdiseasealerts.org/Forecast-map#/");
	    Thread.sleep(3000);;
	    String xpath="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id ='states']//*[name()='g' ]/*[name()=\"path\"]";

	    List<WebElement> graph =driver.findElements(By.xpath(xpath));
	    
	    Actions act = new Actions(driver);
	    for(WebElement e:graph) {
	    	act.moveToElement(e).perform();
	    String atrr = e.getAttribute("name");
	    System.out.println(atrr);
	    if(atrr.equals("Texas")) {
	    	e.click();
	    	break;
	    }
	    
	    }
	}

}
