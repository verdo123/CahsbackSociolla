package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath = "//*[@id=\"Qris_Pay\"]")
    private WebElement pilihPembayaranQris;

    @FindBy(xpath = "//*[@id='Qris_Pay']/option[3]")
    private WebElement BcaMobile;

    @FindBy(xpath = "//*[@id='btnEdit']")
    private WebElement BtnEdit;


//----------------------------------------------------------------

    public void setVerifikasiMenu(){verifikasiMenu.click();}

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


}
