package TestCases.LoginTests;

import TestCases.BaseClass;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.WhichUserIsLoggedIn;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static tasks.login.LoginToIdentityProvider.LoginToIdentityProvider;
import static tasks.login.LoginToVelocidata.Login;
import static userinterface.Homepage.EMAIL;


@RunWith(SerenityRunner.class)
@CucumberOptions(features="src/test/resources/features/", glue="CloneView")
public class LoginUsingIdentityProvider extends BaseClass {

    @Test
    public void Test()
    {
        WhichUserIsLoggedIn whichUserIsLoggedIn= new WhichUserIsLoggedIn ();
        when(james).attemptsTo(LoginToIdentityProvider("super-admin","foobar"), Ensure.that (EMAIL).hasText ("useremail@domain.com"));

    }


}