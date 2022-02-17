package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.
	    get("https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-1st-odi-1277082/full-scorecard");

	  //  WebElement batsman = driver.findElement(By.xpath("//a[text()='Temba Bavuma']/parent::td/following-sibling::td/span"));
	    //System.out.println(batsman.getText());
	    
	    //with genric
	  // String out= getWicketTakerName("Temba Bavuma");
	  // String out2= getWicketTakerName("Aiden Markram");
	   //System.out.println(out2);
	  // System.out.println(out);
	    
	    //get player score card not access bowled part
	   System.out.println( getPlayerScoreCard("Temba Bavuma"));
	   System.out.println(getPlayerScoreCard("Aiden Markram"));
	}

	public static List<String> getPlayerScoreCard(String batsname) {
		List<String> actScoreList = new ArrayList<String>();
		List<WebElement> batsScore = driver.findElements(By.xpath("//a[text()='"+batsname+"']/parent::td/following-sibling::td"));
		for(int i=1;i<batsScore.size();i++) {
			String text = batsScore.get(i).getText();
			 actScoreList.add(text);
		}
		return actScoreList;
	}
	public static String getWicketTakerName(String batname) {
		WebElement batsman = driver.findElement(By.xpath("//a[text()='"+batname+"']/parent::td/following-sibling::td/span"));
		return batsman.getText();
	}
}
