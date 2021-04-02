package tasks.login;

import constants.Constants;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.LoginScreenVelocidata.EMAIL_FIELD;
import static userinterface.LoginScreenVelocidata.PASSWORD_FIELD;

public class LoginToVelocidata {
    public static Task Login(String Username, String Password){
        return Task.where("{0} logs into the app",
                Enter.theValue(Username)
                        .into(EMAIL_FIELD),
                Enter.theValue(Password)
                        .into(PASSWORD_FIELD)
                        .thenHit(ENTER)
        );

    }
}
