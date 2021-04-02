package tasks.login;

import constants.Constants;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.LoginScreenVelocidata.*;

public class LoginToBroker {

    public static Task loginToBroker(String Username, String Password){
      //  Click.on (ADMINISTRATION_CONSOLE);
        return Task.where("{0} logs into the broker",
                Click.on (ADMINISTRATION_CONSOLE),
                Enter.theValue(Username)
                        .into(EMAIL_FIELD),
                Enter.theValue(Password)
                        .into(PASSWORD_FIELD)
                        .thenHit(ENTER)
        );

    }
}
