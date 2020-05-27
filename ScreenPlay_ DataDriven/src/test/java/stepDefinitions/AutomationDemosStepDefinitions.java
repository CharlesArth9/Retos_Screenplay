package stepDefinitions;

import model.AutomationDemoData;
//import questions.Answer;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.Answer;
import task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.Diligenciar;

import java.util.List;

public class AutomationDemosStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos wants join to the website Automation Demo site$")
    public void than_Carlos_wants_join_to_the_website_Automation_Demo_site() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^Carlos fill the form with your data$")
    public void Carlos_fill_the_form_with_your_data(List<AutomationDemoData> automationDemoDataList) {
        OnStage.theActorCalled("Carlos").attemptsTo(Diligenciar.elFormulario(automationDemoDataList));
    }

    @Then("^verify that the registration was correct with the text (.*)$")
    public void verify_that_the_registration_was_correct_with_the_text_Table_Row(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
