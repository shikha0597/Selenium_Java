package selenium_java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert {

	public static void main(String[] args)	throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();		   
		   
    //  driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		  
    //  driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
    //  Thread.sleep(2000);	
    //  driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); 
    //  Thread.sleep(2000);	
			   
	   driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	   Thread.sleep(2000);
		   
	   Alert a = driver.switchTo().alert();
		      
     // a.dismiss(); 
        a.getText();
		a.sendKeys("Shikha");
		a.accept();	
	}

}
