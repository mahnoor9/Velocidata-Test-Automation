package actions;

import net.serenitybdd.core.pages.SerenityActions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class DragAndDrop implements Interaction {

    public static Target target;
    public static Target source;

    public DragAndDrop (Target source, Target target)
    {
        this.source= source;
        this.target= target;
    }

    @Override
    @Step("{0} drag and drop from source to target")
    public <T extends Actor> void performAs(T theActor) {
        SerenityActions action = new SerenityActions ((WebDriverFacade) getDriver());
        action.dragAndDrop (source.resolveFor (theActor), target.resolveFor (theActor));
    }

    public static Interaction dragAndDrop(Target source,Target target) {
        return instrumented(DragAndDrop.class, source, target);
    }

}
