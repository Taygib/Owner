package qa.guru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import qa.guru.owner.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        //подготовка Driver
        driver = new WebDriverProvider().get();
    }

    @Test
    public void testGithub() {
        // тело выполнения теста
        String title = driver.getTitle();
        assertEquals("GitHub: Let’s build from here · GitHub", title);

    }



    @AfterEach
    public void stopDriver() {
        driver.quit();
    }

    //   //конфигурация
    //   private WebDriver getDriver() {
    //       WebDriverManager.chromedriver().setup(); // можно сменить на .firefoxdriver().setup(); и  FirefoxDriver();
    //       WebDriver driver = new ChromeDriver();
    //       driver.get("http://github.com");
    //       return driver;
    //   }


}
