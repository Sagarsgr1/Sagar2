package group_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disableusing_enabled_keyword {
@Test(enabled = false)
	public void TC1() {
		Reporter.log("TC1", true);
	}
	@Test(enabled = false)
	public void TC2() {
		Reporter.log("TC2", true);
	}
	@Test
	public void TC3() {
		Reporter.log("TC3", true);
	}
}
