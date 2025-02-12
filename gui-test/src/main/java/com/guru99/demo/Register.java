package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
    public void setFirstName(WebDriver driver, String firstName){
        driver.findElement(By.name("firstName")).sendKeys(firstName);
    }
    public void setLastName(WebDriver driver, String lastName){
        driver.findElement(By.name("lastName")).sendKeys(lastName);
    }
    public void setPhone(WebDriver driver, String phone){
        driver.findElement(By.name("phone")).sendKeys(phone);
    }
    public void setEmail(WebDriver driver, String userName){
        driver.findElement(By.id("userName")).sendKeys(userName);
    }
    public void setCountry(WebDriver driver, String country){
        Select countrySelect = new Select(driver.findElement(By.name("country")));
        countrySelect.selectByVisibleText(country);
    }
    public void setUsername(WebDriver driver, String email){
        driver.findElement(By.id("email")).sendKeys(email);
    }
    public void setPassword(WebDriver driver, String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }
    public void setConfirmPassword(WebDriver driver, String confirmPassword){
        driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
    }
    public void clickOnSubmitButton(WebDriver driver){
        driver.findElement(By.name("submit")).click();
    }
}
