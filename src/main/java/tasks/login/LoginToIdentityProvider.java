package tasks.login;

import constants.Constants;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.IdentityProviderUI;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.LoginScreenVelocidata.*;

public class LoginToIdentityProvider {
    public static Task LoginToIdentityProvider(String Username, String Password){
        Click.on (ADMINISTRATION_CONSOLE);
        return Task.where("{0} logs into the broker",
                Enter.theValue(Username)
                        .into(IdentityProviderUI.EMAIL_FIELD),
                Enter.theValue(Password)
                        .into(IdentityProviderUI.PASSWORD_FIELD)
                        .thenHit(ENTER)
        );

    }
}
