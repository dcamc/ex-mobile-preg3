package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SwagLabsLoginScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement username;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement password;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    public void clickLogin(String user, String pass){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        typeInto(username, user);
        typeInto(password, pass);
        btnLogin.click();
    }
}
