package co.com.rappi.certification.android.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/operations_calculator.feature",
        glue = "co/com/rappi/certification/android/stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class Operation {
}
