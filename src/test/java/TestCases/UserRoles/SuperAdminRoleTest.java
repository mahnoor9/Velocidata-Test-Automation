package TestCases.UserRoles;

import TestCases.BaseClass;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import questions.IsRoleUser;
import tasks.Dashboards.ClickOnDashboardMenu;
import tasks.cluster.AddingCluster;
import tasks.cluster.GoToCollectorCluster;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static tasks.login.LoginToVelocidata.Login;
import static userinterface.ClusterCollectorScreen.AddClusterButton;


@RunWith(SerenityRunner.class)
public class SuperAdminRoleTest extends BaseClass {



    @Test
    public void Test()
    {
        IsRoleUser isRoleUser = new IsRoleUser (james);
        james.attemptsTo (Login("super-admin","foobar"));
        ClickOnDashboardMenu clickOnDashboardMenu = new ClickOnDashboardMenu ();

        when(james).attemptsTo(clickOnDashboardMenu.DashboardNav(), Ensure.that(isRoleUser.DashboardSummaryToBeDisabled (james)).isFalse ());

        GoToCollectorCluster goToCollectorCluster= new GoToCollectorCluster ();
        when(james).attemptsTo (goToCollectorCluster.CollectorClusterView(), Ensure.that(AddClusterButton).isDisplayed ());

    }

}