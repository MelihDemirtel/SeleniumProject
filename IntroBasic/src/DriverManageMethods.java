import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods {

	public static void main(String[] args) {
		// Launch Chrome Diver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
						
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Goes To The URL We Typed
		driver.get("https://www.amazon.com");
				
		// Get Current Page Size
		System.out.println(driver.manage().window().getSize());
		
		// Set Current Page Size
		driver.manage().window().setSize(new Dimension(800,600));
		
		// Get Current Page Position
		System.out.println(driver.manage().window().getPosition());
		
		//Set Current Page Position
		driver.manage().window().setPosition(new Point(200,15));
		
		
		// Get Current Page Size
		System.out.println("New Window Size : "+driver.manage().window().getSize());
		// Get Current Page Position
		System.out.println("New Position's Dimension : "+driver.manage().window().getPosition());
		
		// Set Window Maximize
		driver.manage().window().maximize();
		System.out.println("Maximize Window Size : "+driver.manage().window().getSize());
		System.out.println("Maximize Position : "+driver.manage().window().getPosition());
		
		// Set Window FullScreen
		driver.manage().window().fullscreen();
		System.out.println("FullScreen Window Size : "+driver.manage().window().getSize());
		System.out.println("FullScreen Position : "+driver.manage().window().getPosition());
		
		// Set Window Minimize
		driver.manage().window().minimize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
	}

}
