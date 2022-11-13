package Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.Arrays;
@Slf4j
public class DriverFactory {
    private WebDriver driver;

    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                log.info("browser "+browser);
                WebDriverManager.chromedriver().setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--ignore-certificate-errors");
                chromeOptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
                driver = new ChromeDriver(chromeOptions);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//czekanie na załadowanie webelementów
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
                break;
            case "firefox":
                log.info("browser "+browser);
                WebDriverManager.firefoxdriver().setup();

                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("start-maximized");
                firefoxOptions.addArguments("--ignore-certificate-errors");
                //firefoxOptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
                driver = new FirefoxDriver(firefoxOptions);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//czekanie na załadowanie webelementów
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
                break;
            default:
                log.info("browser "+browser);
                WebDriverManager.chromedriver().setup();

                ChromeOptions chromeOptions2 = new ChromeOptions();
                chromeOptions2.addArguments("start-maximized");
                chromeOptions2.addArguments("--ignore-certificate-errors");
                chromeOptions2.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));
                driver = new ChromeDriver(chromeOptions2);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));//czekanie na załadowanie webelementów
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

        }
        return this.driver;
    }
}
