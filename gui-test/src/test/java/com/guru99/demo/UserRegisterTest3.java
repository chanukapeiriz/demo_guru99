package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.ResourceFile;

public class UserRegisterTest3 {
    HomePage homePage;
    RegisterPage registerPage;
    RegisterSuccessPage registerSuccessPage;

    @BeforeMethod
    public void setUp() {
        ResourceFile.getInstance().openBrowser();
        ResourceFile.getInstance().navigateToURL();
        homePage = new HomePage();
        homePage.clickOnRegisterMenu();
        registerPage = new RegisterPage();
        registerSuccessPage = new RegisterSuccessPage();
    }

    @Test
    public void testRegisterNewUser() {
        registerSuccessPage = registerPage.setFirstName("Imperial")
                .setLastName("College")
                .setPhone("01127845854")
                .setEmail("info@imperial.lk")
                .setCountry("NORWAY")
                .setUserName("admin")
                .setPassword("admin123")
                .setConfirmPassword("admin123")
                .clickOnSubmit();
        Assert.assertEquals(registerSuccessPage.getSalutationMessage(),"Dear Imperial College,","Failed to Register!");
    }
}
