package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class mouse_over {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.get("https://uncodemy.com/");
		Thread.sleep(2000);
		
		WebElement Catagories =driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		
		Actions a = new Actions (driver);
		a.moveToElement(Catagories).perform();
		
		WebElement ST =driver.findElement(By.xpath("//a[@href='#'][normalize-space()='Software Testing']"));
		a.moveToElement(ST).perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']")).click();
		
	}

}
