package pageObjects;

import org.openqa.selenium.By;

public class GmailPage {
    public static By getLoginButton() {
        return By.xpath(".//a[contains(@href,'/AccountChooser')]");
    }

    public static By getInputEmail() {
        return By.xpath(".//input[@id='identifierId']");
    }

    public static By getInputPassword() {
        return By.xpath(".//input[@type='password']");
    }

    public static By getSubmitUser() {
        return By.xpath(".//div[@id='identifierNext']//button");
    }

    public static By getSubmitLogin() {
        return By.xpath("//div[@id='passwordNext']//button");
    }

    public static By getLoginIcon() {
        return By.xpath(".//a[contains(@aria-label,'Cuenta de Google')]//img[contains(@src,'googleusercontent')]");
    }

    public static By getElementLogin() {
        return By.xpath(".//a[contains(@aria-label,'Cuenta de Google')]");
    }

    public static By getUserWrongMessage(){
        return By.xpath(".//div[@data-allow-at-sign='true']//div[@aria-live='assertive']");
    }

    public static By getPassWrongMessage(){
        return By.xpath(".//span[contains(text(),'incorrecta. Vuelve a intentarlo')]");
    }
}
