package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Homepage {
    public static final Target EMAIL = Target.the("User email").located (By.className ("email"));
}
