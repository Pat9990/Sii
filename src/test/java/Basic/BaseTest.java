package Basic;

import Factory.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;

@Slf4j
public class BaseTest {
    protected WebDriver driver;
    protected static DriverFactory driverFactory;
    @BeforeAll
    static void setConfiguration(){

       driverFactory = new DriverFactory();

    }
    @BeforeEach
    void setUpDriver(){
        driver=driverFactory.getDriver("chrome");
        log.info("WebDriver started successfully");

        //WAIT strategy
        //1. implicit -> czeka w zależnosci od różnych opóźnień środowisk

        //2. explicit ->
        //3. fluent ->
    }
    @AfterEach
    void exit(){
        driver.quit();
        log.info("Driver has been closed properly");
    }
    @AfterAll
    static void closeConnection(){
        log.info("database closed");
    }

}
