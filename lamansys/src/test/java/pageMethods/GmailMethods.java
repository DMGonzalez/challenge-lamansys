package pageMethods;

import pageObjects.GmailPage;

public class GmailMethods {
    public static void goToLoginPage() {
        CommonsMethods.elementWaitDisplayed(GmailPage.getLoginButton(), 5);
        CommonsMethods.elementClick(GmailPage.getLoginButton());
    }

    public static void enterUsername(String username) {
        CommonsMethods.elementWaitDisplayed(GmailPage.getInputEmail(), 5);
        CommonsMethods.elementSendText(GmailPage.getInputEmail(), username);
        CommonsMethods.elementWaitDisplayed(GmailPage.getSubmitUser(), 5);
        CommonsMethods.elementClick(GmailPage.getSubmitUser());
    }
    public static void enterPassword(String password) {
        CommonsMethods.elementWaitDisplayed(GmailPage.getInputPassword(), 5);
        CommonsMethods.elementSendText(GmailPage.getInputPassword(), password);
        CommonsMethods.elementWaitDisplayed(GmailPage.getSubmitLogin(), 5);
        CommonsMethods.elementClick(GmailPage.getSubmitLogin());
    }
    public static void loginRightCredentials() {
        enterUsername(CommonsMethods.props.userGmail());
        enterPassword(CommonsMethods.props.passGmail());
    }

    public static void checkLoginSuccessfully() {
        CommonsMethods.elementWaitDisplayed(GmailPage.getLoginIcon(), 20);
        String labelElement = CommonsMethods.driver.findElement(GmailPage.getElementLogin())
                .getAttribute("aria-label");
        System.out.println("ELEMENT '" + labelElement + "' IS DISPLAYED");
    }

    public static void errorMessageShownIndicatingIncorrectPassword() {
        CommonsMethods.elementWaitDisplayed(GmailPage.getPassWrongMessage(),10);
        CommonsMethods.viewTextElementDisplayed(GmailPage.getPassWrongMessage());
    }

    public static void errorMessageShowsIndicatingIncorrectEmailUser() {
        CommonsMethods.elementWaitDisplayed(GmailPage.getUserWrongMessage(),10);
        CommonsMethods.viewTextElementDisplayed(GmailPage.getUserWrongMessage());
    }
}
