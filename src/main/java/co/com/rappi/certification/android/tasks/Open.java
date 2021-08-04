package co.com.rappi.certification.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.rappi.certification.android.userinterfaces.CalculatorOptions.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Open implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_PLUS, isVisible()).forNoMoreThan(30).seconds());
    }

    public static Open appCalculator() {
        return Tasks.instrumented(Open.class);
    }
}
