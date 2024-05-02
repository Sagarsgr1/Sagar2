package testngprogramms;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test
public void login() {
	Reporter.log("Hi good morning",true);
}
@Test
public void login1() {
	Reporter.log("Hi good morning",true);
}
@Test
public void logout() {
	String s1="Hiii";
	String s2="Byee";
	Assert.assertEquals(s1, s2,"Both are not matching TC is fail");
	System.out.println("TC is pass");
}
}
