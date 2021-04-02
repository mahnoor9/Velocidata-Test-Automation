package TestCases.LoginTests;



import TestCases.BaseClass;
import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.WhichUserIsLoggedIn;
import tasks.cluster.AddingCluster;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static tasks.login.LoginToVelocidata.Login;
import static org.hamcrest.CoreMatchers.is;
import static userinterface.Homepage.EMAIL;

@RunWith(SerenityRunner.class)
@CucumberOptions(features="src/test/resources/features/", glue="CloneView")
public class LoginTest extends BaseClass {

    @Test
    public void Test()
    {
       // WhichUserIsLoggedIn whichUserIsLoggedIn= new WhichUserIsLoggedIn ();
         //when(james).attemptsTo(Login("super-admin","foobar"), Ensure.that (EMAIL).hasText ("useremail@domain.com"));
        tasks.cluster.AddingCluster AddCluster = new AddingCluster ();
        when(james).attemptsTo(AddCluster.AddingACluster ("Cluster Name","5.5.5.5","Raptor_test_asg"));
    }


}