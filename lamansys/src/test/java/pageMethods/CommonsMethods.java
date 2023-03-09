package pageMethods;

import configuration.Iproperties;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class CommonsMethods {
    public static WebDriver driver;
    public static Iproperties props = ConfigFactory.create(Iproperties.class);

    public static void goToPage(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        switch (url) {
            case "Gmail":
                driver.get(props.urlGmail());
                break;
            case "Ebay":
                driver.get(props.urlEbay());
                break;
            default:
                Assert.fail("Specified page doesn't correspond to an available URL");
        }
    }

    @AfterStep
    public static void takeScreenshots() throws InterruptedException {
        if (RequestMethods.testType != "api_test") {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
        }
    }

    @After
    public static void cierraApp(Scenario scenario) {
        System.out.println("Finishing test");
        if (driver != null) {
            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
            }
            driver.quit();
        }
    }


    public static void elementClick(By element) {
        WebDriverWait wait = new WebDriverWait(CommonsMethods.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        CommonsMethods.driver.findElement(element).click();
    }

    public static void elementSendText(By element, String text) {
        WebDriverWait wait = new WebDriverWait(CommonsMethods.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        CommonsMethods.driver.findElement(element).sendKeys(text);
    }

    public static void elementWaitDisplayed(By element, int tiempoEspera) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(tiempoEspera));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void viewTextElementDisplayed(By element) {
        String txtElement = driver.findElement(element)
                .getText();
        System.out.println("ELEMENT '" + txtElement + "' IS DISPLAYED");
    }

    public static void switchCurrentWindow() {
        for (String winHandle : CommonsMethods.driver.getWindowHandles()) {
            CommonsMethods.driver.switchTo().window(winHandle);
        }
    }
}