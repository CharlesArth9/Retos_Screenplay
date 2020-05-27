package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationDemoFormPage extends PageObject {

    public static final Target INPUT_NAME = Target.the
            ("Se ingresa nombre").located(By.cssSelector("input[placeholder='First Name']"));

    public static final Target INPUT_LASTNAME = Target.the
            ("Se ingresa apellido").located(By.cssSelector("input[placeholder='Last Name']"));

    public static final Target TXT_ADRESS = Target.the
            ("Se ingresa la dirección").located(By.cssSelector("textarea[ng-model='Adress']"));

    public static final Target EMAIL = Target.the
            ("Se ingresa correo electronico").located(By.cssSelector("input[type='email']"));

    public static final Target PHONE = Target.the
            ("Se ingresa numero de celular").located(By.cssSelector("input[type='tel']"));

    public static final Target GENDER = Target.the
            ("Se ingresa genero").located(By.cssSelector("div:nth-of-type(5) div label input"));

    public static final Target HOBBIE = Target.the
            ("Se selecciona un hobbie").located(By.cssSelector("div div input[id*='checkbox']"));

    public static final Target LANGUAGE_F1 = Target.the
            ("Se selecciona el campo lenguaje").located(By.cssSelector("div#msdd"));

    public static final Target LANGUAGE = Target.the
                ("Se selecciona el campo lenguaje").located(By.cssSelector("div multi-select div ul li"));

    public static final Target SKILL = Target.the
            ("Se selecciona una especialidad").located(By.id("Skills"));

    public static final Target COUNTRY_1 = Target.the
           ("Se selecciona un pais").located(By.id("countries"));

    public static final Target COUNTRY_2 = Target.the
            ("Se selecciona un lugar").located(By.cssSelector("span[class*='select2-c']"));

    public static final Target INPUT_COUNTRY_2 = Target.the
            ("Se digita un lugar").located(By.cssSelector("input[class*='select2-search']"));

    public static final Target YEAR = Target.the
            ("Se selecciona AÑO de nacimiento").located(By.xpath("//select[@id='yearbox']"));

    public static final Target MONTH = Target.the
            ("Se selecciona MES de nacimiento").located(By.xpath("//select[@placeholder='Month']"));

    public static final Target DAY = Target.the
            ("Se selecciona DIA de nacimiento").located(By.xpath("//select[@id='daybox']"));

    public static final Target PASSWORD1 = Target.the
            ("Se ingresa el password").located(By.cssSelector("input#firstpassword"));

    public static final Target PASSWORD2 = Target.the
            ("Se confirma el password").located(By.cssSelector("input#secondpassword"));

    public static final Target BTN_SUBMIT = Target.the
            ("se presiona paa enviar la información").located(By.cssSelector("button#submitbtn"));






}
