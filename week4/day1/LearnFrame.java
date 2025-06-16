package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args)

	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		// driver.findElement(By.id("menuform:j_idt38")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-stop layout-menuitem-icon']")).click();
		// switch to frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();

	}

}
