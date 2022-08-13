package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SwagLabsMainScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement tituloProducts;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]/android.view.ViewGroup/android.widget.ImageView")
    private WebElement productoExistente;

    public String getResultText1(){
        return tituloProducts.getText();
    }
    public String getResultItem(){
        return productoExistente.getAttribute();
    }

}
