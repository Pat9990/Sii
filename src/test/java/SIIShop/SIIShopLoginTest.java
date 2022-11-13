package SIIShop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;

public class SIIShopLoginTest {
    private WebDriver driver;
    @Test
    void loginToApplication(){
        String browser = "chrome";
        String url = "http://146.59.32.4/index.php";

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
        driver = new ChromeDriver(chromeOptions);
        //driver.manage().window().maximize();
        driver.get(url);
        //WAIT strategy
        //1. implicit -> czeka w zależnosci od różnych opóźnień środowisk
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));//czekanie na załadowanie webelementów

        //2. explicit ->
        //3. fluent ->
        System.out.println("Test passed");
        driver.quit();

    }
}
