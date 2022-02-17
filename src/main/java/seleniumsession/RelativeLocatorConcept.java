package seleniumsession;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class RelativeLocatorConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement element=driver.findElement(By.linkText("Colwood, Canada"));


		String index = driver.findElement(with(By.tagName("p")).toRightOf(element)).getText();
		System.out.println(index);
		
		String inde = driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
		System.out.println(inde);
		
		String above = driver.findElement(with(By.tagName("p")).above(element)).getText();
		System.out.println(above);
		
		String below = driver.findElement(with(By.tagName("p")).below(element)).getText();
		System.out.println(below);
		
		String near = driver.findElement(with(By.tagName("p")).near(element)).getText();
		System.out.println(near);
		
		List<WebElement> list = driver.findElements(with(By.tagName("p")).toRightOf(element));
		for(WebElement e:list) {
			
		System.out.println(e.getText());
		
	}
	}
}
