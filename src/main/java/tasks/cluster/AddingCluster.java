package tasks.cluster;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ClusterCollectorScreen;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.ClusterCollectorScreen.*;
import static userinterface.LoginScreenVelocidata.*;

public class AddingCluster {
    public Task AddingACluster(String ClusterName, String CostumerIP, String ASGGroup){
         Click.on (CollectorCluster);
         Click.on(AddClusterButton);
        return Task.where("{0} adds a cluster",
                Click.on (CollectorCluster),
        Click.on(AddClusterButton),
                Enter.theValue(ClusterName)
                        .into(ClusterCollectorScreen.ClusterName),
                Enter.theValue(CostumerIP)
                        .into(ClusterIP),
                Enter.theValue(ASGGroup)
                        .into(ASGGroupField)
                        .thenHit(ENTER)
        );

    }
}
