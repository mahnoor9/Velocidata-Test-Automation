package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ClusterCollectorScreen {
    public static final Target CollectorCluster = Target.the ("Collector Cluster").located (By.xpath ("//*[contains(text(),'Collector Cluster')]"));
    public static final Target Management = Target.the ("Click on management").located (By.linkText ("Management"));
    public static final Target AddClusterButton = Target.the ("Add Cluster Button").located (By.xpath ("//*[contains(text(),'Add Cluster')]"));
    public static final Target ClusterName = Target.the ("Cluster name field").located (By.name ("cluster_name"));
    public static final Target ClusterIP = Target.the ("Cluster ip field").located (By.name ("customer_ip"));
    public static final Target ASGGroupField = Target.the ("ASG field").located (By.name ("group_id"));
    public static final Target Done = Target.the ("Done Button").located (By.cssSelector ("button.ant-btn.sc-eCssSg.lptUoA"));

    public static final Target SPECIFIC_CLUSTER (String name) {
        return Target.the ("Collector Cluster table").located (By.xpath ("//td[normalize-space()='" + name + "']"));
    }

    //"//tbody[@class='ant-table-tbody']"
    public static Target COLLECTOR_ROW (String name) {

        return Target.the ("Cluster row of name" + name).located (By.xpath ("//td[normalize-space()='" + name + "']//following-sibling::td//div[@class='sc-dPiKHq fsoffo']"));
    }

    public static final Target YES_BUTTON_FOR_DELETE = Target.the ("Click on Yes for delete cluster").located (By.xpath ("//button//span[text() = 'Yes'] "));
    public static final Target USERNAME_FIELD = Target.the ("username field for the cluster").located (By.xpath ("//input[@name='username']"));
    public static final Target PASS_FIELD = Target.the ("password field for the cluster").located (By.xpath ("//input[@name='password']"));
    public static final Target DEFAULT_CRED_CHECKBOX = Target.the ("default credentials checkbox for the cluster").located (By.xpath ("//label[@class= 'ant-checkbox-wrapper sc-fFehDp evwuBH'] "));

    public static final Target ASGGROUD_COL = Target.the ("Auto Scaling Group ID column").located (By.xpath ("//th[normalize-space()='Auto Scaling Group ID'] "));
    public static final Target TABLE_HEADER = Target.the ("Collector Cluster table header elements").located (By.xpath ("//thead/tr/th "));


    public static Target EDIT_COLLECTOR_ROW (String name) {

        return Target.the ("Cluster row of name" + name).located (By.xpath ("//td[normalize-space()='" + name + "']//following-sibling::td//button[@class='ant-btn sc-pVTma dbLuq']"));
    }

    //div[text()='Cluster with same information already exists']

    public static final Target VAL_ERROR_DUPLICATE = Target.the ("Error message on duplicate cluster").located (By.xpath ("//div[text()='Cluster with same information already exists']"));

}
