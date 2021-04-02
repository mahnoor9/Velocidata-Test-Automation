package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreenVelocidata {
    public static final Target EMAIL_FIELD = Target.the("Email field").located (By.id ("email-or-username-field"));
    public static final Target PASSWORD_FIELD = Target.the("Password field").located (By.id ("password-input"));
    public static final Target KEYCLOAK_BUTTON = Target.the("keycloak identity provider button").located (By.id ("social-keycloak-oidc"));
    public static final Target ADMINISTRATION_CONSOLE = Target.the("Administration console").located (By.linkText("Administration Console"));

}
