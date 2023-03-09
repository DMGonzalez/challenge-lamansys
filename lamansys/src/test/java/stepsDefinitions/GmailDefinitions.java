package stepsDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import pageMethods.CommonsMethods;
import pageMethods.GmailMethods;

public class GmailDefinitions {
    @Y("el usuario accede a la pantalla de login")
    public void loginPage() {
        GmailMethods.goToLoginPage();
    }

    @Cuando("El usuario ingresa credenciales correctas")
    public void loginRightCredentials() {
        GmailMethods.loginRightCredentials();
    }

    @Entonces("El usuario se encuentra en la pagina de inicio")
    public void checkLoginSuccessfully() {
        GmailMethods.checkLoginSuccessfully();
    }

    @Cuando("El usuario ingresa password incorrecto")
    public void elUsuarioIngresaCredencialesInvalidas() {
        GmailMethods.enterUsername(CommonsMethods.props.userGmail());
        GmailMethods.enterPassword(CommonsMethods.props.passGmailIncorrecto());
    }

    @Entonces("Se muestra mensaje de error indicando credenciales invalidas")
    public void seMuestraMensajeDeErrorIndicandoCredencialesInvalidas() {
        GmailMethods.errorMessageShownIndicatingIncorrectPassword();
    }

    @Cuando("El usuario ingresa campo email con usuario incorrecto")
    public void elUsuarioIngresaCampoEmailConUsuarioIncorrecto() {
        GmailMethods.enterUsername(CommonsMethods.props.userGmailIncorrecto());
    }

    @Entonces("Se muestra mensaje de error indicando usuario incorrecto de email")
    public void seMuestraMensajeDeErrorIndicandoUsuarioIncorrectoDeEmail() {
        GmailMethods.errorMessageShowsIndicatingIncorrectEmailUser();
    }
}
