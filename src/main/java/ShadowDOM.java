import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShadowDOM extends BaseClass {
    
    static BaseClass pom = new BaseClass();

    @Test
    public static void shadowDOM() throws InterruptedException {
        driver.get("chrome://downloads/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement search = (WebElement) js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
        String jas = "arguments[0].value = 'Searchuser'";
        ((JavascriptExecutor) driver).executeScript(jas, search);
    }
}
