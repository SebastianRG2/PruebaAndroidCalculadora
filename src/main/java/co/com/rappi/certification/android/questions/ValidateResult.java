package co.com.rappi.certification.android.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateResult implements Question {
    private Target target;
    @Override
    public Object answeredBy(Actor actor) {
        return target.resolveFor(actor).getText();
    }

    public ValidateResult(Target target) {
        this.target = target;

    }

    public static ValidateResult succesfully(Target target) {
        return new ValidateResult(target);
    }
}
