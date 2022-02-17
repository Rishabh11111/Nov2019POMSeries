package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllOption {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
		///click search sugeation value.
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    
	    By country=By.id("Form_submitForm_Country");
	   // By state=By.id("Form_submitForm_State");
	    
	    Select select = new Select(driver.findElement(country));
	    List<WebElement> option = select.getOptions();
	    System.out.println(option.size());
	    
	    int i=0;
	    for(WebElement e:option) {
	    	System.out.println(i+":"+e.getText());
	    	i++;
	    }

	}

}
