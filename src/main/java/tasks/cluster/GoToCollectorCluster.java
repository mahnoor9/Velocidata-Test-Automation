package tasks.cluster;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ClusterCollectorScreen;

import static org.openqa.selenium.Keys.ENTER;
import static userinterface.ClusterCollectorScreen.*;
import static userinterface.ClusterCollectorScreen.ASGGroupField;

public class GoToCollectorCluster {

    public Task CollectorClusterView(){
        Click.on (CollectorCluster);
        return Task.where("{0} goes to cluster view",
                Click.on (CollectorCluster)
        );

    }
}
