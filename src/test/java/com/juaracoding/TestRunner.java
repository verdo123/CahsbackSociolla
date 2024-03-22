package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/features/003Verifikasi.feature"},
        glue = "com.juaracoding",
        tags = "@Negatif-EditNoHandphone",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
