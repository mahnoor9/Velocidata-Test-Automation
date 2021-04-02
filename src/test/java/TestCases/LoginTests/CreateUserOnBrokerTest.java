package TestCases.LoginTests;



import TestCases.BaseClass;
import TestCases.BaseClassBroker;
import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import tasks.login.CreateUserOnBroker;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static tasks.login.LoginToVelocidata.Login;
import static org.hamcrest.CoreMatchers.is;
import static userinterface.Homepage.EMAIL;

@RunWith(SerenityRunner.class)
@CucumberOptions(features="src/test/resources/features/", glue="CloneView")
public class CreateUserOnBrokerTest extends BaseClassBroker {

    @Test
    public void Test()
    {
       CreateUserOnBroker createUserOnBroker= new CreateUserOnBroker ();
        tasks.login.LoginToBroker loginToBroker = new tasks.login.LoginToBroker ();
        when(james).attemptsTo(loginToBroker.loginToBroker ("super-admin","foobar"));
        when(james).attemptsTo (createUserOnBroker.CreateUser ("test1","t@e.com","f","l","foobar"));

    }


}