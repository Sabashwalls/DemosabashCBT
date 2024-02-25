import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovier {

    @Test(dataProvider = "dp")
    public void data(String email, String password) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.shoppersstack.com/user-signin");
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        
        // Close the WebDriver instance
        driver.quit();
    }

    @DataProvider(name = "dp")
    String[][] loginData() {
        String data[][] = { 
            { "email@gmail.com", "user@123" }, 
            { "emaiadsasdl@gmail.com", "useasdr@123" } 
        };
        return data;
    }

}
