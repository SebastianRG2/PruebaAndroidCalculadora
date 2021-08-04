package co.com.rappi.certification.android.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.rappi.certification.android.userinterfaces.CalculatorOptions.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Operation implements Task {
    private String operation;

    public Operation(String operation) {
        this.operation = operation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(BTN_PLUS.resolveFor(actor).getText().equals(operation)).andIfSo(
                Click.on(NUMBER_FIVE),
                Click.on(BTN_PLUS),
                Click.on(NUMBER_FIVE)
        ).otherwise(
                Check.whether(BTN_MINUS.resolveFor(actor).getText().equals(operation)).andIfSo(
                        Click.on(NUMBER_NINE),
                        Click.on(BTN_MINUS),
                        Click.on(NUMBER_FOUR)
                ).otherwise(
                        Check.whether(BTN_MULTIPLY.resolveFor(actor).getText().equals(operation)).andIfSo(
                                Click.on(NUMBER_FIVE),
                                Click.on(BTN_MULTIPLY),
                                Click.on(NUMBER_TWO)
                        ).otherwise(
                                Check.whether(BTN_DIVIDE.resolveFor(actor).getText().equals(operation)).andIfSo(
                                        Click.on(NUMBER_ONE),
                                        Click.on(NUMBER_ZERO),
                                        Click.on(BTN_DIVIDE),
                                        Click.on(NUMBER_FIVE)
                                )
                        )
                )
        ));


    }

    public static Operation calculator(String operation) {
        return Tasks.instrumented(Operation.class, operation);
    }

}
