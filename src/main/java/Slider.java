import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider extends BaseClass{

	static BaseClass pom=new BaseClass();
	
	@Test
	public static void slider() throws InterruptedException {
		
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw=='])[1]/self::iframe")));
		WebElement webwl = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]/self::span"));
	
		
		Actions a = new Actions(driver);
		a.dragAndDropBy(webwl, -45, 0).perform();
	
	}
}
