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
import org.testng.Assert;

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
        verifikasiPage.clickVerifikasiMenu();
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

    @And("User input nama lengkap")
    public void User_input_nama_lengkap(){
        verifikasiPage.inputNamaLengkap();
        extentTest.log(LogStatus.PASS,"User input nama lengkap");
    }

    @And("User input nomor HP")
    public void User_input_nomor_HP(){
        verifikasiPage.inputNomorHp();
        extentTest.log(LogStatus.PASS,"User input nomor HP");
    }

    @And("User input nomor rekening")
    public void User_input_nomor_rekening(){
        verifikasiPage.inputNomorRekening();
        extentTest.log(LogStatus.PASS,"User input nomor rekening");
    }

    @And("User input nominal transaksi")
    public void User_input_nominal_transaksi(){
        verifikasiPage.inputNominalTransaksi();
        extentTest.log(LogStatus.PASS,"User input nominal transaksi");
    }

    @And("User input tanggal transaksi")
    public void User_input_tanggal_transaksi(){
        verifikasiPage.inputTanggalTransaksi();
        extentTest.log(LogStatus.PASS,"User input tanggal transaksi");
    }

    @Then("User klik tommbol save")
    public void User_klik_tommbol_save(){
        verifikasiPage.clickBtnSave();
        extentTest.log(LogStatus.PASS,"User klik tommbol save");
    }

//-----------------------------------------------
    @And("User input nominal transaksi dibawah minimal cashback")
    public void User_input_nominal_transaksi_dibawah_minimal_cashback(){
    verifikasiPage.inputNominalMinimumTransaksi();
    extentTest.log(LogStatus.PASS,"User input nominal transaksi dibawah minimal cashback");
    }


//Negatif-----------------------------------------------

    @And("User tidak input nama lengkap")
    public void User_tidak_input_nama_lengkap(){
        verifikasiPage.inputNamaLengkapNegatif();
        extentTest.log(LogStatus.PASS,"User tidak input nama lengkap");
    }

    @And("User tidak input nomor HP")
    public void User_tidak_input_nomor_HP(){
        verifikasiPage.inputNomorHpNegatif();
        extentTest.log(LogStatus.PASS,"User tidak input nomor HP");
    }

    @And("User tidak input nomor rekening")
    public void User_tidak_input_nomor_rekening(){
        verifikasiPage.inputNomorRekeningNegatif();
        extentTest.log(LogStatus.PASS,"User tidak input nomor rekening");
    }

    @And("User tidak input nominal transaksi")
    public void User_tidak_input_nominal_transaksi(){
        verifikasiPage.inputNominalTransaksiNegatif();
        extentTest.log(LogStatus.PASS,"User tidak input nominal transaksi");
    }

    @And("User tidak input tanggal transaksi")
    public void User_tidak_input_tanggal_transaksi(){
        verifikasiPage.inputTanggalTransaksiNegatif();
        extentTest.log(LogStatus.PASS,"User tidak input tanggal transaksi");
    }

    @Then("User mendapatkan alert The Customer Name field is required")
    public void User_mendapatkan_alert_The_Customer_Name_field_is_required(){
        Assert.assertEquals(verifikasiPage.getTxtRequired(),"The Customer Name field is required.");
        extentTest.log(LogStatus.PASS,"User mendapatkan alert The Customer Name field is required");
    }

    @And("User mengubah No Handphone yang sudah ada pada daftar verifikasi")
    public void User_mengubah_No_Handphone_yang_sudah_ada_pada_daftar_verifikasi(){
        verifikasiPage.inputNomorHp();
        extentTest.log(LogStatus.PASS,"User mengubah No Handphone yang sudah ada pada daftar verifikasi");
    }



}
