package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableConcept {

	static WebDriver driver;

	public static void main(String[] args)  {
		
		
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	    System.out.println(getCompName("Maria Anders"));
	    System.out.println(getCountryName("Roland Mendel"));

	    System.out.println("coulm"+":"+getColoumCount());
	    System.out.println("row"+":"+getRowCount());
	    
	    ////*[@id="customers"]/tbody/tr[2]/td[1]
	    ////*[@id="customers"]/tbody/tr[3]/td[1]
	    ////*[@id="customers"]/tbody/tr[7]/td[1]
	    
	    //print one row
	  //  String  before="//*[@id=\"customers\"]/tbody/tr[";
	  //  String after ="]/td[1]";
	   // for(int i=2;i<=getRowCount();i++) {
	   // 	String xpath = before+i+after;
	    	//System.out.println(xpath);
	    //			String text =driver.findElement(By.xpath(xpath)).getText();
	    	//		System.out.println(text);
	    //}
	    
	    //print all table
	    String  before="//*[@id=\"customers\"]/tbody/tr[";
	    String after ="]/td[";
	    for(int col=1;col<=getColoumCount();col++) {
	    	for(int row=2;row<=getRowCount();row++) {
		    	String xpath = before+row+after+col+"]";
		    	//System.out.println(xpath);
		    			String text =driver.findElement(By.xpath(xpath)).getText();
		    			System.out.println(text);
		    }
	    	
	    }
	    
	    
	}
	public static int getColoumCount() {
		return driver.findElements(By.xpath("(//table[@id='customers']//tr)[1]/th")).size();
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}
	public static String getCompName(String name) {
		return driver.findElement(By.xpath("//td[text()='"+name+"']/preceding-sibling::td"))
		.getText();
	}

	  public static String getCountryName(String name) {
		return driver.findElement(By.xpath("//td[text()='"+name+"']/following-sibling::td"))
		.getText();
	}

}
