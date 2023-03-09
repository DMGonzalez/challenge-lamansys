package pageMethods;

import pageObjects.EbayPage;

public class EbayMethods {
    public static void searchProduct() {
        CommonsMethods.elementWaitDisplayed(EbayPage.getInputSearch(),10);
        CommonsMethods.elementSendText(EbayPage.getInputSearch(), EbayPage.searchString());
        CommonsMethods.elementClick(EbayPage.getInputSubmit());

        CommonsMethods.elementWaitDisplayed(EbayPage.getFirstProduct(), 10);
    }
    public static void printFirstProduct() {
        try {
            CommonsMethods.elementClick(EbayPage.getCloseModal());
            CommonsMethods.elementClick(EbayPage.getFirstProduct());
        } catch (Exception e) {
            CommonsMethods.elementClick(EbayPage.getFirstProduct());
        }

        CommonsMethods.switchCurrentWindow();
        CommonsMethods.elementWaitDisplayed(EbayPage.getProductTitle(), 10);
        String productTitle = CommonsMethods.driver.findElement(EbayPage.getProductTitle()).getText();
        String productPrice = CommonsMethods.driver.findElement(EbayPage.getProductPrice()).getText();

        System.out.println("Product name => " + productTitle);
        System.out.println("Product price => " + productPrice);
    }
}
