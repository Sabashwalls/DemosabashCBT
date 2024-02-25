import java.time.Duration;
import javax.print.attribute.standard.JobHoldUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class Auto {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		//driver.findElement(By.id("Grid Sorting")).click();
		driver.switchTo().frame("globalSqa");
		//Thread.sleep(4000);
		driver.findElement(By.id("s")).sendKeys("safaada");
		driver.findElement(By.id("current_filter")).click();
		driver.findElement(By.xpath("//div[@data-option-value='.performance-testing']")).click();
		
		//WebElement source = driver.findElement(By.id("s")).click();
		//WebElement destination = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[2]"));
		//Actions a = new Actions(driver);
		//a.dragAndDrop(source, destination).perform();
		//driver.quit();
	}
}
