package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {

	private WebDriver driver;

	public WebDriver LaunchBrowser(String browser) {

		System.out.println("browser is:" + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("pass right browser");
		}
		return driver;
	}

	public WebDriver enterUrl(String url) {
		System.out.println("url is:" + url);
		if (url.contains("https") || url.contains("http")) {
          driver.get(url);
	}
		
		else {
			System.out.println("incorrect url...");
		}
		try {
			throw new Exception("INCORRECT URL MISSING HTTP or HTTPS");
		} catch (Exception e) {

		}
		return driver;

	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
