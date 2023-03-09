package stepsDefinitions;

import io.cucumber.java.es.Dado;
import pageMethods.CommonsMethods;

public class GeneralDefinitions {
    @Dado("^Que el usuario ingresa a ([^\"]*)$")
    public void goToBaseUrl(String url) {
        CommonsMethods.goToPage(url);
    }
}
