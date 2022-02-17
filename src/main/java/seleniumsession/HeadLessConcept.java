package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessConcept {

public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--headless");
//	co.setHeadless(true);
	WebDriver driver = new ChromeDriver();//launcg chrome
	
	driver.get("https://www.google.com");//without https is not work.but without www it will work.
	String title=driver.getTitle();//get tiitle
	System.out.println("title is :"+title);
	
	if(title.equals("Google")) {
		System.out.println("correct");		
	}
	else {
		
		System.out.println("incorrect");
	}
	//automation testing
	
	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getPageSource());
	
	if(driver.getPageSource().contains("Copyright The Closure Library Authors")) {
		System.out.println("is ppresent");
	}
	
	driver.quit();//shutdown chrome

	}

}
