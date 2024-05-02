package Experience_practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPagegtrs {
	//Declaration
	@FindBy(xpath="//input[@type='text']")private WebElement untxt;
	@FindBy(xpath="//input[@id='pass']")private WebElement pwdtxt;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbtn;
	
	//initialization
	public FacebookPagegtrs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
//getters
	public WebElement getUtxt() {
		return untxt;
	}

	public WebElement getPwdxt() {
		return pwdtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
