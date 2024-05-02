package VTIGER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement createorg;
@FindBy(xpath = "//input[@name='accountname']")private WebElement fillorgname;
@FindBy(xpath = "//input[@name='button']")private WebElement orgsave;
@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement amdimg;
@FindBy(xpath = "//a[.='Sign Out']")private WebElement signout;

public Organizationpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getCreateorg() {
	return createorg;
}

public WebElement getFillorgname() {
	return fillorgname;
}

public WebElement getOrgsave() {
	return orgsave;
}

public WebElement getAmdimg() {
	return amdimg;
}

public WebElement getSignout() {
	return signout;
}

//
public void Createorg() {
	createorg.click();
}
public void Fillorgname() {
	fillorgname.sendKeys("TCS");
}
public void Orgsave() {
	orgsave.click();
}
public void Amdimg() {
	amdimg.click();
}
public void Signout() {
	signout.click();
}
}
