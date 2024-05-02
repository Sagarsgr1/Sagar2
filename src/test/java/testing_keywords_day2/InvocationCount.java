package testing_keywords_day2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
@Test(invocationCount = 10)
public void m1() {
	Reporter.log("hii",true);
}
}
