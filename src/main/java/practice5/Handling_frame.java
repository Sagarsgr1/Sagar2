package practice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frame {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    //swtich to frame
	driver.switchTo().frame("iframeResult");
	//xpath for FN
	WebElement FN=driver.findElement(By.xpath("//input[@id='fname']"));
	//clear the name inside the FN textfield
	FN.clear();
	//write the new name
	FN.sendKeys("sagar");
	}

}
