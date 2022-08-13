package com.nttdata.steps;

import com.nttdata.screens.*;
import net.thucydides.core.annotations.Step;

public class SwagLabsSteps {

    SwagLabsLoginScreen loginScreen;
    SwagLabsMainScreen mainScreen;

    @Step("Click en login")
    public void clickLogin(String user, String pass){
        loginScreen.clickLogin(user, pass);
    }

    @Step("Valida titulo")
    public String getResultText(){
        return mainScreen.getResultText1();
    }



}
