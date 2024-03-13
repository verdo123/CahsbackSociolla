package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifikasiPage {

    private WebDriver driver;

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

    public void setVerifikasiMenu(){verifikasiMenu.click();}

    public void clickBtnAksi(){BtnAksi.click();}

    public void clickBtnVerifikasi(){BtnVerifikasi.click();}



}
