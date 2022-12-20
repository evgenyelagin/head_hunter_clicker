import abstractAndOtherClass.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfProperties;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static utils.ConfProperties.*;

public class ClickerToVacancy extends BaseTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(getProperty("URL"));
        WebElement enterButtonMainPage = driver.findElement(By.linkText("Войти"));
        enterButtonMainPage.click();
        WebElement enterToSiteUnderPassword = driver.findElement(By.xpath("//button[contains(@data-qa, \"expand-login-by-password\")]"));
        enterToSiteUnderPassword.click();
        WebElement enterEmail = driver.findElement(By.xpath("//input[contains(@data-qa, \"login-input-username\")]"));
        enterEmail.sendKeys(getProperty("email"));
        WebElement enterPassword = driver.findElement(By.xpath("//input[contains(@data-qa, \"login-input-password\")]"));
        enterPassword.sendKeys(getProperty("password"));
        WebElement enterToSiteByLoginAndPassword = driver.findElement(By.xpath("//button[contains(@data-qa, \"account-login-submit\")]"));
        enterToSiteByLoginAndPassword.click();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement myResumeLink = driver.findElement(By.xpath("//a[contains(@data-qa, \"mainmenu_myResumes\")]"));
        myResumeLink.click();
        WebElement needVacancy = driver.findElement(By.xpath("//a[contains(@class, \"bloko-button bloko-button_kind-secondary bloko-button_scale-small bloko-button_stretched bloko-button_appearance-outlined\")]"));
        needVacancy.click();
//        List<WebElement> otkliknutsya = driver.findElements(By.xpath("//a[contains(@data-qa, \"vacancy-serp__vacancy_response\")]"));
//        for (WebElement element : otkliknutsya) {
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//            element.click();
//        }
        //   driver.quit();
    }
}


