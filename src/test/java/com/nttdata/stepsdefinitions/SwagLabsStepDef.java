package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class SwagLabsStepDef {

    @Steps
    SwagLabsSteps swagLabsSteps;
    @Given("que me encuentro en el login de SwagLabs")
    public void queMeEncuentroEnElLoginDeSwagLabs() {
    }

    @When("inicio sesión exitosamente con las credenciales usuario {string} y contraseña {string}")
    public void inicioSesiónExitosamenteConLasCredencialesUsuarioYContraseña(String user, String password) {
        swagLabsSteps.clickLogin(user, password);
    }

    @Then("muestra el título {string}")
    public void muestraElTítulo(String arg0) {
        
    }

    @And("existe al menos un item")
    public void existeAlMenosUnItem() {
    }
}
