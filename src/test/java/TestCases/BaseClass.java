package TestCases;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.WebDriver;
import tasks.login.LoginToVelocidata;

import static tasks.login.LoginToVelocidata.Login;

public class BaseClass {

    public Actor james = Actor.named("James");

    @Managed
    public WebDriver driver;

    @Before
    public void setup()
    { //"https://front.opsdev.cf/keycloak/"
        driver.get( "https://front.opsdev.cf/collector_management" );
        james.can(BrowseTheWeb.with(driver));

    }
  //  @Before
    //public void jamesCanBrowseTheWeb() {

    //}

}
