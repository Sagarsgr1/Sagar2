package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KeysClass {

	public static void main(String[] args) {
		WebDriver d=new EdgeDriver();
		d.get("https://www.saucedemo.com");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	}

}
