import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Spinner extends BaseClass{

	static BaseClass pom=new BaseClass();
	
	@Test
	public static void spinner() throws InterruptedException {
		
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Window");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement Web = driver.findElement(By.xpath("(//div[@class='resp-tabs-container']/descendant::a)[2]"));
	//System.out.println(Web);
	Web.click();
	Set<String> wind = driver.getWindowHandles();
	for (String i : wind) {
		driver.switchTo().window(i);
		String title = driver.getCurrentUrl();
		System.out.println(title);
		//driver.close();
	}

	}

}
