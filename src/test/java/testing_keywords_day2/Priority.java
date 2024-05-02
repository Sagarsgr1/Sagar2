package testing_keywords_day2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 3)
public void logout() {
	Reporter.log("Logout",true);
       }
@Test(priority = 1)
public void register() {
	Reporter.log("register",true);
       }
@Test(priority = 2)
public void login() {
	Reporter.log("Login",true);
       }
}
