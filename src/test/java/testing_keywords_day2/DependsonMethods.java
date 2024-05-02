package testing_keywords_day2;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods {
@Test(dependsOnMethods = "login")
public void logout() {
	Reporter.log("Logout",true);
}
@Test()
public void login() {
	Reporter.log("Login",true);
	Assert.fail();
}
}
