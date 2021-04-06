package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokerUI {


    public static final Target USERS = Target.the ("Opening All Users").located (By.linkText ("Users"));
    public static final Target ADD_USERS = Target.the ("Adding a new user").located (By.id ("createUser"));
    public static final Target USER_NAME_FIELD = Target.the ("Adding user name").located (By.id ("username"));
    public static final Target FIRST_NAME_FIELD = Target.the ("Adding first name").located (By.id ("firstName"));
    public static final Target LAST_NAME_FIELD = Target.the ("Adding last name").located (By.id ("lastName"));
    public static final Target EMAIL_FIELD = Target.the ("Adding email").located (By.id ("email"));
    public static final Target CREATE_BUTTON = Target.the ("Create User Button").located (By.cssSelector ("button.ng-binding.btn.btn-primary"));
    public static final Target PASSWORD_FIELD = Target.the ("Add a password field").located (By.id ("newPas"));
    public static final Target CONFIRM_PASSWORD_FIELD = Target.the ("Confirm Password field").located (By.id ("confirmPas"));
    public static final Target CREDENTIALS_BUTTON = Target.the ("Credentials button").located (By.linkText ("Credentials"));
    public static final Target CREATE_PASSWORD_BUTTON = Target.the ("Create Password Button").located (By.cssSelector ("button.btn.btn-default.ng-binding"));
    public static final Target TEMPORARY_PASSWORD_TOGGLE = Target.the ("Set temporary password toggle").located (By.cssSelector ("span.onoffswitch-active.ng-binding"));
    public static final Target SAVE_PASSWORD_BUTTON = Target.the ("SAVE Password Button").located (By.cssSelector ("button.ng-binding.btn.btn-danger"));
    public static final Target LOGGED_IN_USER = Target.the ("User logged in currently").located (By.cssSelector ("dropdown-toggle ng-binding"));
    public static final Target ROLES = Target.the ("open roles tab").located (By.linkText ("Role Mappings"));

    public static Target SELECTED_ROLE (String name) {

    return Target.the ("roles available").located (By.xpath ("//*[@id=\"available\"]//option[contains(., '" + name + "')]"));
}
    public static final Target SELECTED = Target.the("roles selected").located (By.id("assigned"));
    public static final Target ADD_SELECTED = Target.the("add selected").located (By.xpath ("//button[contains (., 'Add selected ')]"));
    public static final By users = By.xpath ("//tr[@class='ng-scope']");


}
