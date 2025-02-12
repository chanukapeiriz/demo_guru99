package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.PropertyFileReader;
import utils.ResourceFile;

public class RegisterPage {
    WebDriver driver = ResourceFile.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String firstNameElement = prop.getProperty("RegisterPage","first.name.element");
    String lastNameElement = prop.getProperty("RegisterPage","last.name.element");
    String phoneElement = prop.getProperty("RegisterPage","phone.element");
    String emailElement = prop.getProperty("RegisterPage","email.element");
    String countryElement = prop.getProperty("RegisterPage","country.element");
    String usernameElement = prop.getProperty("RegisterPage","user.name.element");
    String passwordElement = prop.getProperty("RegisterPage","password.element");
    String confirmPasswordElement = prop.getProperty("RegisterPage","confirm.password.element");
    String submitButtonElement = prop.getProperty("RegisterPage","submit.element");

    public RegisterPage setFirstName(String firstName){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.name(firstNameElement),10);
        driver.findElement(By.name(firstNameElement)).sendKeys(firstName);
        return this;
    }
    public RegisterPage setLastName(String lastName){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.name(lastNameElement),10);
        driver.findElement(By.name(lastNameElement)).sendKeys(lastName);
        return this;
    }
    public RegisterPage setPhone(String phone){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.name(phoneElement),10);
        driver.findElement(By.name(phoneElement)).sendKeys(phone);
        return this;
    }
    public RegisterPage setEmail(String userName){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.id(emailElement),10);
        driver.findElement(By.id(emailElement)).sendKeys(userName);
        return this;
    }
    public RegisterPage setCountry(String country){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.name(countryElement),10);
        Select selectCountry = new Select(driver.findElement(By.name(countryElement)));
        selectCountry.selectByVisibleText(country);
        return this;
    }
    public RegisterPage setUserName(String userName){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.id(usernameElement),10);
        driver.findElement(By.id(usernameElement)).sendKeys(userName);
        return this;
    }
    public RegisterPage setPassword(String password){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.name(passwordElement),10);
        driver.findElement(By.name(passwordElement)).sendKeys(password);
        return this;
    }
    public RegisterPage setConfirmPassword(String confirmPassword){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.name(confirmPasswordElement),10);
        driver.findElement(By.name(confirmPasswordElement)).sendKeys(confirmPassword);
        return this;
    }
    public RegisterSuccessPage clickOnSubmit(){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.name(submitButtonElement),10);
        driver.findElement(By.name(submitButtonElement)).click();
        return new RegisterSuccessPage();
    }
}
