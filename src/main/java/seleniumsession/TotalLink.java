package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLink {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(); 
	    driver.get("https://www.amazon.com");
	   List<WebElement> listelement =driver.findElements(By.tagName("a"));
	   System.out.println(listelement.size());
	   
	   //for each loop
	  // int c=0;
	  // for(WebElement e:listelement) {
		//  String text= e.getText();
		 // if(!text.isEmpty()) {
		 // System.out.println(c+":"+text);
		  //}
		 // String atr=e.getAttribute("href");
		 // System.out.println(atr);
		 // c++;
	  // }
	   
	   //using index base for loop to print link and text
	   for(int i=0;i<listelement.size();i++) {
		   String atr=listelement.get(i).getText();
		   if(!atr.isEmpty()) {
		   System.out.println(i+":"+atr);
		   }
	   }
		
	}
}
