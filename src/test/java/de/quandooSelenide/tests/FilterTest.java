package de.quandooSelenide.tests;

//import static org.junit.Assert.assertTrue;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
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
    public void TaskFilterTest() {
        //open  Restaurants in Berlin page
        open("https://www.quandoo.de/en/berlin");
        //accept cookies
        $(byText("Accept all")).click();
        //save total restaurants number to variable
        String restCountBefore = $(".cfhRwc").getText();
        //click filter Top rated
        $(By.xpath("//button[contains(.,'Top rated')]")).click();
        restBerlinPage.pause(3000);
        //assert total number of restaurants changed
        $(".cfhRwc").shouldNotHave(Condition.exactValue(restCountBefore));
        // click on first item in Cuisine filter
        $(By.xpath("//div[@class='ulye33-0 cdvAxr'] / li[1] / label[1]")).click();
        restBerlinPage.pause(3000);
        //assert correct number of displayed restaurants
        String firstItemText = $(By.xpath("//div[@class='ulye33-0 cdvAxr']  / li[1] //div[1] /span[2]")).getText();
        int countFirstItemInCuisine = restBerlinPage.getCountFirstItemInCuisine(firstItemText);
        int listSize = $$(".iTkAfG").size();
        assertEquals(countFirstItemInCuisine, listSize);

    }
}
