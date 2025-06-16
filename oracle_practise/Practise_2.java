package oracle_practise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.findElement(By.className("MV3Tnb")).click(); - Works but Not the right method as there are duplicate classNames
		//driver.findElement(By.linkText("https://about.google/?fg=1&utm_source=google-IN&utm_medium=referral&utm_campaign=hp-header")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]")).click();
		//this xpath was copied directly by right clicking.
		driver.findElement(By.xpath("//a[text()='About']")).click();
//		driver.findElement(By.xpath("//a[text()='Products']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Products')]")).click();
				
		// Get the current URL of the page - type driver.getCurrentUrl the press ctrl+2 & L to create a variable
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current URL is " + currentUrl);
		
		// To click Commitments button
		// a[contains (text(), 'Commitments')]
		// a[text()='Commitments'] - this does not find

		driver.findElement(By.xpath("//a[contains(text(), 'Commitments')]")).click();
		

		// To print the current URL, similar step as above and just change the variable
		// name
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("The Current URL is " + currentUrl2);
		
		driver.findElement(By.xpath("//a[contains(text(), 'About')]")).click();
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println("The Current URL is " + currentUrl3);
		
		driver.close();
		
		

		/*
		 * driver.findElement(By.xpath("//a[text()='About']")).click(); 
		 * String currentUrl3 = driver.getCurrentUrl();
		 * System.out.println("The Current URL is " + currentUrl3);
	 
		 * /* ChromeDriver driver = new ChromeDriver();
		 * driver.manage().window().maximize(); driver.get("https://www.google.com/");
		 * String title = driver.getTitle(); System.out.println(title);
		 * driver.findElement(By.className("MV3Tnb")).click();
		 */

	}

}
