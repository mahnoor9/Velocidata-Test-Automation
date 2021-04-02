package TestCases.LoginTests;

import TestCases.BaseClass;
import TestCases.BaseClassBroker;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.WhichUserIsLoggedIn;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static userinterface.BrokerUI.LOGGED_IN_USER;


@RunWith(SerenityRunner .class)
@CucumberOptions(features="src/test/resources/features/", glue="CloneView")
public class LoginToBroker extends BaseClassBroker {


    @Test
    public void Test()
    {
        tasks.login.LoginToBroker loginToBroker = new tasks.login.LoginToBroker ();
        when(james).attemptsTo(loginToBroker.loginToBroker ("super-admin","foobar"));

    }


}
