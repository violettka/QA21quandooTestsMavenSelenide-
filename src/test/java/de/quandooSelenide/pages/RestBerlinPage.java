package de.quandooSelenide.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class RestBerlinPage extends PageBase{
    public RestBerlinPage(WebDriver driver) {
        super(driver);
        
    }


    public int getCountFirstItemInCuisine(String str) {
        int count = Integer.parseInt(str.substring(1, str.length() - 1));
        return count;
    }
}
