package pOc;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LumaMagentoWebsite {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		//Launching website
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//Wait
		Thread.sleep(1000);
		
		//Getting Luma website
		driver.get("https://magento.softwaretestingboard.com/");
		
		//Signing in
		driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]")).click();
		Thread.sleep(1000);
		
		//Finding Email field
		WebElement enterEmailField = driver.findElement(By.xpath("//input[@name='login[username]']"));
		Thread.sleep(1000);
		
		//Entering email address
		enterEmailField.sendKeys("rajganesh.rajendran@perficient.com");
		
		//Finding password field
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='login[password]']"));
		Thread.sleep(1000);
		
		//Entering password
		passwordField.sendKeys("Test@1234");
		
		//Find Signin button
		WebElement SignIn = driver.findElement(By.xpath("//button[@class='action login primary']"));
		Thread.sleep(1000);
		SignIn.click();
		
		//Wait for the website to load
		Thread.sleep(3000);
		
		
		//Select Gear button
		WebElement gearButton = driver.findElement(By.xpath("//span[contains(text(), 'Gear')]"));
		gearButton.click();
		
		Thread.sleep(3000);
		//Select the watches button
		WebElement watchesButton = driver.findElement(By.xpath("//a[contains(text(), 'Watches')]"));
		watchesButton.click();
		
		Thread.sleep(1000);
		//Select Clamberwatch
		WebElement clamberWatch = driver.findElement(By.xpath("//a[@class='product-item-link' and contains(text(), 'Clamber Watch')]"));
		clamberWatch.click();
		
		//Adding to cart
		driver.findElement(By.id("product-addtocart-button")).click();
		Thread.sleep(3000);
		
		//Locating the success message
		WebElement successMessage = driver.findElement(By.xpath("//div[@class='message-success success message']"));
		
		//Retrieving the success message
		String succssMsg = successMessage.getText();
		System.out.println(succssMsg);
		
		//Click the Cart button
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		Thread.sleep(2000);
		
		//Click proceed to checkout
		driver.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(4000);
		
		//Selecting New address button
		driver.findElement(By.xpath("//span[contains (text(),'New Address')]")).click();
		Thread.sleep(1000);
		
		//switching to Shipping address window
		
		//creating parent window variable
		String parentWindow = driver.getWindowHandle();
		
		//creating new window variable
		Set<String> shippingAddressWindow = driver.getWindowHandles();
		
		//switching control to new window
		for (String newWindow : shippingAddressWindow) {
			driver.switchTo().window(newWindow);
			
		}
		
		WebElement companyField = driver.findElement(By.xpath("//input[@name='company']"));
		companyField.sendKeys("Perficient");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("Perficient Towers, No:1, 1st Street,");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='street[1]']")).sendKeys("Guindy");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("New York");
		Thread.sleep(1000);
		
		//Selecting State dropdown
		//Creating webelement for dropdown
		WebElement stateDropdown = driver.findElement(By.xpath("//select[@class='select']"));
		//Creating object for Select class to access dropdown
		Select dropdown = new Select(stateDropdown);
		//Selecting the dropdown by visibletext
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("10001");
		
		/*//Selecting Country dropdown
		//Creating webelement for dropdown
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@class='select']"));
		//Creating object for Select class to access dropdown
		Select dropdown2 = new Select(countryDropdown);
		//Selecting the dropdown by visibletext
		dropdown.selectByVisibleText("United States");
		*/
		
		driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("8562325450");
		driver.findElement(By.xpath("//input[@class='checkbox']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='action primary action-save-address']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='ko_unique_1']")).click();
		Thread.sleep(3000);
		//Click place order button
		driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
		Thread.sleep(3000);
		
		//Getting the order confirmation/thankyou message
		WebElement thankYouNote = driver.findElement(By.xpath("//span[@class='base']"));
		String thanks = thankYouNote.getText();
		System.out.println(thanks);
		
		//Getting the order number
		WebElement orderNumber = driver.findElement(By.xpath("//a[@class='order-number']"));
		String number = orderNumber.getText();
		System.out.println("Your order number is "+ number);
		
		
		Thread.sleep(3000);
		driver.close();
		
				
		
		
		
	}

}
