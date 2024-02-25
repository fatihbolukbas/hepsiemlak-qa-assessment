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
        this.js = (JavascriptExecutor) driver;
    }

    // Locates and returns the "For Rent" button WebElement
    By forRentButton = By.xpath("//span[@class='he-svg left-icon he-svg--kiralik']");
    public WebElement forRentButtonAction(){
        return driver.findElement(forRentButton);
    }

    // Locates and returns the "Show Filter" button WebElement
    By showFilterButton = By.xpath("//span[@class='filterCountVal']");
    public WebElement showFilterButtonAction(){
        return driver.findElement(showFilterButton);
    }

    // Locates and returns the city dropdown button WebElement
    By cityDropdownButton = By.xpath("//div[@class='city']");
    public  WebElement cityDropdownButtonAction(){
        return driver.findElement(cityDropdownButton);
    }

    // Locates and returns the city text input WebElement
    By cityTextInput = By.xpath("//input[@placeholder='İl Ara']");
    public  WebElement cityTextInputAction(){
        return driver.findElement(cityTextInput);
    }

    // Locates and returns the city selection WebElement
    By cityListSelection = By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']");
    public  WebElement cityListSelectionAction(){
        return driver.findElement(cityListSelection);
    }

    // Locates and returns the city list after search
    public List<WebElement> findDesiredCityAction(){
        WebElement cities = cityListSelectionAction();
        return cities.findElements(By.xpath("./*"));
    }

    // Locates and returns the confirm button WebElement
    By confirmButton = By.xpath("//div[@class='action-btn action-btn__confirm']");
    public  WebElement confirmButtonAction(){
        return driver.findElement(confirmButton);
    }

    // Locates and returns the county dropdown button WebElement
    By countyDropdownButton = By.cssSelector(".county .he-select-base__control");
    public  WebElement countyDropdownButtonAction(){
        return driver.findElement(countyDropdownButton);
    }

    // Locates and returns the county text input WebElement
    By countyTextInput = By.xpath("//input[@placeholder='İlçe Ara']");
    public  WebElement countyTextInputAction(){
        return driver.findElement(countyTextInput);
    }

    // Locates and returns the county selection WebElement
    By countyListSelection = By.xpath("//div[@class='vue-recycle-scroller__item-wrapper']");
    public  WebElement countyListSelectionAction(){
        return driver.findElement(countyListSelection);
    }

    // Locates and returns the county list after search
    public List<WebElement> findDesiredCountyAction(){
        WebElement counties = countyListSelectionAction();
        return counties.findElements(By.xpath("./*"));
    }

    // Locates and returns the cookie close button WebElement
    By cookieClose = By.cssSelector(".cookie-policy  svg");
    public  WebElement cookieCloseAction(){
        return driver.findElement(cookieClose);
    }

    // Locates and returns the room and hall count dropdown button WebElement
    By roomAndHallDropdownButton = By.cssSelector(".room-type .he-select-base__control");
    public  WebElement roomAndHallDropdownButtonAction(){
        return driver.findElement(roomAndHallDropdownButton);
    }

    // Locates and returns the room and hall count option WebElement
    By roomAndHallOption = By.cssSelector("div:nth-of-type(3) > .he-multiselect__item");
    public  WebElement roomAndHallButtonOptionAction(){
        return driver.findElement(roomAndHallOption);
    }

    // Locates and returns the within housing estate dropdown WebElement
    By withinHousingEstateDropdown = By.cssSelector(".within-site .he-select-base__control--has-value");
    public  WebElement withinHousingEstateDropdownAction(){
        return driver.findElement(withinHousingEstateDropdown);
    }

    // Locates and returns the within housing estate option WebElement
    By withinHousingEstateOption = By.cssSelector("div:nth-of-type(2) > .he-select__item");
    public  WebElement withinHousingEstateOptionAction(){
        return driver.findElement(withinHousingEstateOption);
    }

    // Locates and returns the search button WebElement
    By searchButton = By.xpath("//button[@class='btn btn-red get-result']");
    public  WebElement searchButtonAction(){
        return driver.findElement(searchButton);
    }

    // Locates and returns the advert list WebElement
    By advertListParent = By.xpath("//ul[@class='reality-list']");
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
    By showPhoneNumberButton = By.cssSelector(".wrapper button#call-owner");
    public  WebElement showNumberButtonAction(){
        return driver.findElement(showPhoneNumberButton);
    }

    // Locates and returns the phone number list WebElement
    By phoneNumberList = By.cssSelector(".bottom-sheet ul");
    public WebElement phoneNumberListAction(){
        return driver.findElement(phoneNumberList);
    }

    // Locates and returns each element of phone number list WebElement
    public List<WebElement> findChildElementsAction() {
        WebElement parentElement = phoneNumberListAction();
        return parentElement.findElements(By.cssSelector("li"));
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
    public void setCity(String cityToFind) throws InterruptedException {
        cityDropdownButtonAction().click();
        cityTextInputAction().sendKeys(cityToFind);
        Thread.sleep(1000);
        List<WebElement> citiesList = findDesiredCityAction();
        for(WebElement city : citiesList) {
            if (city.getText().equalsIgnoreCase(cityToFind)) {
                city.click();
                break;
            }
        }
        confirmButtonAction().click();
        Thread.sleep(1000);
    }

    // Sets the county by entering text into the county text input field
    public void setCounty(String countyToFind) throws InterruptedException {
        countyDropdownButtonAction().click();
        countyTextInputAction().sendKeys(countyToFind);
        Thread.sleep(1000);
        List<WebElement> countiesList = findDesiredCountyAction();
        for(WebElement county : countiesList) {
            if (county.getText().equalsIgnoreCase(countyToFind)) {
                county.click();
                break;
            }
        }
        confirmButtonAction().click();
        Thread.sleep(1000);
    }

    // Closes the cookie notification
    public void setCookieClose(){
        cookieCloseAction().click();
    }

    // Sets the room and hall count selection
    public void setRoomAndHall() throws InterruptedException {
        roomAndHallDropdownButtonAction().click();
        Thread.sleep(1500);
        roomAndHallButtonOptionAction().click();
        confirmButtonAction().click();
    }

    // Sets the within housing estate selection
    public void setWithinHousingEstate() throws InterruptedException {
        if(isElementInView(driver, withinHousingEstateDropdownAction())){
            withinHousingEstateDropdownAction().click();
            Thread.sleep(1500);
        }else {
            while (!isElementInView(driver, withinHousingEstateDropdownAction())){
                js.executeScript("window.scrollBy(0, 500);");
            }
            withinHousingEstateDropdownAction().click();
            Thread.sleep(1500);
        }
        withinHousingEstateOptionAction().click();
        confirmButtonAction().click();
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
