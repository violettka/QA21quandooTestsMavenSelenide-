package de.quandooSelenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class RestBerlinPage extends PageBase{
    public RestBerlinPage(WebDriver driver) {
        super(driver);
        
    }

    /* Elements */

    private static By restCountBeforeText = By.cssSelector(".cfhRwc");
    private static By topRatedBtn = By.xpath("//button[contains(.,'Top rated')]");
    private static By firstItemInCuisineFilter = By.xpath("//div[@class='ulye33-0 cdvAxr'] / li[1] / label[1]");
    private static By firstItemText = By.xpath("//div[@class='ulye33-0 cdvAxr']  / li[1] //div[1] /span[2]");
    private static By list = By.cssSelector(".iTkAfG");
    private static By restCountAfter = By.cssSelector(".cfhRwc");

    public int getCountFirstItemInCuisine(String str) {
        int count = Integer.parseInt(str.substring(1, str.length() - 1));
        return count;
    }

    public void acceptAllCookies() {
        $(byText("Accept all")).click();
    }

    public String getRestCountBeforeText() {
        return $(restCountBeforeText).getText();
    }

    public void clickOnTopRated() {
        $(topRatedBtn).click();
        pause(3000);
    }

    public SelenideElement getRestCountAfter() {
        return $(restCountAfter); }

    public void selectFirstItemInCuisineFilter() {
        $(firstItemInCuisineFilter).click();
        pause(3000);
    }

    public String getFirstItemText() {
       return $(firstItemText).getText();
    }

    public int getListSize() {
        return $$(list).size();
    }
}
