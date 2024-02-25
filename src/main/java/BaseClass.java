import java.time.Duration;

import javax.crypto.interfaces.DHPublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public static void Mai() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterClass
	public static void logout() {
		driver.close();
	}
	
	@DataProvider(name="dp")
	public String [][]logindata() {
		
		String data[][]= {{"user@gmail.com","useer123"},{"user1234@gmail.com", "user123"}};
		return data;
		
	}

}
