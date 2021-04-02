package TestCases;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static tasks.login.LoginToVelocidata.Login;

public class BaseClassBroker {

    public Actor james = Actor.named("James");

    @Managed
    public WebDriver driver;

    @Before
    public void setup()
    {

        driver.get( "https://front.opsdev.cf/keycloak/" );
        james.can(BrowseTheWeb.with(driver));
        //james.attemptsTo (Login("super-admin","foobar"));
    }
  //  @Before
    //public void jamesCanBrowseTheWeb() {

    //}

}
