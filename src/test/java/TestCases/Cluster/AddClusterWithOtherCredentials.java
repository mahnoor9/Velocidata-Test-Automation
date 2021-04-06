package TestCases.Cluster;

import TestCases.BaseClass;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import tasks.cluster.AddingCluster;
import tasks.cluster.AddingClusterWithDifferentCredentials;
import tasks.cluster.GoToCollectorCluster;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static tasks.login.LoginToVelocidata.Login;

@UseTestDataFrom("src/test/java/TestData/ClusterWithCredentials.csv")
@RunWith(SerenityParameterizedRunner.class)
@CucumberOptions(features="src/test/resources/features/")
public class AddClusterWithOtherCredentials extends BaseClass {
    private String name;
    private String IP;
    private String ASGID;
    private String username;
    private String pass;

    void setTestData ()
    {
        this.name=name;
        this.IP=IP;
        this.ASGID=ASGID;
        this.username=username;
        this.pass=pass;

    }

    @Test
    public void Test()
    {
        james.attemptsTo (Login("super-admin","foobar"));
        tasks.cluster.AddingClusterWithDifferentCredentials AddCluster = new AddingClusterWithDifferentCredentials ();
        //  when(james).attemptsTo(AddCluster.AddingACluster ("Cluster Name","5.5.5.5","Raptor_test_asg"));
        when(james).attemptsTo (AddCluster.AddingCluster (name,IP,ASGID,username,pass));
        when(james).attemptsTo ( GoToCollectorCluster.CollectorClusterView());

        //IsClusterAdded.ClusterList (james);
        //    IsClusterAdded.GetClusterDetail (james);

    }


}
