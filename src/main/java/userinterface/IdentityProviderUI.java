package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IdentityProviderUI {

    public static final Target EMAIL_FIELD = Target.the("Email field").located (By.id ("username"));
    public static final Target PASSWORD_FIELD = Target.the("Password field").located (By.id ("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located (By.id ("kc-login"));

}
