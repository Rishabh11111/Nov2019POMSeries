package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAll {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {
		
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	    driver.findElement(By.id("justAnInputBox")).click();
	    
	    //1.
	    //List<WebElement> ele_list=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
	    
	    //for(WebElement e:ele_list) {
	    //	String text = e.getText();
	    	//System.out.println(text);
	 //   }
	    //2. genric
	    //2.1single selection
	  // By loc= By.xpath("//span[@class='comboTreeItemTitle']");
	   //selectChoice(loc);
	    
	    //3. mulltiple selection
	   // By loc= By.xpath("//span[@class='comboTreeItemTitle']");
	    //selectChoice(loc,"choice 1","choice 2","choice 3");
	    
	    //4.all selection
	    By loc= By.xpath("//span[@class='comboTreeItemTitle']");
	    selectChoice(loc, "all");

	}
	/**
	 * 
	 * @param locator
	 * @param value
	 */
	
	public static void selectChoice(By locator , String... value) {
		List<WebElement> ele_list=driver.findElements(locator);
		boolean flag=false;
		if(!value[0].equalsIgnoreCase("all")) {
		for(WebElement e:ele_list) {
		    String text = e.getText();
		    	//System.out.println(text);
		    	
		    	for(int i=0;i<value.length;i++) {
		    	if(text.equals(value[i])) {
		    		flag=true;
		    		e.click();
		    		break;
		    	}
		    	} 	}
	}else {
		//all selection
		try {
		for(WebElement e: ele_list) {
			flag=true;
			e.click();
		}
		}
		catch(ElementNotInteractableException e) {
			System.out.println("all selection over");
		}
	}
		if(flag==false) {
			System.out.println("choice is not available");
		}
	}
}

	
