package selenium_java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class project_1 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();

	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
	     String Title= driver.getTitle();
	     System.out.println(Title);
	     
	     String URL= driver.getCurrentUrl();
	     System.out.println(URL);
	     
	 // WebElement un = driver.findElement(By.xpath("//input[@name='username']")).click();
	     
	 //   WebElement pd = driver.findElement(By.xpath()).click();
	    
	 //   un.sendkeys("Admin");
	 //   pd.sendkays("admin123");
	    
	 //   WebElement log = driver.findElement(By.xpath()).click();
	    
	  //  log.click(;)
	     driver.quit();
			}

		}

