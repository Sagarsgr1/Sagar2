package testing_keywords_day2;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsTC {
@AfterSuite
public void as() {
	Reporter.log("==close the data base==",true);
}
@BeforeSuite
public void bs() {
	Reporter.log("==open the data base==",true);
}
@AfterClass
public void ac() {
	Reporter.log("==close the browser==",true);
}
@BeforeClass
public void bc() {
	Reporter.log("==open the browser==",true);
}
@AfterMethod
public void am() {
	Reporter.log("==close the app==",true);
}
@BeforeMethod
public void bm() {
	Reporter.log("==open the app==",true);
}
@Test
public void TC() {
	Reporter.log("==verify login operation==",true);
}
}
