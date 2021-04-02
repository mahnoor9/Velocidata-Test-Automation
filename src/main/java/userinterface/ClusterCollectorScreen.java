package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ClusterCollectorScreen {
    public static final Target CollectorCluster = Target.the("Collector Cluster").located (By.xpath("//*[contains(text(),'Collector Cluster')]"));
    public static final Target Management = Target.the("Click on management").located (By.linkText("Management"));
    public static final Target AddClusterButton= Target.the("Add Cluster Button").located (By.xpath("//*[contains(text(),'Add Cluster')]"));
    public static final Target ClusterName = Target.the("Cluster name field").located (By.name("cluster_name"));
    public static final Target ClusterIP = Target.the("Cluster ip field").located (By.name("customer_ip"));
    public static final Target ASGGroupField = Target.the("ASG field").located (By.name("group_id"));
    public static final Target Done = Target.the("Done Button").located (By.cssSelector("button.ant-btn.sc-eCssSg.lptUoA"));
    public static final Target CollectorClusterTable = Target.the("Collector Cluster table").located(By.xpath("//tbody[@class='ant-table-tbody']"));
    public static final Target CollectorClusterTableHeader = Target.the("Collector Cluster table").located(By.xpath("//tbody[@class='ant-table-tbody']"));

}
