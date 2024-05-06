package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class post_automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pd = driver.findElement(By.xpath("//input[@name='password']"));
		un.sendKeys("Admin");
		pd.sendKeys("admin123");
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		
		WebElement buzz= driver.findElement(By.xpath("/span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
		buzz.click();
		Thread.sleep(2000);
		
		WebElement text= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		text.sendKeys("Hi,This Is Shikha");
		Thread.sleep(2000);
		
		WebElement postbutton = driver.findElement(By.xpath("///button[@type='submit']"));
		postbutton.click();
	}
	
	

}
