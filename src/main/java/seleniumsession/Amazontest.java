package seleniumsession;

public class Amazontest {

	public static void main(String[] args) {
		

		String browser="chrome";
		BrowserUtility br = new BrowserUtility();
		br.LaunchBrowser(browser);
		br.enterUrl("https://www.google.com");
		String title=br.getPageTitle();
		System.out.println("title is:"+title);
		
		if(title.contains("Google")) {
			System.out.println("correct url");
		}
		else {
			System.out.println("incorrect url..");
		}
		br.quitBrowser();
	
	}

}
