package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts4 {

	public static void main(String[] args) throws InterruptedException {

		//Non modal dialog - Sweet Alert
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		driver.findElement(By.id("menuform:j_idt39")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		driver.findElement(By.id("j_idt88:j_idt95")).click();
		//driver.findElement(By.xpath("//span[text ()='Show']"));
		
		//To pause for 2secs to show the alert box, we use the following function
		Thread.sleep(2000);
		
		//To click on the alert box, we switch from html to javascript function and so we use switchto function.
		//driver.switchTo().alert().accept();
		
//		//To get the text present in the alert box, we create an object by pressing ctrl+2 &L,type driver.switchto.alert and press ctrl+2 &L
//		Alert alert = driver.switchTo().alert();
//		//To get the text, use getText function,
//		//alert.getText()
//		//Press ctrl+2 & L, it converts the function to String return type
//		String text = alert.getText();
//		System.out.println(text);
//		
//		//alert.accept();
//		
//		alert.sendKeys("Raj Ganesh");
//		alert.accept();
		
		//As this alert is inspectable, we use xpath and interact with it.
		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		
	}

}
