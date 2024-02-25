import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouseover extends BaseClass{

	static BaseClass pom=new BaseClass();
	
	@Test
	public static void slider() throws InterruptedException {
		
		driver.get("https://www.globalsqa.com/demo-site/tooltip/");
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw=='])[1]/self::iframe")));
		WebElement web = driver.findElement(By.xpath("//img[@alt=\"St. Stephen's Cathedral\"]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(web).perform();
		
		
	
	}
}
