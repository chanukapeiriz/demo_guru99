package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.ResourceFile;

public class HomePage {
    WebDriver driver = ResourceFile.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String registerMenuElement = prop.getProperty("HomePage","register.menu.element");
    public RegisterPage clickOnRegisterMenu(){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.linkText(registerMenuElement),10);
        driver.findElement(By.linkText(registerMenuElement)).click();
        return new RegisterPage();
    }
}
