package com.testWeb.steps;
import com.testWeb.pages.ExamplePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleSteps {
    public static WebDriver driver;
    ExamplePage examplePage = new ExamplePage();

    @Before
    public void set_Up_Environment(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.mercadolibre.com.ar";
        driver.get(url);
    }

    @Given("the user is on MercadoLibre page")
    public void the_User_Is_On_MercadoLibre_Page(){
        examplePage.validatePageTitle();
    }

    @When("the user search for the word {string}")
    public void the_User_Search_For_The_Word(String word){
        examplePage.searchWord(word);
    }


    @Then("the user watch the results")
    public void the_User_Watch_The_Results(){
        examplePage.validateResults();
    }


    @After
    public void dropDriver(){
        driver.quit();
    }
}
