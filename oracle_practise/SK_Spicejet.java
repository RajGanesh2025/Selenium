package oracle_practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SK_Spicejet {

	public static void main(String[] args) {
		
	//	Set Chrome options to disable notifications
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--disable-notifications"); 
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://spicejet.com/");
		driver.findElement(By.xpath("//div[text() ='one way'])")).click();
		//driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1i10wst r-tceitz r-u8s1d css-76zvg2']).sendKeys("Chen"));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("chennai");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//div[text() ='one way']"));
				
//		Set Chrome options to disable notifications
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");  
//        // Disable notifications
//
//		ChromeDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://spicejet.com/");
//		
//		WebElement tripOption = driver.findElement(By.xpath("//div[text() ='one way']"));
//		tripOption.click();
//		Boolean trip = tripOption.isSelected();
//		System.out.println("tripOption: "+trip);
//		
//		WebElement fromTextbox = driver.findElement(By.xpath("//div[text()='From']"));
//		fromTextbox.clear();
//		fromTextbox.sendKeys("Chennai");
			

		//driver.close();
	}
}