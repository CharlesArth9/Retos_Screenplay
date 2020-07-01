$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ejercicio.feature");
formatter.feature({
  "name": "the user wants to enter the automation demo site page and register correctly",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@stories"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Fill registration form on the page Automation Demo site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@exitoso"
    }
  ]
});
formatter.step({
  "name": "than Carlos wants join to the website Automation Demo site",
  "keyword": "Given "
});
formatter.step({
  "name": "Carlos fill the form with your data",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "name",
        "lastname",
        "address",
        "email",
        "phone",
        "gender",
        "hobbies",
        "languages",
        "skill",
        "country1",
        "country2",
        "year",
        "month",
        "day",
        "password1",
        "password2"
      ]
    },
    {
      "cells": [
        "\u003cname\u003e",
        "\u003clastname\u003e",
        "\u003caddress\u003e",
        "\u003cemail\u003e",
        "\u003cphone\u003e",
        "\u003cgender\u003e",
        "\u003chobbies\u003e",
        "\u003clanguages\u003e",
        "\u003cskill\u003e",
        "\u003ccountry1\u003e",
        "\u003ccountry2\u003e",
        "\u003cyear\u003e",
        "\u003cmonth\u003e",
        "\u003cday\u003e",
        "\u003cpassword1\u003e",
        "\u003cpassword2\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "verify that the registration was correct with the text Table Row.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "lastname",
        "address",
        "email",
        "phone",
        "gender",
        "hobbies",
        "languages",
        "skill",
        "country1",
        "country2",
        "year",
        "month",
        "day",
        "password1",
        "password2"
      ]
    },
    {
      "cells": [
        "Carlos",
        "Mestra",
        "calle 9c 87-99 Valle Heaven",
        "jose@gmail.com",
        "3126911943",
        "Male",
        "Movies",
        "English",
        "Adobe Photoshop",
        "Colombia",
        "Japan",
        "1990",
        "July",
        "2",
        "Qw123456789",
        "Qw123456789"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Fill registration form on the page Automation Demo site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@stories"
    },
    {
      "name": "@exitoso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "than Carlos wants join to the website Automation Demo site",
  "keyword": "Given "
});
formatter.match({
  "location": "AutomationDemosStepDefinitions.than_Carlos_wants_join_to_the_website_Automation_Demo_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Carlos fill the form with your data",
  "rows": [
    {
      "cells": [
        "name",
        "lastname",
        "address",
        "email",
        "phone",
        "gender",
        "hobbies",
        "languages",
        "skill",
        "country1",
        "country2",
        "year",
        "month",
        "day",
        "password1",
        "password2"
      ]
    },
    {
      "cells": [
        "Carlos",
        "Mestra",
        "calle 9c 87-99 Valle Heaven",
        "jose@gmail.com",
        "3126911943",
        "Male",
        "Movies",
        "English",
        "Adobe Photoshop",
        "Colombia",
        "Japan",
        "1990",
        "July",
        "2",
        "Qw123456789",
        "Qw123456789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AutomationDemosStepDefinitions.Carlos_fill_the_form_with_your_data(AutomationDemoData\u003e)"
});
formatter.result({
  "error_message": "net.serenitybdd.core.exceptions.SerenityManagedException: Error al diligenciar los datos, compruebe que el correo o el numero de celular no esten registrados previamente - \nExpected: an element that is not visible\n     but: the element identified by css: div[ng-if\u003d\u0027errorlabel\u0027] [Email already exists\nPhone number already exists] was visible\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:187)\r\n\tat task.Diligenciar.performAs(Diligenciar.java:60)\r\n\tat task.Diligenciar$$EnhancerByCGLIB$$c5ab3dd8.CGLIB$performAs$0(\u003cgenerated\u003e)\r\n\tat task.Diligenciar$$EnhancerByCGLIB$$c5ab3dd8$$FastClassByCGLIB$$81ad78e2.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.BaseMethodRunner.invokeMethod(BaseMethodRunner.java:10)\r\n\tat net.thucydides.core.steps.NormalMethodRunner.invokeMethodAndNotifyFailures(NormalMethodRunner.java:20)\r\n\tat net.thucydides.core.steps.StepInterceptor.runNormalMethod(StepInterceptor.java:361)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:132)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:68)\r\n\tat task.Diligenciar$$EnhancerByCGLIB$$c5ab3dd8.performAs(\u003cgenerated\u003e)\r\n\tat net.serenitybdd.screenplay.Actor.perform(Actor.java:106)\r\n\tat net.serenitybdd.screenplay.Actor.attemptsTo(Actor.java:90)\r\n\tat com.example.stepdefinitions.AutomationDemosStepDefinitions.Carlos_fill_the_form_with_your_data(AutomationDemosStepDefinitions.java:31)\r\n\tat ✽.Carlos fill the form with your data(src/test/resources/features/ejercicio.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify that the registration was correct with the text Table Row.",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationDemosStepDefinitions.verify_that_the_registration_was_correct_with_the_text_Table_Row(String)"
});
formatter.result({
  "status": "skipped"
});
});