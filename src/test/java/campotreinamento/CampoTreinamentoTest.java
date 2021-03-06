package campotreinamento;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CampoTreinamentoTest {

    @Test
    public void testeTextField() {
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\ivanf\\drivers-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 765));

        driver.get("file:\\" + System.getProperty("user.dir") + "\\src\\main\\resources\\componentes.html");
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Teste de escrita");
        Assert.assertEquals("Teste de escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));

        driver.quit();
    }

    @Test
    public void deveInteragirComTextArea() {
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\ivanf\\drivers-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 765));

        driver.get("file:\\" + System.getProperty("user.dir") + "\\src\\main\\resources\\componentes.html");
        driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("teste");
        Assert.assertEquals("teste", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));

        driver.quit();
    }

    @Test
    public void deveInteragirComRadioButton() {
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\ivanf\\drivers-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 765));

        driver.get("file:\\" + System.getProperty("user.dir") + "\\src\\main\\resources\\componentes.html");
        driver.findElement(By.id("elementosForm:sexo:0")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());

        driver.quit();
    }

    @Test
    public void deveInteragirComCheckBox() {
        System.setProperty("webdriver.chrome.driver", "D:\\Users\\ivanf\\drivers-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 765));

        driver.get("file:\\" + System.getProperty("user.dir") + "\\src\\main\\resources\\componentes.html");
        driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
        Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());

        driver.quit();
    }
}
