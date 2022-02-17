package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver.exe");
		//automation steps
		//Top casting
	WebDriver driver = new ChromeDriver();//launcg chrome
	
	driver.get("https://www.google.com");//without https is not work.but without www it will work.
	String title=driver.getTitle();//get tiitle
	System.out.println("title is :"+title);
	
	//varefication/checkpoint
	if(title.equals("Google")) {
		System.out.println("correct");
		
	}
	else {
		
		System.out.println("incorrect");
	}
	//automation testing
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	if(driver.getPageSource().contains("Copyright The Closure Library Authors")) {
		System.out.println("is ppresent");
	}
	
	driver.quit();//shutdown chrome

	}

}
