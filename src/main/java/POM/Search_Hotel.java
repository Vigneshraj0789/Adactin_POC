package POM;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_Hotel extends BaseClass {

    WebDriver driver;

    public Search_Hotel(WebDriver driver){
           this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "location")
    private WebElement location;

    @FindBy(id = "hotels")
    private WebElement selectHotel;

    @FindBy(id = "room_type")
    private WebElement selectRoomType;

    @FindBy(xpath = "//select[@id='room_nos']")
    private WebElement selectNoOfRooms;

    @FindBy(id = "datepick_in")
    private WebElement checkInDate;

    @FindBy(id = "datepick_out")
    private WebElement checkOutDate;

    @FindBy(id = "adult_room")
    private WebElement adultRoom;

    @FindBy(id = "child_room")
    private WebElement childRoom;

    @FindBy(id = "Submit")
    private WebElement searchBtn;

    public boolean verifyURl(String URL){
        String currentURL = driver.getCurrentUrl();
        boolean containsURL = currentURL.contains(URL);
        return containsURL;
    }
    public void selLocation(){
        Select s = new Select(location);
        s.selectByVisibleText("New York");
    }
    public void selHotel(){
        Select s = new Select(selectHotel);
        s.selectByVisibleText("Hotel Cornice");
    }
    public void selRoomtype(){
        Select s = new Select(selectRoomType);
        s.selectByVisibleText("Super Deluxe");
    }
    public void selNoOfRooms(){
        Select s = new Select(selectNoOfRooms);
        s.selectByValue("2");
    }
    public void selCheckInDate(String dates){
        checkInDate.sendKeys(dates);
    }
    public void selCheckOutDate(String date1){
        checkOutDate.sendKeys(date1);
    }
    public void selAdultRoom(){
        Select s = new Select(adultRoom);
        s.selectByValue("2");
    }
    public void selChildRoom(){
        Select s = new Select(childRoom);
        s.selectByValue("2");
    }
    public void clickSearchBtn(){
        searchBtn.click();
    }
}
