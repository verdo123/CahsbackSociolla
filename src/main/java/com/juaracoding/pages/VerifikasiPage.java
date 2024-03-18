package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class VerifikasiPage {

    private WebDriver driver;
    private Select select;

    public VerifikasiPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator find element

    @FindBy(xpath = "//p[normalize-space()='Verifikasi']")
    private WebElement verifikasiMenu;

    @FindBy(xpath = "//i[@class='fa fa-eye']")
    private WebElement BtnAksi;

    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    private WebElement BtnVerifikasi;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[1]")
    private WebElement BtnOk;

    @FindBy(xpath = "//*[@id='Qris_Pay']/option[3]")
    private WebElement pilihPembayaranQris;

    @FindBy(xpath = "//*[@id='Qris_Pay']/option[3]")
    private WebElement BcaMobile;

    @FindBy(xpath = "//*[@id='btnEdit']")
    private WebElement BtnEdit;

    @FindBy(xpath = "//*[@id='Customer_Name']")
    private WebElement coloumnNamaLengkap;

    @FindBy(xpath = "//*[@id='Phone_Number']")
    private WebElement coloumnNomorHp;

    @FindBy(xpath = "//*[@id='No_Rek_bca']")
    private WebElement coloumnNomorRekening;

    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement coloumnNominal;

    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement coloumnNominalTransaksi;

    @FindBy(xpath = "//input[@id='Transaction_Date']")
    private WebElement coloumnTanggalTransaksi;

    @FindBy(xpath = "//button[@id='btnUpdate']//span[@class='fa fa-save']")
    private WebElement BtnSimpan;

    @FindBy(xpath = "//*[@id='Customer_Name_error']")
    private WebElement TxtRequired;

//----------------------------------------------------------------

    public void clickVerifikasiMenu(){verifikasiMenu.click();}

    public void clickBtnAksi(){BtnAksi.click();}

    public void clickBtnVerifikasi(){BtnVerifikasi.click();}

    public void clickBtnOk(){BtnOk.click();}

    public void selectQris() {pilihPembayaranQris.click();}

    public void ubahPembayaranQris() {
        Select select = new Select(pilihPembayaranQris);
        select.selectByValue("Bca Mobile Sakuku");
    }

    public void clickBcaMobile(){BcaMobile.click();}

    public void clickBtnEdit(){BtnEdit.click();}

    public void inputNamaLengkap(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNamaLengkap);
        coloumnNamaLengkap.sendKeys("tester daviarta");}

    public void inputNomorHp(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNomorHp);
        coloumnNomorHp.sendKeys("087795951234");}

    public void inputNomorRekening(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNomorRekening);
        coloumnNomorRekening.sendKeys("99887766");}

    public void inputNominalTransaksi(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNominal);
        coloumnNominal.sendKeys("400000");}

    public void inputNominalMinimumTransaksi(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNominal);
        coloumnNominal.sendKeys("200000");}

    public void inputTanggalTransaksi(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnTanggalTransaksi);
        coloumnTanggalTransaksi.sendKeys("15/03/2024");}


//------------------Negatif-------------------//

    public String getTxtRequired(){
        return TxtRequired.getText();
    }

    public void inputNamaLengkapNegatif(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNamaLengkap);
        }

    public void inputNomorHpNegatif() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNomorHp);
        }

    public void inputNomorRekeningNegatif(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNomorRekening);
        }

    public void inputNominalTransaksiNegatif(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNominal);
        }

    public void inputNominalMinimumTransaksiNegatif(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnNominal);
        }

    public void inputTanggalTransaksiNegatif(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].focus(); arguments[0].select(); document.execCommand('delete');", coloumnTanggalTransaksi);
        }


    public void clickBtnSave(){BtnSimpan.click();}

}
