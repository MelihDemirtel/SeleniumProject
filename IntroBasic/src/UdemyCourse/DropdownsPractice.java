package UdemyCourse;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		String selectByIndex = dropdown.getFirstSelectedOption().getText();
		System.out.println("selectByIndex : "+selectByIndex);
		
		Thread.sleep(1000);
		
		dropdown.selectByVisibleText("AED");
		String selectByVisibleText = dropdown.getFirstSelectedOption().getText();
		System.out.println("selectByVisibleText : "+selectByVisibleText);
		
		Thread.sleep(1000);
		
		dropdown.selectByValue("INR");
		String selectByValue = dropdown.getFirstSelectedOption().getText();
		System.out.println("selectByValue : "+selectByValue);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);

		for(int i = 0; i < 2; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(500);
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		String adultsNumber = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println("adultsNumber : "+adultsNumber);

		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='11']")).click();

		Thread.sleep(1000);
	
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		WebElement seniorCitizenDiscount = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		seniorCitizenDiscount.click();
		Thread.sleep(1000);

		Assert.assertTrue(seniorCitizenDiscount.isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

				
	}

}
