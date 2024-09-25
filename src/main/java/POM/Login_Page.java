package POM;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends BaseClass {
    WebDriver driver;
    public Login_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login']")
    private WebElement login;

    public void enterCredential(String uName , String pass){
       userName.sendKeys(uName);
       password.sendKeys(pass);
    }
    public void clickLoginBtn(){
        login.click();
    }

}
