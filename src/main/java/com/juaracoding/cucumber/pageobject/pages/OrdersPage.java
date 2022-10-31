package com.juaracoding.cucumber.pageobject.pages;

import com.juaracoding.cucumber.pageobject.drivers.DriverSingleton;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrdersPage {
    private WebDriver driver;

    public OrdersPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[normalize-space()='Orders']")
    WebElement menuOrders;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/div[2]")
    WebElement txtNoOrderHasBeenMadeYet;


    @FindBy(id="pa_color")
    WebElement elementSelectPa_color;


    public void ElementSelect(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Select pa_colorSelectMenu = new Select(elementSelectPa_color);
        pa_colorSelectMenu.selectByValue("1");
    }
    public void menuOrders(){
        menuOrders.click();
    }

    public String getTxtDashboard(){
        return txtNoOrderHasBeenMadeYet.getText();
    }

}