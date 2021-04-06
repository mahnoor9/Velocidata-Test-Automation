package TestCases.Cluster;

import TestCases.BaseClass;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import tasks.cluster.DeleteClusterTask;
import tasks.cluster.GoToCollectorCluster;

import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static tasks.login.LoginToVelocidata.Login;
import static userinterface.ClusterCollectorScreen.SPECIFIC_CLUSTER;

@UseTestDataFrom("src/test/java/TestData/AddCluster.csv")
@RunWith(SerenityParameterizedRunner.class)
public class DeleteCluster extends BaseClass {


    private String name;

    void setTestData ()
    {
        this.name=name;

    }

    @Test
    public void Test()
    {
        james.attemptsTo (Login("super-admin","foobar"));
        DeleteClusterTask deleteCluster = new DeleteClusterTask ();
        when(james).attemptsTo ( GoToCollectorCluster.CollectorClusterView());
       when(james).attemptsTo (deleteCluster.DeleteThisCluster(name));
       Ensure.that (SPECIFIC_CLUSTER (name)).isNotDisplayed () ;

    }
}
