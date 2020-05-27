package userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationDemoWebTablePage extends PageObject {

    public static final Target CHECK_TXT = Target.the
            ("texto a validar").located(By.cssSelector("div h4"));

}
