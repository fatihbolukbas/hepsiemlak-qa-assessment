package Assessment_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Case1_Mobile {
    WebDriver driver;
    JavascriptExecutor js;
    public Case1_Mobile(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    // Locates and returns the "For Sale" button WebElement
    By forSaleButton = By.xpath("//span[@class='he-svg left-icon he-svg--satilik']");
    public WebElement forSaleButtonAction(){
        return driver.findElement(forSaleButton);
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

    // Locates and returns the category selection WebElement
    By categorySelection = By.cssSelector("[for='category1']");
    public  WebElement categorySelectionAction(){
        return driver.findElement(categorySelection);
    }

    // Locates and returns the min price input WebElement
    By minPriceInput = By.cssSelector(".price > div > div:nth-of-type(1) > .floating-input");
    public  WebElement minPriceInputAction(){
        return driver.findElement(minPriceInput);
    }

    // Locates and returns the max price input WebElement
    By maxPriceInput = By.cssSelector(".price > div > div:nth-of-type(2) > .floating-input");
    public  WebElement maxPriceInputAction(){
        return driver.findElement(maxPriceInput);
    }

    // Locates and returns the property age dropdown WebElement
    By propertyAge = By.cssSelector(".building-age .he-select-base__control");
    public  WebElement propertyAgeAction(){
        return driver.findElement(propertyAge);
    }

    // Locates and returns the first property age option WebElement
    By propertyAgeOption1 = By.cssSelector(".vue-recycle-scroller__item-wrapper > div:nth-of-type(1)");
    public  WebElement propertyAgeOption1Action(){
        return driver.findElement(propertyAgeOption1);
    }

    // Locates and returns the second property age option WebElement
    By propertyAgeOption2 = By.cssSelector(".vue-recycle-scroller__item-wrapper > div:nth-of-type(2)");
    public  WebElement propertyAgeOption2Action(){
        return driver.findElement(propertyAgeOption2);
    }

    // Locates and returns the third property age option WebElement
    By propertyAgeOption3 = By.cssSelector(".vue-recycle-scroller__item-wrapper > div:nth-of-type(3)");
    public  WebElement propertyAgeOption3Action(){
        return driver.findElement(propertyAgeOption3);
    }

    // Locates and returns the search button WebElement
    By searchButton = By.xpath("//button[@class='btn btn-red get-result']");
    public  WebElement searchButtonAction(){
        return driver.findElement(searchButton);
    }

    // Locates and returns the first property age tag WebElement
    By propertyAgeTag1 = By.cssSelector("div:nth-of-type(3) p");
    public WebElement propertyAgeTage1Action(){
        return driver.findElement(propertyAgeTag1);
    }

    // Locates and returns the second property age tag WebElement
    By propertyAgeTag2 = By.cssSelector(".swiper-slide.swiper-slide-next p");
    public WebElement propertyAgeTage2Action(){
        return driver.findElement(propertyAgeTag2);
    }

    // Locates and returns the third property age tag WebElement
    By propertyAgeTag3 = By.cssSelector(".swiper-wrapper > div:nth-of-type(1) p");
    public WebElement propertyAgeTage3Action(){
        return driver.findElement(propertyAgeTag3);
    }

    // Locates and returns the min price tag WebElement
    By minPriceTag = By.cssSelector("div:nth-of-type(5) p");
    public WebElement minPriceTagAction(){
        return driver.findElement(minPriceTag);
    }

    // Locates and returns the max price tag WebElement
    By maxPriceTag = By.cssSelector(".swiper-wrapper > div:nth-of-type(4) p");
    public WebElement maxPriceTagAction(){
        return driver.findElement(maxPriceTag);
    }

    // Locates and returns the property status tag WebElement
    By propertyStatusTag = By.cssSelector("div:nth-of-type(6) p");
    public WebElement propertyStatusTagAction(){
        return driver.findElement(propertyStatusTag);
    }

    // Navigates to the page
    public void goTo() {
        driver.get("https://www.hepsiemlak.com/");
    }

    // Performs actions to click the "For Sale" button
    public void setForSale() throws InterruptedException {
        forSaleButtonAction().click();
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

    // Sets the category selection
    public void setCategorySelection() throws InterruptedException {
        categorySelectionAction().click();
        Thread.sleep(1500);
    }

    // Sets the minimum price input
    public void setMinPriceInput(String minPrice){
        String inputContext = minPriceInputAction().getText().trim();
        if(!inputContext.isEmpty()){
            minPriceInputAction().clear();
        }
        minPriceInputAction().sendKeys(minPrice);
    }

    // Sets the maximum price input
    public void setMaxPriceInput(String maxPrice){
        String inputContext = maxPriceInputAction().getText().trim();
        if(!inputContext.isEmpty()){
            maxPriceInputAction().clear();
        }
        maxPriceInputAction().sendKeys(maxPrice);
    }

    // Sets the property age selection
    public void setPropertyAge() throws InterruptedException {
        if(isElementInView(driver, propertyAgeAction())){
            propertyAgeAction().click();
        }else {
            while (!isElementInView(driver, propertyAgeAction())){
                js.executeScript("window.scrollBy(0, 250);");
            }
            propertyAgeAction().click();
            Thread.sleep(1000);
        }
        propertyAgeOption1Action().click();
        propertyAgeOption2Action().click();
        propertyAgeOption3Action().click();
        confirmButtonAction().click();
    }

    // Clicks the search button
    public void setSearchButton() throws InterruptedException {
        searchButtonAction().click();
        Thread.sleep(2000);
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
