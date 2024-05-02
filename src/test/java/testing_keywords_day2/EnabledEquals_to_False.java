package testing_keywords_day2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledEquals_to_False {
@Test
public void logout() {
	Reporter.log("Logout",true);
}
@Test(enabled = false)
public void register() {
	Reporter.log("registe",true);
}
@Test
public void login() {
	Reporter.log("logi,truen");
}
}
