package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    private WebDriver driver;

    public LogoutPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locator find element
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement TxtLogin;

    @FindBy(xpath = "//i[@class='fas fa-bars']")
    private WebElement sideBar;

    @FindBy(xpath = "//p[normalize-space()='Logout']")
    private WebElement btnLogout;


    public void clickBtnLogout(){ btnLogout.click();}

    public String getTxtLogin(){return TxtLogin.getText();}

}
