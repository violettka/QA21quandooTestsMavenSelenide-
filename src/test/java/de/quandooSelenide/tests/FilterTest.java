package de.quandooSelenide.tests;

//import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * UI test for search filter https://www.quandoo.de/en/berlin
 */
public class FilterTest extends TestBase {
    /**
     * Test:
     * click filter Top rated;
     * select first item in Cuisine filter;
     * check number of displayed restaurants
     */

    @Test
    public void FilterTest() {
        //open  Restaurants in Berlin page
        open("https://www.quandoo.de/en/berlin");
        getWebDriver().manage().window().maximize();
        //accept cookies
        restBerlinPage.acceptAllCookies();
        //save total restaurants number to variable
        String restCountBefore = restBerlinPage.getRestCountBeforeText();
        //click filter Top rated
        restBerlinPage.clickOnTopRated();
        //assert total number of restaurants changed
        restBerlinPage.getRestCountAfter().shouldNotHave(Condition.exactValue(restCountBefore));
        // click on first item in Cuisine filter
        restBerlinPage.selectFirstItemInCuisineFilter();
        //assert correct number of displayed restaurants
        String firstItemText = restBerlinPage.getFirstItemText();
        int countFirstItemInCuisine = restBerlinPage.getCountFirstItemInCuisine(firstItemText);
        int listSize = restBerlinPage.getListSize();
        assertEquals(countFirstItemInCuisine, listSize);

    }
}
