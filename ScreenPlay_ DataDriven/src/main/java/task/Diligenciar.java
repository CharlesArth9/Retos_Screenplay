package task;

import interactions.CheckOption;
//import model.AutomationDemoData;
import model.AutomationDemoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userInterface.*;
import java.util.List;
import static util.Constantes.INFORMACION;

public class Diligenciar implements Task {

    List<AutomationDemoData> datos;

    public Diligenciar(List<AutomationDemoData> datos) {
        this.datos = datos;
    }

    public static Diligenciar elFormulario(List<AutomationDemoData> automationDemoDataList)


    {return Tasks.instrumented(Diligenciar.class, automationDemoDataList);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(INFORMACION).getName()).into(AutomationDemoFormPage.INPUT_NAME),
                Enter.theValue(datos.get(INFORMACION).getLastname()).into(AutomationDemoFormPage.INPUT_LASTNAME),
                Enter.theValue(datos.get(INFORMACION).getAddress()).into(AutomationDemoFormPage.TXT_ADRESS),
                Enter.theValue(datos.get(INFORMACION).getEmail()).into(AutomationDemoFormPage.EMAIL),
                Enter.theValue(datos.get(INFORMACION).getPhone()).into(AutomationDemoFormPage.PHONE),
                CheckOption.from(AutomationDemoFormPage.GENDER,datos.get(INFORMACION).getGender()),
                CheckOption.from(AutomationDemoFormPage.HOBBIE,datos.get(INFORMACION).getHobbies()),
                Click.on(AutomationDemoFormPage.LANGUAGE_F1),
                CheckOption.from(AutomationDemoFormPage.LANGUAGE,datos.get(INFORMACION).getLanguages()),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getSkill()).from(AutomationDemoFormPage.SKILL),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getCountry1()).from(AutomationDemoFormPage.COUNTRY_1),
                Click.on(AutomationDemoFormPage.COUNTRY_2),
                Enter.theValue(datos.get(INFORMACION).getCountry2()).into(AutomationDemoFormPage.INPUT_COUNTRY_2),
                Hit.the(Keys.ENTER).into(AutomationDemoFormPage.INPUT_COUNTRY_2),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getYear()).from(AutomationDemoFormPage.YEAR),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getMonth()).from(AutomationDemoFormPage.MONTH),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getDay()).from(AutomationDemoFormPage.DAY),
                Enter.theValue(datos.get(INFORMACION).getPassword1()).into(AutomationDemoFormPage.PASSWORD1),
                Enter.theValue(datos.get(INFORMACION).getPassword2()).into(AutomationDemoFormPage.PASSWORD2),
                Click.on(AutomationDemoFormPage.BTN_SUBMIT)
                );
    }
}
