package com.testWeb;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = ("src/test/resources/features"),
        tags = "@Test"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
