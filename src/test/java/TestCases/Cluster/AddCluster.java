package TestCases.Cluster;

import TestCases.BaseClass;
import TestCases.BaseClassBroker;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.WhichUserIsLoggedIn;
import tasks.cluster.AddingCluster;
import tasks.cluster.GoToCollectorCluster;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static tasks.login.LoginToVelocidata.Login;
import static userinterface.BrokerUI.LOGGED_IN_USER;
import static userinterface.ClusterCollectorScreen.SPECIFIC_CLUSTER;

@UseTestDataFrom ("src/test/java/TestData/AddCluster.csv")
@RunWith(SerenityParameterizedRunner.class)
@CucumberOptions(features="src/test/resources/features/")
public class AddCluster extends BaseClass {

    private String name;
    private String IP;
    private String ASGID;

    void setTestData ()
    {
        this.name=name;
        this.IP=IP;
        this.ASGID=ASGID;

    }

    @Test
    public void Test()
    {
        james.attemptsTo (Login("super-admin","foobar"));
        tasks.cluster.AddingCluster AddCluster = new AddingCluster();
        when(james).attemptsTo ( GoToCollectorCluster.CollectorClusterView());
        when(james).attemptsTo (AddCluster.AddingACluster (name,IP,ASGID));
        Ensure.that (SPECIFIC_CLUSTER(name)).isDisplayed ();

     //IsClusterAdded.ClusterList (james);
 //    IsClusterAdded.GetClusterDetail (james);

    }


}
