
package selenium_java;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class take_ss {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts =(TakesScreenshot)driver;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pd = driver.findElement(By.xpath("//input[@name='password']"));
		un.sendKeys("Admin");
		pd.sendKeys("admin123");
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("/Users/navdeep/screen1.png");
		FileUtils.copyFile(src, des);
		log.click();
		Thread.sleep(2000);
		
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File des1 = new File("/Users/navdeep/screen2.png");
		FileUtils.copyFile(src1, des1);
		Thread.sleep(2000);

		WebElement buzz= driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']"));
		buzz.click();
		Thread.sleep(2000);
		
		WebElement text= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
		text.sendKeys("Hye, this is Xyz");
		Thread.sleep(2000);
		
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File des2= new File("/Users/navdeep/screen3.png");
		FileUtils.copyFile(src2, des2);
		
		WebElement post = driver.findElement(By.xpath("//button[@type='submit']"));
		post.click();
		Thread.sleep(2000);
		
		File src3 = ts.getScreenshotAs(OutputType.FILE);
		File des3= new File("/Users/navdeep/screen4.png");
		FileUtils.copyFile(src3, des3);
	}
	

}
