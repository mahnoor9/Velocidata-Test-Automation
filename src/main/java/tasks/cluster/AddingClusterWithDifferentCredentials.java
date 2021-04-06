package tasks.cluster;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ClusterCollectorScreen;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.ClusterCollectorScreen.*;
import static userinterface.ClusterCollectorScreen.ASGGroupField;

public class AddingClusterWithDifferentCredentials {
    public Task AddingCluster(String ClusterName, String CostumerIP, String ASGGroup, String username, String password){
        Click.on (CollectorCluster);
        Click.on(AddClusterButton);
        return Task.where("{0} adds a cluster with different credetials",
                Click.on (CollectorCluster),
                Click.on(AddClusterButton),
                Enter.theValue(ClusterName)
                        .into(ClusterCollectorScreen.ClusterName),
                Enter.theValue(CostumerIP)
                        .into(ClusterIP),
                Enter.theValue(ASGGroup)
                        .into(ASGGroupField),
                Click.on (DEFAULT_CRED_CHECKBOX),
                Enter.theValue(username)
                        .into(USERNAME_FIELD),
                Enter.theValue (password)
                        .into(PASS_FIELD)
                        .thenHit(ENTER)
        );

    }
}
