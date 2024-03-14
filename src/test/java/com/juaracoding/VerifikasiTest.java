package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.VerifikasiPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;

public class VerifikasiTest {

    private static WebDriver driver;

    public static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static VerifikasiPage verifikasiPage = new VerifikasiPage();

    public VerifikasiTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User telah berhasil login")
    public void User_telah_berhasil_login(){
        driver.get("https://staging.ptkta.com/xcashback_sociolla/login");
        loginPage.formLogin();
        extentTest.log(LogStatus.PASS,"User telah berhasil login");
    }

    @When("User klik menu verifikasi pada side bar")
    public void User_klik_menu_verifikasi_pada_side_bar(){
        verifikasiPage.setVerifikasiMenu();
        extentTest.log(LogStatus.PASS,"User klik menu verifikasi pada side bar");
    }

    @And("User memilih aksi pada custumer yang akan diverifikasi")
    public void User_memilih_aksi_pada_custumer_yang_akan_diverifikasi(){
        verifikasiPage.clickBtnAksi();
        extentTest.log(LogStatus.PASS,"User memilih aksi pada custumer yang akan diverifikasi");
    }

    @And("klik tombol Verikasi")
    public void klik_tombol_Verikasi(){
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        /*Scroll kebawah*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

        DriverSingleton.delay(2);

        verifikasiPage.clickBtnVerifikasi();
        extentTest.log(LogStatus.PASS,"klik tombol Verikasi");
    }

    @And("User klik tombol OK")
    public void User_klik_tombol_OK(){
        DriverSingleton.delay(2);
        verifikasiPage.clickBtnOk();
        extentTest.log(LogStatus.PASS,"User klik tombol OK");
    }

    @Then("User mendapatkan feedback Sukses verifikasi data klik OK")
    public void User_mendapatkan_feedback_Sukses_verifikasi_data_klik_OK(){
        DriverSingleton.delay(1);
        driver.switchTo().alert().accept();

    }

//-----------------------------------------------
    @And("User mengubah Pembayaran QRIS")
    public void User_mengubah_Pembayaran_QRIS(){
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));

        DriverSingleton.delay(2);

        verifikasiPage.ubahPembayaranQris();
        extentTest.log(LogStatus.PASS,"User mengubah Pembayaran QRIS");

    }

//-----------------------------------------------
    @And("User klik tombol edit")
    public void User_klik_tombol_edit(){
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        /*Scroll kebawah*/
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

        DriverSingleton.delay(2);

        verifikasiPage.clickBtnEdit();
        extentTest.log(LogStatus.PASS,"User klik tombol edit");
    }

}
