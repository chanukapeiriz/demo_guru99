package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.ResourceFile;

public class RegisterSuccessPage {
    WebDriver driver = ResourceFile.getInstance().getDriver();
    PropertyFileReader prop = new PropertyFileReader();
    String registerSuccessElement = prop.getProperty("RegisterSuccessPage","register.success.message.element");
    public String getSalutationMessage(){
        ResourceFile.getInstance().waitUntilNextElementAppears(By.xpath(registerSuccessElement),20);
        return driver.findElement(By.xpath(registerSuccessElement)).getText();
    }
}
