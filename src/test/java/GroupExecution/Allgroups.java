package GroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Allgroups {
@Test(priority = 1,groups = "SmokeTest")
public void verifyLink() {
	Reporter.log("smoketestcases", true);
}
@Test(priority = 3,groups = "Functional")
public void verifyLogin() {
	Reporter.log("Fuctionaltestcase", true);
}
@Test(priority = 2,groups = "SmokeTest")
public void verrifyLogo() {
	Reporter.log("smoketestcase",true);
}
@Test(priority = 4,groups = "Functional")
public void verifyLogout() {
	Reporter.log("Functionaltestcase", true);
}
}
