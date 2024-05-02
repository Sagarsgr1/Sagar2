package Experience_practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instalogin {
	// Declaration
		@FindBy(xpath="//input[@type='text']")private WebElement utxt;
		@FindBy(xpath="//input[@type='password']")private WebElement pwdxt;
		@FindBy(xpath="//button[@type='submit']")private WebElement loginbtn;
	//initialization
		public Instalogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
}
		//getters
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
