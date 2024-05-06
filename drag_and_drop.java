package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	    Thread.sleep(2000);	
	    driver.manage().window().maximize();
	    
	    WebElement A =driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(A);
        Thread.sleep(2000);
        
        WebElement P =driver.findElement(By.xpath("//h5[normalize-space()='High Tatras']"));
        WebElement Q =driver.findElement(By.xpath("//div[@id='trash']"));
        Actions a=new Actions(driver);
        a.dragAndDrop(P,Q).perform();
	
		
		


	}

}
