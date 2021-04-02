package tasks.login;

import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.interactions.Actions;

import static userinterface.BrokerUI.*;

public class SelectOneColumn {

    public  static Task addColumn(String name)
    {

        return Task.where ("{0} adds " + name + "column",
               actions.DragAndDrop.dragAndDrop (SELECTED_ROLE("super-admin"), SELECTED)
                );
    }
}
