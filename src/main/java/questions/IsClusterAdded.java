package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Attribute;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

import static net.thucydides.core.pages.components.HtmlTable.rowsFrom;
import static userinterface.ClusterCollectorScreen.CollectorClusterTable;
import static userinterface.ClusterCollectorScreen.CollectorClusterTableHeader;

public class IsClusterAdded {

    public Actor james;
    IsClusterAdded(Actor a)
    {
        this.james= a;
    }
    public static void ClusterList (Actor james) {
       /*List<WebElementFacade> a= CollectorClusterTable.resolveAllFor (james);
       List<String> ab= null;
       a.forEach (attribute ->
       {
          ab.add (attribute.getText ()) ;
       });
             //  Attribute.of(CollectorClusterTable).named("innerText").asAList().answeredBy(james);


                //CollectorClusterTable.resolveAllFor (james).stream ()
                //.map (WebElementFacade::getText)
                //.collect (Collectors.toList ());
*/
        List<Map<Object, String>> ab= rowsFrom(CollectorClusterTableHeader.resolveFor (james));
        System.out.println ("fsdfdsfsdf");
        for(int i=0;i< ab.size (); i++)
        {
            System.out.println (ab.size ());
            System.out.println ("here");
            System.out.println (ab.get (i));
        }
    }

    public static void IsDeletePresent(Actor james)
    {

    }

}

