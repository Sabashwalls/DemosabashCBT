import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Demo extends BaseClass{

	@Test(dataProvider = "dp")
	public static void testdata(String email, String password) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(4000);
		assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
		
		
		
		


	
}
