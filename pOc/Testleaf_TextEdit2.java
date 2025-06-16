package pOc;

import java.awt.Point;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Testleaf_TextEdit2 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("menuform:m_input")).click();
		
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		Thread.sleep(3000);
		name.sendKeys("James Bond", Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("England", Keys.TAB);
		Thread.sleep(3000);
		// To verify if the text box is disabled
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93")); // Find the element, then ctrl+2,L to create an object
		boolean enabled = disabledBox.isEnabled(); // type the objectName. click ctrl+space to get isEnabled function,then ctrl+2,L
		System.out.println(enabled); // syso ctrl+space+enter and call the function
		// Clearing the existing text
		driver.findElement(By.id("j_idt88:j_idt95")).clear();

		// To print the text displayed in the tab
		WebElement value = driver.findElement(By.id("j_idt88:j_idt97"));
		@Nullable
		String retrieveText = value.getAttribute("value");
		System.out.println(retrieveText);
		
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("jamesbond@007.com", Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I'm an agent of the British Government.");
		//Thread.sleep(3000);
		
		//Selecting the value for font
//		WebElement dropdown = driver.findElement(By.xpath("//select[@class='ql-font']"));
//		Select drpdown = new Select(dropdown);
//		
//		drpdown.selectByValue("monospace");
		
//		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt103_toolbar\']/span[1]/span[1]/span[1]"));
//		Select drpDown = new Select(dropdown);
//		drpDown.selectByVisibleText("monospace");
		
		//driver.findElement(By.xpath("j_idt106:thisform:age"));
		
		
		//Pressing Enter and confirming the error message
		WebElement enterbox = driver.findElement(By.id("j_idt106:thisform:age"));
		enterbox.sendKeys(Keys.ENTER);
		
		WebElement errorMessage = driver.findElement(By.xpath("//span[text()='Age is mandatory']"));
		Thread.sleep(3000);		
		String errorMsg = errorMessage.getText();
		System.out.println("The error message is: "+ errorMsg);
		
		WebElement clickAndConfirmLabelPositionChanges = driver.findElement(By.id("j_idt106:float-input"));
		clickAndConfirmLabelPositionChanges.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(i[@class='pi pi-server layout-menuitem-icon']));
		
		
		

	}

}
