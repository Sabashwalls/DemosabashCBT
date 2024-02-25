import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;

public class Scrrenshot {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://example.com");

        // Take a screenshot and save it as a file
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the location to save the screenshot
        String screenshotPath = "path/to/save/screenshot.png";

        // Move the screenshot file to the specified location
        screenshotFile.renameTo(new File(screenshotPath));
        
        ChromeOptions chr = new ChromeOptions();
        chr.setAcceptInsecureCerts(true);
        
        
        

        // Close the browser
        driver.quit();
    }
}
