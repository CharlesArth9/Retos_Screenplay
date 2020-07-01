package task;

import exceptions.ErrorAlDiligenciarDatos;
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
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterface.AutomationDemoFormPage.*;
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

        actor.attemptsTo(Enter.theValue(datos.get(INFORMACION).getName()).into(INPUT_NAME),
                Enter.theValue(datos.get(INFORMACION).getLastname()).into(INPUT_LASTNAME),
                Enter.theValue(datos.get(INFORMACION).getAddress()).into(TXT_ADRESS),
                Enter.theValue(datos.get(INFORMACION).getEmail()).into(EMAIL),
                Enter.theValue(datos.get(INFORMACION).getPhone()).into(PHONE),
                CheckOption.from(GENDER,datos.get(INFORMACION).getGender()),
                CheckOption.from(HOBBIE,datos.get(INFORMACION).getHobbies()),
                Click.on(LANGUAGE_F1),
                CheckOption.from(LANGUAGE,datos.get(INFORMACION).getLanguages()),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getSkill()).from(SKILL),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getCountry1()).from(COUNTRY_1),
                Click.on(COUNTRY_2),
                Enter.theValue(datos.get(INFORMACION).getCountry2()).into(INPUT_COUNTRY_2),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY_2),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getYear()).from(YEAR),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getMonth()).from(MONTH),
                SelectFromOptions.byVisibleText(datos.get(INFORMACION).getDay()).from(DAY),
                Enter.theValue(datos.get(INFORMACION).getPassword1()).into(PASSWORD1),
                Enter.theValue(datos.get(INFORMACION).getPassword2()).into(PASSWORD2),
                Click.on(BTN_SUBMIT)
                );

        actor.should(seeThat(the(MENSAJE_ERROR), isNotVisible())
                .orComplainWith(ErrorAlDiligenciarDatos.class, "Error al diligenciar los datos, compruebe que el correo o el numero de celular no esten registrados previamente"));

    }
}
