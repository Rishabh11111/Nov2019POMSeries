package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Locator {
	

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(); 
		
		//1.id-unique;
		//2.name-can be duplicate
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//driver.findElement(By.name("email")).sendKeys("ri@gamil.com");
		
		//3.class=can be duplicate
		//driver.findElement(By.className("form-control")).sendKeys("ri@gmail.com");
			
		//4.xpath-it provide address of element

		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ri@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("ri@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//4.1.with genric method
		//By email=By.xpath("//*[@id=\"input-email\"]");
		//By pass=By.xpath("//*[@id=\"input-password\"]");
		//By cl=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		//doSendKey(email, "ri@gmail.com");
		//doSendKey(pass, "ri123");
		//doClick(cl);
		
		//5.cssSelector
		//By email=By.cssSelector("#input-email");
		//By password=By.cssSelector("#input-password");
		//By login=By.cssSelector("#content > div > div:nth-child(2) > div > form > input");

		//doSendKey(email, "ri@gmail.com");
		//doSendKey(password, "ri123");
		//doClick(login);
		
		//6.linkText--only applicable of link
		//driver.findElement(By.linkText("Register")).click();
		
		//7.partialLinkText--only applicable of link but partial
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8.tagName-html tag use to capture text with the help of getText method.
		//String text=driver.findElement(By.tagName("h2")).getText();
		//System.out.println(text);
		
		//8.1-getText with genric
		By regester=By.linkText("Register");
		By tagname=By.tagName("h2");
		System.out.println(doGetText(regester));
		System.out.println(doGetText(tagname));

	
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
		
	}
	
	public static void doClick(By locator) {
		getElement( locator).click();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
}
	public static void doSendKey(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
}
