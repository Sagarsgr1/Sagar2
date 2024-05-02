package testing_keywords_day2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOuts {
@Test(timeOut = 10)
public void logout() {
	Reporter.log("Logout",true);
}
}
