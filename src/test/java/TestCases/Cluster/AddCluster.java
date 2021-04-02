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
import questions.IsClusterAdded;
import questions.WhichUserIsLoggedIn;
import tasks.cluster.AddingCluster;
import tasks.cluster.GoToCollectorCluster;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static userinterface.BrokerUI.LOGGED_IN_USER;

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
        tasks.cluster.AddingCluster AddCluster = new AddingCluster();
    //  when(james).attemptsTo(AddCluster.AddingACluster ("Cluster Name","5.5.5.5","Raptor_test_asg"));
     // when(james).attemptsTo (AddCluster.AddingACluster ("name","5.5.5.5","abc"));
       //when(james).attemptsTo ( GoToCollectorCluster.CollectorClusterView());
      System.out.println ("heyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
     IsClusterAdded.ClusterList (james);
    //   for(int i=0; i<=a.size(); i++)
      //  { System.out.println (a.get (i) ); }
    }


}
