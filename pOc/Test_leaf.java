package pOc;

public class Test_leaf {
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;

	public class LeafgroundAllInputs {

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	        try {
	            driver.manage().window().maximize();
	            driver.get("https://leafground.com/input.xhtml");

	            // Text fields
	            driver.findElement(By.id("j_idt88:name")).sendKeys("James Bond", Keys.TAB);
	            driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("England", Keys.TAB);

	            // Disabled field check
	            WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
	            System.out.println("Is disabled field enabled? " + disabledBox.isEnabled());

	            // Clear and retrieve value
	            driver.findElement(By.id("j_idt88:j_idt95")).clear();
	            WebElement valueField = driver.findElement(By.id("j_idt88:j_idt97"));
	            System.out.println("Retrieved text: " + valueField.getAttribute("value"));

	            // Email and about yourself
	            driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("jamesbond@007.com", Keys.TAB);
	            driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I'm an agent of the British Government.");

	            // Font dropdown (Quill toolbar)
	            WebElement fontDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ql-font']")));
	            fontDropdown.click();
	            WebElement monospaceOption = wait.until(ExpectedConditions.elementToBeClickable(
	                    By.xpath("//span[@class='ql-picker-item'][@data-value='monospace']")));
	            monospaceOption.click();

	            // Age validation
	            driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
	            WebElement error = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//span[@class='ui-message-error-detail']")));
	            System.out.println("Error message: " + error.getText());

	            // Basic checkbox and radio
	            WebElement checkbox = driver.findElement(By.id("j_idt88:j_idt107"));
	            if (!checkbox.isSelected()) checkbox.click();

	            WebElement radioButton = driver.findElement(By.id("j_idt88:j_idt109"));
	            if (!radioButton.isSelected()) radioButton.click();

	            // Dropdown
	            driver.findElement(By.id("j_idt88:j_idt111")).sendKeys("Option 2", Keys.TAB);

	            // Date and time
	            driver.findElement(By.id("j_idt88:j_idt113")).sendKeys("2025-06-08", Keys.TAB);
	            driver.findElement(By.id("j_idt88:j_idt115")).sendKeys("12:00", Keys.TAB);

	            // Spinner
	            WebElement spinner = driver.findElement(By.id("j_idt88:j_idt117"));
	            spinner.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP);

	            // Search field
	            driver.findElement(By.id("j_idt88:j_idt119")).sendKeys("Selenium", Keys.ENTER);

	            // File upload (update path as needed)
	            WebElement upload = driver.findElement(By.id("j_idt88:j_idt121"));
	            upload.sendKeys("C:\\path\\to\\file.txt"); // Replace with actual file path

	            // Masked input, phone, credit card
	            driver.findElement(By.id("j_idt88:j_idt123")).sendKeys("1234567890", Keys.TAB);
	            driver.findElement(By.id("j_idt88:j_idt125")).sendKeys("+1 234 567 890", Keys.TAB);
	            driver.findElement(By.id("j_idt88:j_idt127")).sendKeys("4111 1111 1111 1111", Keys.TAB);

	            // Color picker
	            driver.findElement(By.id("j_idt88:j_idt129")).sendKeys("#FF5733", Keys.TAB);

	            // Range slider
	            WebElement slider = driver.findElement(By.id("j_idt88:j_idt131"));
	            slider.sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT);

	            // Textarea
	            driver.findElement(By.id("j_idt88:j_idt133")).sendKeys("Multiline input example...", Keys.TAB);

	            // Button click
	            driver.findElement(By.id("j_idt88:j_idt135")).click();

	        } finally {
	            //driver.quit();
	        }
	    }
	}


}
