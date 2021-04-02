package tasks.Dashboards;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.ClusterCollectorScreen.CollectorCluster;


import net.serenitybdd.screenplay.Task;
        import net.serenitybdd.screenplay.actions.Click;
        import net.serenitybdd.screenplay.actions.Enter;
        import userinterface.ClusterCollectorScreen;

        import static org.openqa.selenium.Keys.ENTER;
        import static userinterface.ClusterCollectorScreen.*;
        import static userinterface.ClusterCollectorScreen.ASGGroupField;
import static userinterface.SideNavigation.DASHBOARDS;

public class ClickOnDashboardMenu {

    public static Task DashboardNav(){
        return Task.where("{0} Clicks on dashboard in the side nav",
                Click.on (DASHBOARDS)
        );

    }
}
