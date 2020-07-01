package com.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features = {"src/test/resources/features/ejercicio.feature"},
//        tags =  {"@stories"},
        glue = {"com.example/stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerDemo {
}
