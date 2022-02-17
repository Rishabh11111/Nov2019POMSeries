package mytests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

 
	@DataProvider
	 public Object[][] loginTestData() {
		return new Object[][] {{"admin@gmail.com", "admin123"},
			{"login@gmail.com","login123"},
			{"search@gmail.com","searh123"}
		};
	}
	
	@Test(dataProvider = "loginTestData")
	public void loginTest(String username,String password) {
		Assert.assertTrue(doLogin(username,password));
	}
	
	public boolean doLogin(String username,String password) {
		System.out.println("user name:"+ username);
		System.out.println("passwor is :"+password );
		System.out.println("login succesful");
		return true;
	}
}
