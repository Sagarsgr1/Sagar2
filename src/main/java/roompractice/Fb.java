package roompractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fb {
public static void main(String[] args)throws Throwable {
	WebDriver d=new EdgeDriver();
	d.get("https://www.facebook.com");
	Thread.sleep(2000);
	d.findElement(By.id("email")).sendKeys("sagar");
	Thread.sleep(1000);
	d.findElement(By.id("pass")).sendKeys("prusty");
	Thread.sleep(1000);
	d.findElement(By.name("login")).click();
}
}
