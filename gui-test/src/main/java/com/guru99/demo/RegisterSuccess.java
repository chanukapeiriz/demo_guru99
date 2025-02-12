package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccess {
    public String getSalutationMessage(WebDriver driver){
        return driver.findElement(By.xpath("//*[contains(text(),\"Dear\")]")).getText();
    }
}
