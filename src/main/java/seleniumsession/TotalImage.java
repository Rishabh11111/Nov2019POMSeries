package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImage {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//print total images
		//
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(); 
        driver.get("https://www.amazon.com");
//	   List<WebElement> listelement =driver.findElements(By.tagName("img"));
//	   System.out.println("total number of imag:"+listelement.size());
	   
//	   for(WebElement e:listelement) {
//		   String alt=e.getAttribute("alt");
//		   String src=e.getAttribute("src");
//		   System.out.println(alt+":"+src);
//	   }
        By links=By.tagName("a");
        System.out.println(getElementCount(links));
        if(getElementsText(links).contains("Registry")) {
        	System.out.println("correct link");
        }
	   
       System.out.println( getElementAttributeList(links, "src"));
        
	}	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementCount(By locator) {
	    return getElements(locator).size();
		}
	public static void printElementsText(By locator) {
		List<WebElement> element=getElements(locator);
		for(WebElement e:element) {
			   String text=e.getText();
			   System.out.println(text);
		   }	
	}
	public static List<String> getElementsText(By locator) {
		List<WebElement> element=getElements(locator);
		List<String> eleTextList= new ArrayList<String>();
		for(WebElement e:element) {
			   String text=e.getText();
			   if(!text.isEmpty()) {
			   eleTextList.add(text);
			   }
		   }
		return eleTextList;
		
	}
	public static List<String> getElementAttributeList(By locator,String attrivalue) {
		List<WebElement> element=getElements(locator);
		List<String> eleAttrList= new ArrayList<String>();
		for(WebElement e:element) {
			   String attrval=e.getAttribute(attrivalue);
			   if(!attrval.isEmpty()) {
			   eleAttrList.add(attrval);
			   }
		   }
		return eleAttrList;
	}
}
