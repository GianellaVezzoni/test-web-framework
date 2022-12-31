package com.testWeb.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.testWeb.locators.ExampleLocators.*;
import static com.testWeb.steps.ExampleSteps.driver;

public class ExamplePage {
    public void validatePageTitle(){
        driver.findElement(By.className(CLASS_NAME_LOGO)).isDisplayed();
    }

    public void searchWord(String searchWord){
        WebElement searchbar = driver.findElement(By.id(ID_SEARCH_BAR));
        searchbar.click();
        searchbar.sendKeys(searchWord);
        searchbar.submit();
    }

    public void validateResults(){
        Assert.assertTrue(driver.findElement(By.className(ID_QUANTITY_RESULTS)).isDisplayed());
    }

}
