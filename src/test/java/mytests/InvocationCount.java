package mytests;

import org.testng.annotations.Test;

public class InvocationCount {

@Test(invocationCount = 10)
public void loginTest() {
	System.out.println("login test");
}

}

//Default suite
//Total tests run: 10, Failures: 0, Skips: 0
//print one test in 10 times if use invocationCount method.