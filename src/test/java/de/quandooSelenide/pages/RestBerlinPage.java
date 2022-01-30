package de.quandooSelenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class RestBerlinPage {

    /* Constructor */

    public RestBerlinPage() {
        open("https://www.quandoo.de/en/berlin");
        getWebDriver().manage().window().maximize();
    }

    /* Elements */

    private static By restCountBeforeText = By.cssSelector(".cfhRwc");
    private static By topRatedBtn = By.xpath("//button[contains(.,'Top rated')]");
    private static By firstItemInCuisineFilter = By.xpath("//div[@class='ulye33-0 cdvAxr'] / li[1] / label[1]");
    private static By firstItemText = By.xpath("//div[@class='ulye33-0 cdvAxr']  / li[1] //div[1] /span[2]");
    private static By list = By.cssSelector(".iTkAfG");
    private static By restCountAfter = By.cssSelector(".cfhRwc");


    /* Methods */

    public void acceptAllCookies() {
        if ($(byText("Accept all")).exists()){
        $(byText("Accept all")).click();
        }
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

    public int getCountFirstItemInCuisine(String str) {
        int count = Integer.parseInt(str.substring(1, str.length() - 1));
        return count;
    }

    public int getListSize() {
        return $$(list).size();
    }

    // common method
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
