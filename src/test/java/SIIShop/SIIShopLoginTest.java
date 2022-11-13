package SIIShop;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SIIShopLoginTest {
    private WebDriver driver;
    @Test
    void loginToApplication(){
        String browser = "chrome";
        String url = "http://146.59.32.4/index.php";

        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        //driver.manage().window().maximize();
        driver.get(url);
        System.out.println("Tests passed");
        driver.quit();

    }
}
