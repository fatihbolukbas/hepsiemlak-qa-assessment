package Assessment_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Case2_Mobile {
    WebDriver driver;
    JavascriptExecutor js;
    public Case2_Mobile(WebDriver driver){
        this.driver = driver;
        this.js =(JavascriptExecutor) driver;
    }

    // Locates and returns the "For Rent" button WebElement
    By forRentButton = By.xpath("//a[@title='Kiralık İlanlar']");
    public WebElement forRentButtonAction(){
        return driver.findElement(forRentButton);
    }

    // Locates and returns the "Show Filter" button WebElement
    By showFilterButton = By.xpath("//button[@class='btn btn-white filterButton']");
    public WebElement showFilterButtonAction(){
        return driver.findElement(showFilterButton);
    }

    // Locates and returns the city dropdown button WebElement
    By cityDropdownButton = By.xpath("//div[@class='js-city-filter']");
    public  WebElement cityDropdownButtonAction(){
        return driver.findElement(cityDropdownButton);
    }

    // Locates and returns the city text input WebElement
    By cityTextInput = By.xpath("//input[@placeholder='İl ara']");
    public  WebElement cityTextInputAction(){
        return driver.findElement(cityTextInput);
    }

    // Locates and returns the city selection WebElement
    By citySelection = By.xpath("//a[@class='js-city-filter__list-link']");
    public  WebElement citySelectionAction(){
        return driver.findElement(citySelection);
    }

    // Locates and returns the county dropdown button WebElement
    By countyDropdownButton = By.xpath("//section[@class='filter-item-wrap loc locationCountySec']");
    public  WebElement countyDropdownButtonAction(){
        return driver.findElement(countyDropdownButton);
    }

    // Locates and returns the county text input WebElement
    By countyTextInput = By.xpath("//input[@placeholder='İlçe ara']");
    public  WebElement countyTextInputAction(){
        return driver.findElement(countyTextInput);
    }

    // Locates and returns the county selection WebElement
    By countySelection = By.xpath("//div[@class='he-checkbox__input']");
    public  WebElement countySelectionAction(){
        return driver.findElement(countySelection);
    }

    // Locates and returns the county dropdown close button WebElement
    By countyDropdownCloseButton = By.cssSelector(".js-county-filter .he-select-base__chevron");
    public WebElement countyDropdownCloseButtonAction(){
        return driver.findElement(countyDropdownCloseButton);
    }

    // Locates and returns the cookie close button WebElement
    By cookieClose = By.cssSelector(".cookie-policy  svg");
    public  WebElement cookieCloseAction(){
        return driver.findElement(cookieClose);
    }

    // Locates and returns the room and hall count dropdown button WebElement
    By roomAndHallDropdownButton = By.xpath("//section[@class='roomTypeSec']//section[@class='filter-item-wrap']");
    public  WebElement roomAndHallDropdownButtonAction(){
        return driver.findElement(roomAndHallDropdownButton);
    }

    // Locates and returns the room and hall count option WebElement
    By roomAndHallOption = By.cssSelector("li:nth-of-type(3)  .room-type-select-item");
    public  WebElement roomAndHallButtonOptionAction(){
        return driver.findElement(roomAndHallOption);
    }

    // Locates and returns the within housing estate dropdown WebElement
    By withinHousingEstateDropdown = By.xpath("//div[@class='js-within-site-filter']");
    public  WebElement withinHousingEstateDropdownAction(){
        return driver.findElement(withinHousingEstateDropdown);
    }

    // Locates and returns the within housing estate option WebElement
    By withinHousingEstateOption = By.cssSelector("li:nth-of-type(2) > .he-radio.he-select__radio");
    public  WebElement withinHousingEstateOptionAction(){
        return driver.findElement(withinHousingEstateOption);
    }

    // Locates and returns the search button WebElement
    By searchButton = By.xpath("//a[@class=\"btn btn-red btn-large\"]");
    public  WebElement searchButtonAction(){
        return driver.findElement(searchButton);
    }

    // Locates and returns the advert list WebElement
    By advertListParent = By.xpath("//ul[@class='list-items-container']");
    public  WebElement findParentElementAction(){
        return driver.findElement(advertListParent);
    }

    // Locates and returns the third advert WebElement
    public WebElement findThirdChildElementOfParentAction() {
        WebElement parentElement = findParentElementAction();
        List<WebElement> childElements = parentElement.findElements(By.xpath("./*"));
        return childElements.get(2);
    }

    // Locates and returns the show number button WebElement
    By showPhoneNumberButton = By.xpath("(//div[@class='owner-phone-numbers-wrapper'])[1]");
    public  WebElement showNumberButtonAction(){
        return driver.findElement(showPhoneNumberButton);
    }

    // Locates and returns the phone number list WebElement
    By phoneNumberList = By.xpath("(//ul[@class='owner-phone-numbers-list'])[1]");
    public WebElement phoneNumberListAction(){
        return driver.findElement(phoneNumberList);
    }

    // Locates and returns each element of phone number list WebElement
    public List<WebElement> findChildPhoneNumberElementsAction() {
        WebElement parentElement = phoneNumberListAction();
        return parentElement.findElements(By.xpath("./*"));
    }


    // Navigates to the page
    public void goTo() {
        driver.get("https://www.hepsiemlak.com/");
    }

    // Performs actions to click the "For Rent" button
    public void setForRent() throws InterruptedException {
        forRentButtonAction().click();
        Thread.sleep(1500);
    }

    // Performs actions to click the "Show Filter" button
    public void setShowFilterButton(){
        showFilterButtonAction().click();
    }

    // Sets the city by entering text into the city text input field
    public void setCity(String city) throws InterruptedException {
        cityDropdownButtonAction().click();
        cityTextInputAction().sendKeys(city);
        citySelectionAction().click();
        Thread.sleep(1000);
    }

    // Sets the county by entering text into the county text input field
    public void setCounty(String county) {
        countyDropdownButtonAction().click();
        countyTextInputAction().sendKeys(county);
        countySelectionAction().click();
        countyDropdownCloseButtonAction().click();
    }

    // Closes the cookie notification
    public void setCookieClose(){
        cookieCloseAction().click();
    }

    // Sets the room and hall count selection
    public void setRoomAndHall(){
        if(isElementInView(driver, roomAndHallDropdownButtonAction())){
            roomAndHallDropdownButtonAction().click();
        }else {
            while (!isElementInView(driver, roomAndHallDropdownButtonAction())){
                js.executeScript("window.scrollBy(0, 250);");
            }
            roomAndHallDropdownButtonAction().click();
        }
        if(isElementInView(driver, roomAndHallButtonOptionAction())){
            roomAndHallButtonOptionAction().click();
        }else {
            while (!isElementInView(driver, roomAndHallButtonOptionAction())){
                js.executeScript("window.scrollBy(0, 250);");
            }
            roomAndHallButtonOptionAction().click();
        }
        if(isElementInView(driver, roomAndHallDropdownButtonAction())){
            roomAndHallDropdownButtonAction().click();
        }else {
            while (!isElementInView(driver, roomAndHallDropdownButtonAction())){
                js.executeScript("window.scrollBy(0, 250);");
            }
            roomAndHallDropdownButtonAction().click();
        }
    }

    // Sets the within housing estate selection
    public void setWithinHousingEstate(){
        if(isElementInView(driver, withinHousingEstateDropdownAction())){
            withinHousingEstateDropdownAction().click();
        }else {
            while (!isElementInView(driver, withinHousingEstateDropdownAction())){
                js.executeScript("window.scrollBy(0, 500);");
            }
            withinHousingEstateDropdownAction().click();
        }
        if(isElementInView(driver, withinHousingEstateOptionAction())){
            withinHousingEstateOptionAction().click();
        }else {
            while (!isElementInView(driver, withinHousingEstateOptionAction())){
                js.executeScript("window.scrollBy(0, 500);");
            }
            withinHousingEstateOptionAction().click();
        }
    }

    // Clicks the search button
    public void setSearchButton() throws InterruptedException {
        searchButtonAction().click();
        Thread.sleep(2000);
    }

    // Clicks the third element on advert list
    public void setClickOnThirdChildElement() throws InterruptedException {
        findThirdChildElementOfParentAction().click();
        Thread.sleep(3000);
    }

    // Clicks the show phone number button
    public void setShowNumberButton() throws InterruptedException {
        showNumberButtonAction().click();
        Thread.sleep(1500);
    }

    // Checks whether an element is in view
    public static boolean isElementInView(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (boolean) js.executeScript("var rect = arguments[0].getBoundingClientRect();" +
                "return (" +
                "rect.top >= 0 && " +
                "rect.left >= 0 && " +
                "rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) && " +
                "rect.right <= (window.innerWidth || document.documentElement.clientWidth)" +
                ");", element);
    }
}
