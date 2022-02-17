package mytests;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void loginTest() {
		System.out.println("login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homeTest() {
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void searchTest() {
		System.out.println("login test");
	}
	
}

//Default suite
//Total tests run: 3, Failures: 1, Skips: 2