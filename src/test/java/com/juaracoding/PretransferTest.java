package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.PretransferPage;
import com.juaracoding.pages.VerifikasiPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PretransferTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static PretransferPage pretransferPage = new PretransferPage();

    public PretransferTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User login")
    public void User_login(){
        driver.get("https://staging.ptkta.com/xcashback_sociolla/login");
        loginPage.formLogin();
        extentTest.log(LogStatus.PASS,"User login");
    }

    @When("User klik menu Pre-transfer pada side bar")
    public void User_klik_menu_Pretransfer_pada_side_bar(){
        pretransferPage.clickpreTransferMenu();
        extentTest.log(LogStatus.PASS,"User klik menu Pre-transfer pada side bar");
    }

    @And("User click export excel")
    public void User_click_export_excel(){
        pretransferPage.clickBtnEkspor();
        extentTest.log(LogStatus.PASS,"User click export excel");
    }

    @Then("User mendapatkan data excel")
    public void User_mendapatkan_data_excel(){
        pretransferPage.getTxtValidasi();
        Assert.assertEquals(pretransferPage.getTxtValidasi(),"Validated");
        extentTest.log(LogStatus.PASS,"User mendapatkan data excel");
    }


}
