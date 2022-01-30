package de.quandooSelenide.tests;

import com.codeborne.selenide.Condition;
import de.quandooSelenide.pages.RestBerlinPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * UI test for search filter https://www.quandoo.de/en/berlin
 */
public class FilterTest {
    RestBerlinPage restBerlinPage;
    /**
     * Test:
     * click filter Top rated;
     * select first item in Cuisine filter;
     * check number of displayed restaurants
     */

    @BeforeEach
    public void setUp() {
        //open  Restaurants in Berlin page
        restBerlinPage = new RestBerlinPage();
        //accept cookies
        restBerlinPage.acceptAllCookies();
    }

    @Test
    public void FilterTest() {
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
