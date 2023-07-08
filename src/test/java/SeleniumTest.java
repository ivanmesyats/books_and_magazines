
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {

    static WebDriver safariDriver;
    public String loginResult;
    @BeforeAll
    public static void init () {

        safariDriver = new SafariDriver();

    }

    @BeforeEach

    public void openPage () {

        safariDriver.get("https://the-internet.herokuapp.com/login");

    }

    public void userName (String userName){
        safariDriver.findElement(By.id("username")).clear();
        safariDriver.findElement(By.id("username")).sendKeys(userName);

    }

    public void passwrod (String password){
        safariDriver.findElement(By.id("password")).clear();
        safariDriver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLogin (){
        safariDriver.findElement(By.className("radius")).click();
    }
    @Test
    public void loginPagePositive () throws InterruptedException {

        userName("tomsmith");
        passwrod("SuperSecretPassword!");
        clickLogin();

        Thread.sleep(5000);

        loginResult = String.valueOf(safariDriver.findElement(By.id("flash")).getText());
        Assertions.assertTrue(loginResult.contains("You logged into a secure area!"));


    }

    @Test
    public void loginPageNegativ () throws InterruptedException {

        userName("tomsmith");
        passwrod("SuperSecretPassword!1");
        clickLogin();


        Thread.sleep(5000);

        loginResult = String.valueOf(safariDriver.findElement(By.xpath("//*[@id=\"flash\"]/text()")).getText());
        Assertions.assertTrue(loginResult.contains("Your username is invalid!") || loginResult.contains("Your password is invalid!"));

    }

    @AfterAll

    public static void clean () {
        safariDriver.quit();
    }
}
