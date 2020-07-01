package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.AutomationDemoWebTablePage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String texto = Text.of(AutomationDemoWebTablePage.CHECK_TXT).viewedBy(actor).asString();

    if(texto.contains(question)) {
            result = true;
        } else {
            result = false;
            }
            return result;
        }
}
