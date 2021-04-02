package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SideNavigation {
    //

    public static final Target ALL_DASHBOARDS = Target.the("Dashboards Names").located (By.xpath("//li[@class=\"ant-menu-item ant-menu-item-only-child\"]"));
    public static final Target DASHBOARDS = Target.the("Dashboards Menu").located (By.xpath("//div[@class=\"ant-menu-submenu-title\"]//span[text()='Dashboard']"));

}
