package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.Homepage;

public class WhichUserIsLoggedIn {

    public static Question<String> userEmail() {
        return Text.of(Homepage.EMAIL)
                .describedAs("email of the logged in user")
                .asAString ();
    }


}
