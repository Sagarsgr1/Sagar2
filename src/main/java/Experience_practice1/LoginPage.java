package Experience_practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
// Declaration
	@FindBy(xpath="//input[@id='user-name']")private WebElement utxt;
	@FindBy(xpath="//input[@id='password']")private WebElement pwdxt;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginbtn;
//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
// Getterrs

	public WebElement getUtxt() {
		return utxt;
	}

	public WebElement getPwdxt() {
		return pwdxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	}


