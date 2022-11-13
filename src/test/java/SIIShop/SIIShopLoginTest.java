package SIIShop;

import Basic.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class SIIShopLoginTest extends BaseTest {
    private WebDriver driver;
    //private static final Logger log = LoggerFactory.getLogger(SIIShopLoginTest.class);

    @Test
    void loginToApplication() throws InterruptedException{

        String url = "http://146.59.32.4/index.php";
        System.out.println("URL naszej aplikacji to: "+url);
        log.info("URL naszej aplikacji to: "+url);
        String actualTitle = driver.getTitle();
        log.info("Actual title " + actualTitle);
//        String expectedTitle = "TesterSii";
//        //asercja
//        assertThat(expectedTitle).isEqualTo(actualTitle);
//        assertThat(actualTitle).startsWith("T");
//        assertThat(actualTitle).isNotBlank();


    }
    @Test
    void loginToPudelek() throws InterruptedException{

        String url = "https://www.pudelek.pl/";
        System.out.println("URL naszej aplikacji to: "+url);
        log.info("URL naszej aplikacji to: "+url);
        String actualTitle = driver.getTitle();
        log.info("Actual title " + actualTitle);
    }
}
