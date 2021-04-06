package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.stream.Collectors;

import static net.thucydides.core.pages.components.HtmlTable.filterRows;
import static net.thucydides.core.pages.components.HtmlTable.rowsFrom;
import static userinterface.ClusterCollectorScreen.*;
/*
public class IsClusterAdded {

    public Actor james;
    IsClusterAdded(Actor a)
    {
        this.james= a;
    }
    public static void ClusterList (Actor james) {
       List<WebElementFacade> a= CollectorClusterTable.resolveAllFor (james);
       List<String> ab= null;
       a.forEach (attribute ->
       {
          ab.add (attribute.getText ()) ;
       });
             //  Attribute.of(CollectorClusterTable).named("innerText").asAList().answeredBy(james);


                //CollectorClusterTable.resolveAllFor (james).stream ()
                //.map (WebElementFacade::getText)
                //.collect (Collectors.toList ());

      //  List<WebElement> ab= filterRows (CollectorClusterTable.resolveFor (james), Objects::);
                //rowsFrom(CollectorClusterTableHeader.resolveFor (james));
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
    public static void GetClusterDetail(Actor james)
    {
      //  ClusterRow ("test").
       // String s= Attribute.of(ClusterRow("test")).named("tagName").asAString ().answeredBy(james);
       // List<Map<Object, String>> ab=
          //      rowsFrom(CollectorClusterTableHead.resolveFor (james));

        List<String> ab= Text.of (CollectorClusterTableHeader).asAList ().answeredBy (james);

        for(int i=0;i< ab.size (); i++)
        {
            System.out.println ("print string");
           // System.out.println (s)
            System.out.println (ab.get (i));
        }
    }

}

*/