package UdemyCourse;

import java.net.SocketException;
import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsPracticeTest {
	static WebDriver driver;
	static WebElement staticDropdown;
	static Select dropdown;
	static int second = 1000;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}
	
	@AfterClass
	public static void tearDown() throws SocketException{
		driver.close();
	}
	
	@Test
	public void test01() throws InterruptedException {
		staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		String selectByIndex = dropdown.getFirstSelectedOption().getText();
		System.out.println("selectByIndex : "+selectByIndex);
		
		Assert.assertEquals("USD", selectByIndex);
		
		Thread.sleep(second);
	}
	
	@Test
	public void test02() throws InterruptedException {
		staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		dropdown = new Select(staticDropdown);
		
		dropdown.selectByVisibleText("AED");
		String selectByVisibleText = dropdown.getFirstSelectedOption().getText();
		System.out.println("selectByVisibleText : "+selectByVisibleText);
		
		Assert.assertEquals("AED", selectByVisibleText);

		Thread.sleep(second);
	}
	
	@Test
	public void test03() throws InterruptedException {
		staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		dropdown = new Select(staticDropdown);
		
		dropdown.selectByValue("INR");
		String selectByValue = dropdown.getFirstSelectedOption().getText();
		System.out.println("selectByValue : "+selectByValue);
		
		Assert.assertEquals("INR", selectByValue);
		
		Thread.sleep(second);
	}
	
	@Test
	public void test04() throws InterruptedException {
		driver.findElement(By.id("divpaxinfo")).click();

		for(int i = 0; i < 2; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(500);
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		String adultsNumber = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println("adultsNumber : "+adultsNumber);

		Assert.assertEquals("3 Adult", adultsNumber);
		
		Thread.sleep(second);
	}
	
	@Test
	public void test05() throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		WebElement from = driver.findElement(By.xpath("//a[@value='MAA']"));
		Assert.assertTrue(from.isDisplayed());
		Thread.sleep(second);
		from.click();
		Thread.sleep(second);

		WebElement departFrom = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		System.out.println("departFrom : "+departFrom.getAttribute("value"));
		Assert.assertTrue(departFrom.getAttribute("value").contains("Chennai (MAA)"));

		WebElement to = driver.findElement(By.xpath("(//a[@text='Delhi (DEL)'])[2]"));
		Assert.assertTrue(to.isDisplayed());
		Thread.sleep(second);
		to.click();		
		Thread.sleep(second);

		WebElement returnTo = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		System.out.println("returnTo : "+returnTo.getAttribute("value"));
		Assert.assertTrue(returnTo.getAttribute("value").contains("Delhi (DEL)"));
	}
	
	@Test
	public void test06() throws InterruptedException {
		WebElement depart = driver.findElement(By.xpath("//a[text()='11']"));
		Assert.assertTrue(depart.isDisplayed());	
		Thread.sleep(second);
		depart.click();		
	}
	
	@Test
	public void test07() throws InterruptedException {
		WebElement autosuggest = driver.findElement(By.id("autosuggest"));
		autosuggest.sendKeys("ind");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
	}
	
	@Test
	public void test08() throws InterruptedException {
		WebElement seniorCitizenDiscount = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		seniorCitizenDiscount.click();
		Thread.sleep(second);

		Assert.assertTrue(seniorCitizenDiscount.isSelected());
	}
	
	@Test
	public void test09() throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(2000);

	}
	

}
