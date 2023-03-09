package stepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import pageMethods.EbayMethods;

public class EbayDefinitions {
    @Cuando("El usuario realiza una busqueda 'Guitarra electrica'")
    public void searchProduct() {
        EbayMethods.searchProduct();
    }
    @Entonces("Muestra el primer resultado de la busqueda")
    public void printFirstResult() {
        EbayMethods.printFirstProduct();
    }
}
