package Test_Cases;

import Assessment_Cases.Case1_Mobile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Case1_Test_Cases_Mobile {
    WebDriver driver;
    Case1_Mobile actions, homePage;

    @BeforeTest
    // This method runs before all the test methods and initializes the WebDriver, sets up the browser window size,
    // navigates to the home page, and initializes the actions object
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        // The user agent we want to behave as a mobile device
        String mobileUserAgent = "Mozilla/5.0 (Linux; Android 10; SM-G960F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.66 Mobile Safari/537.36";
        // Configure the ChromeDriver and set the user agent to mimic a mobile device
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-agent=" + mobileUserAgent);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        homePage = new Case1_Mobile(driver);
        homePage.goTo();
        actions = new Case1_Mobile(driver);
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
    // Test to verify the visibility and functionality of the "For Sale" button
    public  void forSaleButtonCheck() throws InterruptedException {
        WebElement forSaleButton = actions.forSaleButtonAction();
        Assert.assertTrue(forSaleButton.isDisplayed(), "For sale button is not visible");
        Assert.assertTrue(forSaleButton.isEnabled(), "For sale button is not enabled");
        actions.setForSale();
    }

    @Test(priority = 3)
    // Test to verify the title of the "For Sale" page
    public void forSalePageTitleTest(){
        String forSalePageTitle = driver.getTitle();
        Assert.assertEquals(forSalePageTitle, "Satılık Ev ve Konut İlanları | hepsiemlak", "For sale page title is wrong");
    }

    @Test(priority = 4)
    // Test to verify the visibility and functionality of the "Show Filter" button
    public void showFilterTest(){
        WebElement showFilter = actions.showFilterButtonAction();
        Assert.assertTrue(showFilter.isDisplayed(), "Show filter button is not visible");
        Assert.assertTrue(showFilter.isEnabled(), "Show filter button is not enabled");
        actions.setShowFilterButton();
    }

    @Test(priority =  5)
    // Test to close the cookie notification
    public void cookieClose() {
        actions.setCookieClose();
    }

    @Test(priority = 6)
    // Test to select a city from the dropdown
    public void cityDropdown() throws InterruptedException {
        WebElement cityDropdown = actions.cityDropdownButtonAction();
        Assert.assertTrue(cityDropdown.isDisplayed(), "City dropdown is not visible");
        Assert.assertTrue(cityDropdown.isEnabled(), "City dropdown is not enabled");
        actions.setCity("İzmir");
    }

    @Test(priority = 7)
    // Test to select a county from the dropdown
    public void countyDropDown() throws InterruptedException {
        WebElement countyDropdown = actions.countyDropdownButtonAction();
        Assert.assertTrue(countyDropdown.isDisplayed(), "County dropdown is not visible");
        Assert.assertTrue(countyDropdown.isEnabled(), "County dropdown is not enabled");
        actions.setCounty("Bornova");
    }

    @Test(priority = 8)
    // Test to select a category
    public void categorySelection() throws InterruptedException {
        WebElement categoryButton = actions.categorySelectionAction();
        Assert.assertTrue(categoryButton.isDisplayed(), "Category option is not visible");
        Assert.assertTrue(categoryButton.isEnabled(), "Category option is not enabled");
        actions.setCategorySelection();
    }

    @Test(priority = 9)
    // Test to input the minimum price
    public void  minPrice(){
        WebElement minPrice = actions.minPriceInputAction();
        Assert.assertTrue(minPrice.getText().trim().isEmpty(),"Input field is not empty");
        actions.setMinPriceInput("1000000");
    }

    @Test(priority = 10)
    // Test to input the maximum price
    public void maxPrice(){
        WebElement maxPrice = actions.maxPriceInputAction();
        Assert.assertTrue(maxPrice.getText().trim().isEmpty(),"Input field is not empty");
        actions.setMaxPriceInput("20000000");
    }

    @Test(priority = 11)
    // Test to select a property age range
    public void propertyAge() throws InterruptedException {
        WebElement propertyAgeDropdown = actions.propertyAgeAction();
        Assert.assertTrue(propertyAgeDropdown.isDisplayed(), "Property age dropdown is not visible");
        Assert.assertTrue(propertyAgeDropdown.isEnabled(), "Property age dropdown is not enabled");
        actions.setPropertyAge();
    }

    @Test(priority = 12)
    // Test to click the search button
    public void searchButton() throws InterruptedException {
        WebElement searchButton = actions.searchButtonAction();
        Assert.assertTrue(searchButton.isDisplayed(), "Search button is not visible");
        Assert.assertTrue(searchButton.isEnabled(), "Search button is not enabled");
        actions.setSearchButton();
    }

    @Test(priority = 13)
    // Test to verify the visibility and functionality of the "Show Filter" button
    public void showFilterAgainTest(){
        WebElement showFilter = actions.showFilterButtonAction();
        Assert.assertTrue(showFilter.isDisplayed(), "Show filter button is not visible");
        Assert.assertTrue(showFilter.isEnabled(), "Show filter button is not enabled");
        actions.setShowFilterButton();
    }

    @Test(priority = 14)
    // Test to verify the applied filters
    public void tagCheck(){
        String propertyAge1 = actions.propertyAgeTage1Action().getText();
        Assert.assertEquals(propertyAge1,"Sıfır Bina");

        String propertyAge2 = actions.propertyAgeTage2Action().getText();
        Assert.assertEquals(propertyAge2,"1-5");

        String propertyAge3 = actions.propertyAgeTage3Action().getText();
        Assert.assertEquals(propertyAge3,"6-10");

        String minPriceTag = actions.minPriceTagAction().getText();
        Assert.assertEquals(minPriceTag,"1.000.000 TL");

        String maxPriceTag = actions.maxPriceTagAction().getText();
        Assert.assertEquals(maxPriceTag,"20.000.000 TL");

        String propertyStatusTag = actions.propertyStatusTagAction().getText();
        Assert.assertEquals(propertyStatusTag,"Satılık");
    }

    @AfterTest
    // This method runs after all the test methods and quits the WebDriver
    public  void  afterTest(){
        driver.quit();
    }
}