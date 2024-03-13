package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.LogoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static LogoutPage logoutPage = new LogoutPage();

    public LogoutTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User berhasil login")
    public void User_berhasil_login(){
        driver.get("https://staging.ptkta.com/xcashback_sociolla/login");
        loginPage.formLogin();
        extentTest.log(LogStatus.PASS,"User berhasil login");
    }

    @When("User klik tombol Logout pada side bar")
    public void User_klik_tombol_Logout_pada_side_bar(){
        logoutPage.clickBtnLogout();
        extentTest.log(LogStatus.PASS,"User klik tombol Logout pada side bar");
    }

    @Then("User berhasil logout dan diarahkan ke halaman login")
    public void User_berhasil_logout_dan_diarahkan_ke_halaman_login(){
        Assert.assertEquals(logoutPage.getTxtLogin(),"LOGIN");
        extentTest.log(LogStatus.PASS,"User berhasil logout dan diarahkan ke halaman login");
    }

}
