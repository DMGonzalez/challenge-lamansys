package pageObjects;

import org.openqa.selenium.By;

public class EbayPage {
    //ELEMENTS
    public static By getInputSearch() {
        return By.xpath(".//input[contains(@aria-label,'Buscar')]");
    }

    public static By getInputSubmit() {
        return By.xpath(".//input[@type='submit']");
    }

    public static By getCloseModal() {
        return By.xpath(".//button[contains(@class,'tooltip-close')]");
    }

    public static By getFirstProduct() {
        return By.xpath("(.//a[contains(@class,'s-item__link') and contains(@href,'https://www.ebay.com/itm/')])[1]");
    }

    public static By getProductTitle() {
        return By.xpath(".//h1[contains(@class,'item-title')]");
    }

    public static By getProductPrice() {
        return By.xpath(".//div[contains(@class,'price-primary')]");
    }

    //STRING
    public static String searchString() {
        return "Guitarra electrica";
    }
}
