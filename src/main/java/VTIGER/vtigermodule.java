package VTIGER;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vtigermodule {
//declaration
	@FindBy(xpath = "//a[.='Organizations']")private WebElement orgmod;
	@FindBy(xpath = "//a[.='Contacts']")private WebElement contmod;
	@FindBy(xpath = "//a[.='Opportunities']")private WebElement oppomod;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement amdimg;
	@FindBy(xpath = "//a[.='Sign Out']")private WebElement signout;
	//initialization
	public vtigermodule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getters
	public WebElement getOrgmod() {
		return orgmod;
	}
	public WebElement getContmod() {
		return contmod;
	}
	public WebElement getOppomod() {
		return oppomod;
	}
	public WebElement getAmdimg() {
		return amdimg;
	}
	public WebElement getSignout() {
		return signout;
	}
		//business library
public void clickonorganization() {
	orgmod.click();
}
public void clickoncontact() {
	contmod.click();
}
public void clickonoppertunity() {
	oppomod.click();
}
public void clickaddimga() {
	amdimg.click();
}
public void clickonsignout() {
	signout.click();
}
	}

