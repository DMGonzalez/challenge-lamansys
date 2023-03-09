package stepsDefinitions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import pageMethods.RequestMethods;

public class RequestDefinitions {
    @Dado("Que se realiza una consulta a Pokeapi")
    public void queSeRealizaUnaConsultaAPokeapi() {
        RequestMethods.apiRequest();
    }

    @Entonces("La api responde correctamente mostrando '28' valores")
    public void laApiRespondeCorrectamenteMostrandoValores() {
        RequestMethods.checkStatusAndQuantity();
    }
}
