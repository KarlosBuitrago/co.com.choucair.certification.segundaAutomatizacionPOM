package co.com.choucair.certification.segundaAutomatizacionPOM.stepDefinitions;

import co.com.choucair.certification.segundaAutomatizacionPOM.step.OpenApp;
import co.com.choucair.certification.segundaAutomatizacionPOM.step.TaskAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Steps
    OpenApp openApp;
    TaskAction taskAction;

    @Given("^I enter with may credentials$")
    public void iEnterWithMayCredentials(){
        openApp.appUrl();
    }


    @When("^I proceed with the authentication$")
    public void iProceedWithTheAuthentication() throws Exception{
        taskAction.signIn();
    }

    @Then("^go to the main view of the page$")
    public void goToTheMainViewOfThePage(){
        taskAction.verificar();
    }

}
