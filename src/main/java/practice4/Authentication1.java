package practice4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		//click o submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
        // how to handle alert popup
		Alert alt=driver.switchTo().alert();
		//click on ok btn
		alt.accept();
		//get teh text
		System.out.println(alt.getText());
	}

}
