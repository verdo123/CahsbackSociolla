package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PretransferPage {

    private WebDriver driver;
    private Select select;

    public PretransferPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator find element

    @FindBy(xpath = "//p[normalize-space()='Pre-Transfer']")
    private WebElement preTransferMenu;

    @FindBy(xpath = "//a[@id='btn_excel']")
    private WebElement eksporExcel;

    @FindBy(xpath = "//*[@id='table']/tbody/tr/td[12]")
    private WebElement TxtValidasi;


//-------------------------------------------------

    public void clickpreTransferMenu(){preTransferMenu.click();}

    public void clickBtnEkspor(){eksporExcel.click();}

    public String getTxtValidasi(){return TxtValidasi.getText();}

}
