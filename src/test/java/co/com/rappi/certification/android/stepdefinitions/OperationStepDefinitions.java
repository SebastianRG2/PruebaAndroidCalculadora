package co.com.rappi.certification.android.stepdefinitions;

import co.com.rappi.certification.android.exceptions.ExceptionError;
import co.com.rappi.certification.android.questions.ValidateResult;
import co.com.rappi.certification.android.tasks.Open;
import co.com.rappi.certification.android.tasks.Operation;
import co.com.rappi.certification.android.userinterfaces.CalculatorOptions;
import co.com.rappi.certification.android.utils.MobileDriver;
import co.com.rappi.certification.android.utils.MsgError;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.net.MalformedURLException;

import static co.com.rappi.certification.android.userinterfaces.CalculatorOptions.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.containsString;

public class OperationStepDefinitions {

    @Before
    public void onStage() throws MalformedURLException {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(MobileDriver.instance())));
        theActorCalled("User");
    }

    @Given("^the user is in the mobile app$")
    public void theUserIsInTheMobileApp() {
        theActorInTheSpotlight().wasAbleTo(Open.appCalculator());
    }

    @When("^the user enter his data (.*)$")
    public void theUserEnterHisData(String operation) {
        theActorInTheSpotlight().attemptsTo(Operation.calculator(operation));
    }

    @Then("^the user will see the (.*) on the screen$")
    public void theUserWillSeeTheResultOnTheScreen(String message) {
        theActorInTheSpotlight().should(seeThat(ValidateResult.succesfully(TITLE_RESULT), containsString(message)).orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR.getMsg()));
    }

}
