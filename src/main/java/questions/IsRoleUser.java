package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Attribute;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static net.thucydides.core.pages.components.HtmlTable.rowsFrom;
import static userinterface.ClusterCollectorScreen.CollectorClusterTableHeader;
import static userinterface.SideNavigation.ALL_DASHBOARDS;
import static userinterface.SideNavigation.DASHBOARDS;

public class IsRoleUser {


    public Actor james;

    public IsRoleUser (Actor a) {
        this.james = a;
    }

    public static Boolean DashboardSummaryToBeDisabled (Actor james) {
        Click.on (DASHBOARDS);
        List<String> ListOfDashboards = new ArrayList<> ();
        ALL_DASHBOARDS.resolveAllFor (james).forEach (attribute ->
        {
            ListOfDashboards.add (attribute.getText ());
        });

        for (int i = 0; i < ListOfDashboards.size (); i++) {

            if (ListOfDashboards.contains ("Summary")) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

}
