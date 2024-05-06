package selenium_java;

import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class window_handling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@title='Take a look at Instagram']")).click();
		
		String Pid=  driver.getWindowHandle();
		Set<String> abc= driver.getWindowHandles();
		
		System.out.println(Pid);
		System.out.println(abc);
		
		for(String a:abc) {
			
		if(!(Pid.equals(a)))
	{
			driver.switchTo().window(a);		
	}	
	}
	        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Shikha");
		
	}

}

