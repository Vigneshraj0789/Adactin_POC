package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Book_Hotel {

    WebDriver driver;

    public Book_Hotel(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "first_name")
    private WebElement firstname;

    @FindBy(id = "last_name")
    private WebElement lastname;

    @FindBy(id = "address")
    private WebElement addField;

    @FindBy(id = "cc_num")
    private WebElement creditCardNum;

    @FindBy(id ="cc_type")
    private WebElement creCardType;

    @FindBy(id = "cc_exp_month")
    private WebElement expMonth;

    @FindBy(id = "cc_exp_year")
    private WebElement expYear;

    @FindBy(id = "cc_cvv")
    private WebElement cVV;

    @FindBy(id = "book_now")
    private WebElement bookBtn;

    public void addFirstName(String name){
        firstname.sendKeys(name);
    }
    public void addLastName(String name1){
        lastname.sendKeys(name1);
    }
    public void addAddress(String address){
        addField.sendKeys(address);
    }
    public void adCardNum(String num){
        creditCardNum.sendKeys(num);
    }
    public void selCardType(){
        Select s = new Select(creCardType);
        s.selectByVisibleText("American Express");
    }
    public void selExpMonth(){
        Select s = new Select(expMonth);
        s.selectByVisibleText("October");
    }
    public void selExpYear(){
        Select s = new Select(expYear);
        s.selectByVisibleText("2027");
    }
    public void selCvvNum(String num){
        cVV.sendKeys(num);
    }
    public void clickBookBtn(){
        bookBtn.click();
    }
}
