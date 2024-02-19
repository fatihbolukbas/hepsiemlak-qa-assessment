package Assessment_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Case1_Mobile {
    WebDriver driver;
    JavascriptExecutor js;
    public Case1_Mobile(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    // Locates and returns the "For Sale" button WebElement
    By forSaleButton = By.xpath("//a[@title='Satılık İlanlar']");
    public WebElement forSaleButtonAction(){
        return driver.findElement(forSaleButton);
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

    // Locates and returns the cookie close button WebElement
    By cookieClose = By.cssSelector(".cookie-policy  svg");
    public  WebElement cookieCloseAction(){
        return driver.findElement(cookieClose);
    }

    // Locates and returns the category selection WebElement
    By categorySelection = By.xpath("//a[@href='/satilik/isyeri']");
    public  WebElement categorySelectionAction(){
        return driver.findElement(categorySelection);
    }

    // Locates and returns the min price input WebElement
    By minPriceInput = By.xpath("//input[@id='priceMin']");
    public  WebElement minPriceInputAction(){
        return driver.findElement(minPriceInput);
    }

    // Locates and returns the max price input WebElement
    By maxPriceInput = By.xpath("//input[@id='priceMax']");
    public  WebElement maxPriceInputAction(){
        return driver.findElement(maxPriceInput);
    }

    // Locates and returns the property age dropdown WebElement
    By propertyAge = By.xpath("(//div[@class='c-title'])[3]");
    public  WebElement propertyAgeAction(){
        return driver.findElement(propertyAge);
    }

    // Locates and returns the first property age option WebElement
    By propertyAgeOption1 = By.cssSelector(".buildingAgeSec .dropdown-list li:nth-of-type(1)");
    public  WebElement propertyAgeOption1Action(){
        return driver.findElement(propertyAgeOption1);
    }

    // Locates and returns the second property age option WebElement
    By propertyAgeOption2 = By.cssSelector(".buildingAgeSec .dropdown-list li:nth-of-type(2)");
    public  WebElement propertyAgeOption2Action(){
        return driver.findElement(propertyAgeOption2);
    }

    // Locates and returns the third property age option WebElement
    By propertyAgeOption3 = By.cssSelector(".buildingAgeSec .dropdown-list li:nth-of-type(3)");
    public  WebElement propertyAgeOption3Action(){
        return driver.findElement(propertyAgeOption3);
    }

    // Locates and returns the property age dropdown close WebElement
    By propertyAgeDropdownClose = By.xpath("//span[@class='text-ellipsis c-item-val']");
    public  WebElement propertyDropDownCloseAction(){
        return driver.findElement(propertyAgeDropdownClose);
    }

    // Locates and returns the search button WebElement
    By searchButton = By.xpath("//a[@class=\"btn btn-red btn-large\"]");
    public  WebElement searchButtonAction(){
        return driver.findElement(searchButton);
    }

    // Locates and returns the first property age tag WebElement
    By propertyAgeTag1 = By.cssSelector("li:nth-of-type(1) > .applied-filters-list-item");
    public WebElement propertyAgeTage1Action(){
        return driver.findElement(propertyAgeTag1);
    }

    // Locates and returns the second property age tag WebElement
    By propertyAgeTag2 = By.cssSelector(".applied-filters-list > .applied-filters-list-item:nth-child(2)");
    public WebElement propertyAgeTage2Action(){
        return driver.findElement(propertyAgeTag2);
    }

    // Locates and returns the third property age tag WebElement
    By propertyAgeTag3 = By.cssSelector(".applied-filters-list > .applied-filters-list-item:nth-child(3)");
    public WebElement propertyAgeTage3Action(){
        return driver.findElement(propertyAgeTag3);
    }

    // Locates and returns the price tag WebElement
    By priceTag = By.cssSelector("li:nth-of-type(2) > .applied-filters-list-item.last--item");
    public WebElement priceTagAction(){
        return driver.findElement(priceTag);
    }

    // Locates and returns the city tag WebElement
    By cityTag = By.cssSelector("li:nth-of-type(3) > .applied-filters-list-item.last--item");
    public WebElement cityTagAction(){
        return driver.findElement(cityTag);
    }

    // Locates and returns the county tag WebElement
    By countyTag = By.cssSelector("li:nth-of-type(4) > .applied-filters-list-item.last--item");
    public WebElement countyTagAction(){
        return driver.findElement(countyTag);
    }

    // Locates and returns the category tag WebElement
    By categoryTag = By.cssSelector("li:nth-of-type(5) > .applied-filters-list-item.last--item");
    public WebElement categoryTagAction(){
        return driver.findElement(categoryTag);
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
    public void setPropertyAge(){
        propertyAgeAction().click();
        propertyAgeOption1Action().click();
        propertyAgeOption2Action().click();
        propertyAgeOption3Action().click();
        propertyDropDownCloseAction().click();
    }

    // Clicks the search button
    public void setSearchButton() throws InterruptedException {
        searchButtonAction().click();
        Thread.sleep(2000);
    }
}
