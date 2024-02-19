package Test_Cases;
import Assessment_Cases.Case2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Case2_Test_Cases {
    WebDriver driver;
    Case2 actions, homePage;

    @BeforeTest
    // This method runs before all the test methods and initializes the WebDriver, sets up the browser window size,
    // navigates to the home page, and initializes the actions object
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new Case2(driver);
        homePage.goTo();
        actions = new Case2(driver);
    }

    @Test(priority = 1)
    // Test to verify the title of the home page
    public void homePageTitleTest() throws InterruptedException {
        String homePageTitle = driver.getTitle();
        Assert.assertEquals(homePageTitle, "Hepsiemlak | Satılık, Kiralık Ev & Emlak İlanları", "Home page title is wrong");
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    @Test(priority = 2)
    // Test to verify the visibility and functionality of the "For Rent" button
    public  void forRentButtonCheck() throws InterruptedException {
        WebElement forRentButton = actions.forRentButtonAction();
        Assert.assertTrue(forRentButton.isDisplayed(), "For rent button is not visible");
        Assert.assertTrue(forRentButton.isEnabled(), "For rent button is not enabled");
        actions.setForRentButton();
    }

    @Test(priority = 3)
    // Test to verify the title of the "For Rent" page
    public void forRentPageTitleTest(){
        String forRentPageTitle = driver.getTitle();
        Assert.assertEquals(forRentPageTitle, "Kiralık Konut Fiyatları ve İlanları | hepsiemlak", "For rent page title is wrong");
    }

    @Test(priority = 4)
    // Test to select a city from the dropdown
    public void cityDropdown() throws InterruptedException {
        WebElement cityDropdown = actions.cityDropdownButtonAction();
        Assert.assertTrue(cityDropdown.isDisplayed(), "City dropdown is not visible");
        Assert.assertTrue(cityDropdown.isEnabled(), "City dropdown is not enabled");
        actions.setCity("Ankara");
    }

    @Test(priority =  5)
    // Test to select a county from the dropdown
    public void countyDropDown() throws {
        WebElement countyDropdown = actions.countyDropdownButtonAction();
        Assert.assertTrue(countyDropdown.isDisplayed(), "County dropdown is not visible");
        Assert.assertTrue(countyDropdown.isEnabled(), "County dropdown is not enabled");
        actions.setCounty("Çankaya");
    }

    @Test(priority = 6)
    // Test to select room and hall count
    public void roomAndHall(){
        WebElement roomAndHall = actions.roomAndHallDropdownButtonAction();
        Assert.assertTrue(roomAndHall.isDisplayed(), "Property age dropdown is not visible");
        Assert.assertTrue(roomAndHall.isEnabled(), "Property age dropdown is not enabled");
        actions.setRoomAndHall();
    }

    @Test(priority = 7)
    // Test to select room and hall count
    public void withinHousingEstate(){
        WebElement withinHousingEstate = actions.withinHousingEstateDropdownAction();
        Assert.assertTrue(withinHousingEstate.isDisplayed(), "Property age dropdown is not visible");
        Assert.assertTrue(withinHousingEstate.isEnabled(), "Property age dropdown is not enabled");
        actions.setWithinHousingEstate();
    }

    @Test(priority = 8)
    // Test to click the search button
    public void searchButton() throws InterruptedException {
        WebElement searchButton = actions.searchButtonAction();
        Assert.assertTrue(searchButton.isDisplayed(), "Search button is not visible");
        Assert.assertTrue(searchButton.isEnabled(), "Search button is not enabled");
        actions.setSearchButton();
    }

    @Test(priority = 9)
    // Test to click third element on the advert list
    public void advertSelect() throws InterruptedException {
        WebElement advertSelect = actions.findThirdChildElementOfParentAction();
        Assert.assertTrue(advertSelect.isDisplayed(), "Search button is not visible");
        Assert.assertTrue(advertSelect.isEnabled(), "Search button is not enabled");
        actions.setClickOnThirdChildElement();
    }

    @Test(priority = 10)
    // Test to click show phone number button
    public void showPhoneNumber() throws InterruptedException {
        WebElement showPhoneNumber = actions.showNumberButtonAction();
        Assert.assertTrue(showPhoneNumber.isDisplayed(), "Search button is not visible");
        Assert.assertTrue(showPhoneNumber.isEnabled(), "Search button is not enabled");
        actions.setShowNumberButton();
    }

    @Test(priority = 11)
    //Test to assert phone numbers
    public void testPhoneNumberFormat() {
        List<WebElement> phoneNumbers = actions.findChildElementsAction();
        for (WebElement phoneNumber : phoneNumbers) {
            String phoneNumberText = phoneNumber.getText().replaceAll("\\s", "");
            Assert.assertEquals(phoneNumberText.length(), 11, "Phone number is not 11 digits: " + phoneNumberText);
            Assert.assertEquals(phoneNumberText.charAt(0), '0', "Phone number does not start with 0: " + phoneNumberText);
        }
    }

    @AfterTest
    // This method runs after all the test methods and quits the WebDriver
    public  void  afterTest(){
        driver.quit();
    }
}

