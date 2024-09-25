package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseClass {
public static WebDriver driver;

    public static void launchBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Browser not found");
        }
    }
    public static void launchUrl(String URL){
        driver.get(URL);
    }
    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public boolean verifyURl(String URL){
        String currentURl = driver.getCurrentUrl();
        boolean contains = currentURl.contains(URL);
        return contains;
    }
    public static void quitBrowser(){
        driver.quit();
    }
}
