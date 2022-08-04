package com.amazon.webpages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private static String Page_Url = "https://www.amazon.com/";
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
