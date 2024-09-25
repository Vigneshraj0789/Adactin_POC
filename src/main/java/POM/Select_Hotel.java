package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

    WebDriver driver;
    public  Select_Hotel (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "radiobutton_0")
    private WebElement radioBtn;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public void clickRdBtn(){
        radioBtn.click();
    }
    public void clickContBtn(){
        continueBtn.click();
    }

}
