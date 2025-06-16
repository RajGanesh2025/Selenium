package pOc;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleaf_TextEdit {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.id("menuform:m_input")).click();
		
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("James Bond", Keys.TAB);
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("England", Keys.TAB);
		
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
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I'm an agent of the British Government.");
		
		//Selecting the value for font
		WebElement dropdown = driver.findElement(By.xpath("//span[(@class='ql-picker-label')]"));
		Select drpdown = new Select(dropdown);
		
		drpdown.selectByValue("serif");
		
		//Pressing Enter and confirming the error message
		driver.findElement(By.id("j_idt106:thisform:age"));
		
		

	}

}
