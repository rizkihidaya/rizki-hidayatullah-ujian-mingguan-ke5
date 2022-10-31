package com.juaracoding.cucumber.pageobject.pages;

import com.juaracoding.cucumber.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath= "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/div[1]/div[1]/h1[1]")
    WebElement txtMYACCOUNT;

   // @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
   // WebElement txtInvalidCredentials;

    //@FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    //WebElement txtRequired;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);

    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getTxtMyAccount(){
        return txtMYACCOUNT.getText();
    }

    //public String getTxtInvalidCredentials(){
    //    return txtInvalidCredentials.getText();
    //}

    //public String getTxtRequired(){
        //return txtRequired.getText();
   // }

}
