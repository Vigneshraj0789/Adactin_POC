package POM;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class Book_Confirmation {
    WebDriver driver;
    TakesScreenshot ts;

    public Book_Confirmation(WebDriver driver){
        this.driver = driver;
        ts = (TakesScreenshot) driver;
        PageFactory.initElements(driver,this);
    }
    public void screenShot() throws IOException,InterruptedException{
        Thread.sleep(5000);
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\VIGNESHRAJ\\IdeaProjects\\Adactin\\target\\snap.png");
        FileUtils.copyFile(src,des);
    }
}
