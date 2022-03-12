package testeinicial;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {

    @Test
    public void testeFireFox() {
        System.setProperty("webdriver.gecko.driver", "D:\\Users\\ivanf\\drivers-selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        Assert.assertEquals("Google", driver.getTitle());

        driver.quit();
    }

    @Test
    public void testeChrome() {
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\ivanf\\drivers-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        Assert.assertEquals("Google", driver.getTitle());

        driver.quit();
    }
}
