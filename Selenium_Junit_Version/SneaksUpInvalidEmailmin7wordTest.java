// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SneaksUpInvalidEmailmin7wordTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void sneaksUpInvalidEmailmin7word() {
    driver.get("https://www.sneaksup.com/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.cssSelector(".customer-link > .header-icons")).click();
    driver.findElement(By.cssSelector(".btn-link:nth-child(2) > .static-text")).click();
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Selim");
    driver.findElement(By.id("LastName")).sendKeys("Yaylalı");
    driver.findElement(By.id("Phone")).sendKeys("(542)-263-3552");
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).sendKeys("had");
    driver.findElement(By.cssSelector(".register-page")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".field-validation-error > span")));
    }
    assertThat(driver.findElement(By.cssSelector(".field-validation-error > span")).getText(), is("Lütfen en az 7 karakterli bir değer giriniz."));
    {
      WebElement element = driver.findElement(By.cssSelector(".field-validation-error"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".field-validation-error > span"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".field-validation-error")).click();
  }
}