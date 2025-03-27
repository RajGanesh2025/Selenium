package oracle_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_com {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//a[text()='About']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Products')]")).click();		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current URL is " + currentUrl);

		driver.findElement(By.xpath("//a[contains(text(), 'Commitments')]")).click();

		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("The Current URL is " + currentUrl2);

		driver.findElement(By.xpath("//a[contains(text(), 'About')]")).click();
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println("The Current URL is " + currentUrl3);

		//driver.close();
	}
}