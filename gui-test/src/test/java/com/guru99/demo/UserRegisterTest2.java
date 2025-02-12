package com.guru99.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class UserRegisterTest2 {
    WebDriver driver;

    PropertyFileReader prop = new PropertyFileReader();
    String webUrl = prop.getProperty("config","url");
    //String webUrl = "https://demo.guru99.com/test/newtours/index.php";
    Home homePage;
    Register registerPage;
    RegisterSuccess registerSuccessPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(webUrl);
        driver.manage().window().maximize();
        homePage = new Home();
        homePage.clickOnRegisterMenu(driver);
        registerPage = new Register();
        registerSuccessPage = new RegisterSuccess();
    }

    @Test
    public void testRegisterNewUser() {
        registerPage.setFirstName(driver,"Imperial");
        registerPage.setLastName(driver,"College");
        registerPage.setPhone(driver,"011278458547");
        registerPage.setEmail(driver,"info@imperial.lk");
        registerPage.setCountry(driver,"MALAYSIA");
        registerPage.setUsername(driver,"Admin");
        registerPage.setPassword(driver,"admin123");
        registerPage.setConfirmPassword(driver,"admin123");
        registerPage.clickOnSubmitButton(driver);
        Assert.assertEquals(registerSuccessPage.getSalutationMessage(driver)
                ,"Dear Imperial College,"
                ,"Failed to Register!");
    }
}
