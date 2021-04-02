package tasks.login;

import constants.Constants;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.BrokerUI;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.BrokerUI.*;
import static userinterface.BrokerUI.PASSWORD_FIELD;
import static userinterface.LoginScreenVelocidata.*;

public class CreateUserOnBroker {

    public static Task CreateUser(String username, String email, String firstname, String lastname, String password){


        return Task.where("{0} Creates a user",
                Click.on(USERS),
                 Click.on(ADD_USERS),
                Enter.theValue(username)
                        .into(USER_NAME_FIELD),
                Enter.theValue(email)
                        .into(BrokerUI.EMAIL_FIELD),
                Enter.theValue(firstname)
                        .into(FIRST_NAME_FIELD),
                Enter.theValue(lastname)
                        .into(LAST_NAME_FIELD),
                Click.on (CREATE_BUTTON),
                Click.on(CREDENTIALS_BUTTON),
                Enter.theValue(password)
                        .into(PASSWORD_FIELD),
                Enter.theValue(password)
                        .into(CONFIRM_PASSWORD_FIELD),
                Click.on(TEMPORARY_PASSWORD_TOGGLE),
                Click.on(CREATE_PASSWORD_BUTTON),
                Click.on(SAVE_PASSWORD_BUTTON),
                Click.on(ROLES),
               Click.on(SELECTED_ROLE ("super-admin")),
                Click.on(ADD_SELECTED)
        );

    }
}
