package practice4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//  show popup
		driver.get("https://the-internet.herokuapp.com/basic_auth");

	}

}
