package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    public void clickOnRegisterMenu(WebDriver driver){
        driver.findElement(By.linkText("REGISTER")).click();
    }
}
