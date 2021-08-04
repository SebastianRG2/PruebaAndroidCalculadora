package co.com.rappi.certification.android.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CalculatorOptions {
    public static final Target BTN_PLUS = Target.the("Button Plus").
            locatedBy("//*[@content-desc= 'plus']");
    public static final Target BTN_MINUS = Target.the("Button Minus").
            locatedBy("//*[@content-desc= 'minus']");
    public static final Target BTN_MULTIPLY = Target.the("Button Multiply").
            locatedBy("//*[@content-desc= 'multiply']");
    public static final Target BTN_DIVIDE = Target.the("Button Divide").
            locatedBy("//*[@content-desc= 'divide']");
    public static final Target NUMBER_FIVE = Target.the("Number five").
            located(By.id("com.android.calculator2:id/digit_5"));
    public static final Target NUMBER_FOUR = Target.the("Number four").
            located(By.id("com.android.calculator2:id/digit_4"));
    public static final Target NUMBER_NINE = Target.the("Number nine").
            located(By.id("com.android.calculator2:id/digit_9"));
    public static final Target NUMBER_TWO = Target.the("Number two").
            located(By.id("com.android.calculator2:id/digit_2"));
    public static final Target NUMBER_ONE = Target.the("Number one").
            located(By.id("com.android.calculator2:id/digit_1"));
    public static final Target NUMBER_ZERO = Target.the("Number zero").
            located(By.id("com.android.calculator2:id/digit_0"));
    public static final Target TITLE_RESULT = Target.the("Tittle Result Operation").
            located(By.id("com.android.calculator2:id/result"));

}
