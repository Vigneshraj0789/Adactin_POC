package Step_Definition;

import Base.BaseClass;
import POM.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class StepDef extends BaseClass {
        Login_Page loginPage;
        Search_Hotel searchHotel;
        Select_Hotel selectHotel;
        Book_Hotel bookHotel;
        Book_Confirmation bookConfirmation;


    @Given("Launch {string} and url {string}")
    public void launchAndUrl(String browser, String link) {
        BaseClass.launchBrowser(browser);
        BaseClass.maximizeWindow();
        BaseClass.launchUrl(link);
        BaseClass.implicitWait();
        loginPage = new Login_Page(driver);
        searchHotel =new Search_Hotel(driver);
        selectHotel = new Select_Hotel(driver);
        bookHotel = new Book_Hotel(driver);
        bookConfirmation = new Book_Confirmation(driver);
    }
    @When("User login website by enters username as {string} and password as {string}")
    public void userLoginWebsiteByEntersUsernameAsAndPasswordAs(String uName, String password) {
        loginPage.enterCredential(uName,password);
        loginPage.clickLoginBtn();
    }
    @Then("User lands on search hotel page and verifies the URL contains {string} text")
    public void userLandsOnSearchHotelPageAndVerifiesTheURLContainsText(String text) {
        Assert.assertTrue(verifyURl(text));
    }
    @When("User selects location as New York")
    public void userSelectsLocationAsNewYork() {
        searchHotel.selLocation();
    }
    @When("User selects hotel as Hotel Cornice")
    public void userSelectsHotelAsHotelCornice() {
        searchHotel.selHotel();
    }
    @When("User selects room type Super Deluxe")
    public void userSelectsRoomTypeSuperDeluxe() {
         searchHotel.selRoomtype();
    }
    @When("User selects two number of rooms")
    public void userSelectsTwoNumberOfRooms() {
          searchHotel.selNoOfRooms();
    }
    @When("User adds check in date {string}")
    public void userAddsCheckInDate(String inDate) {
         searchHotel.selCheckInDate(inDate);
    }
    @When("User adds check out date {string}")
    public void userAddsCheckOutDate(String outDate) {
         searchHotel.selCheckOutDate(outDate);
    }
    @When("User selects two adults")
    public void userSelectsTwoAdults() {
         searchHotel.selAdultRoom();
    }
    @When("User selects two children")
    public void userSelectsTwoChildren() {
        searchHotel.selChildRoom();
    }
    @When("User clicks on search button")
    public void userClicksOnSearchButton() {
        searchHotel.clickSearchBtn();
    }
    @Then("User lands on select hotel page and verifies the URL contains {string} text")
    public void userLandsOnSelectHotelPageAndVerifiesTheURLContainsText(String text1) {
         Assert.assertTrue(verifyURl(text1));
    }
    @When("User selects radio button")
    public void userSelectsRadioButton() {
         selectHotel.clickRdBtn();
    }
    @When("User clicks on continue button")
    public void userClicksOnContinueButton() {
          selectHotel.clickContBtn();
    }
    @Then("User lands on book hotel page and verifies the URL contains {string} text")
    public void userLandsOnBookHotelPageAndVerifiesTheURLContainsText(String text2) {
         Assert.assertTrue(verifyURl(text2));
    }
    @Then("User enters first name as {string}")
    public void userEntersFirstNameAs(String fName) {
        bookHotel.addFirstName(fName);
    }
    @Then("User enters last name as {string}")
    public void userEntersLastNameAs(String lName) {
        bookHotel.addLastName(lName);
    }
    @Then("User enters billing address as {string}")
    public void userEntersBillingAddressAs(String address) {
        bookHotel.addAddress(address);
    }
    @Then("User enters credit card number {string}")
    public void userEntersCreditCardNumber(String ccNum) {
         bookHotel.adCardNum(ccNum);
    }
    @Then("User selects American Express card")
    public void userSelectsAmericanExpressCard() {
         bookHotel.selCardType();
    }
    @Then("User selects month and year in expiry date")
    public void userSelectsMonthAndYearInExpiryDate() {
         bookHotel.selExpMonth();
         bookHotel.selExpYear();
    }
    @Then("User enters CVV number {string}")
    public void userEntersCVVNumber(String cvvNum) {
         bookHotel.selCvvNum(cvvNum);
    }
    @Then("User click on book now button")
    public void userClickOnBookNowButton() {
         bookHotel.clickBookBtn();
    }
    @Given("User takes screenshot of the booking confrimation page")
    public void userTakesScreenshotOfTheBookingConfrimationPage() throws IOException, InterruptedException {
          bookConfirmation.screenShot();
    }
    @Then("User quits the browser")
    public void userQuitsTheBrowser() {
          quitBrowser();
    }

}
