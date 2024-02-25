import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dimension {
    public static void main(String[] args) {
        // Create a dimension object with desired width and height
        Dimension dimension = new Dimension();

        // Set up the WebDriver
        WebDriver driver = new ChromeDriver();

        // Set the window size
         System.out.println(driver.manage().window().getSize());
         org.openqa.selenium.Dimension dd = new org.openqa.selenium.Dimension(200, 300);
         driver.manage().window().setSize(dd);
    }
}
