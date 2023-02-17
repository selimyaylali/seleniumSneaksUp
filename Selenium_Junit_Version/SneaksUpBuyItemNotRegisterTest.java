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
public class SneaksUpBuyItemNotRegisterTest {
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
  public void sneaksUpBuyItemNotRegister() {
    driver.get("https://www.sneaksup.com/");
    driver.manage().window().setSize(new Dimension(945, 1020));
    driver.findElement(By.cssSelector(".active:nth-child(7) .position-relative")).click();
    driver.findElement(By.cssSelector(".size-list:nth-child(9) > .list-inline-item:nth-child(4) > .size-list-label")).click();
    js.executeScript("window.scrollTo(0,1020)");
    driver.findElement(By.id("add-to-cart-button-33231")).click();
    driver.findElement(By.id("modal-btn-cart")).click();
    driver.findElement(By.cssSelector(".order-total-table > #checkout")).click();
    driver.findElement(By.cssSelector(".btn-block > .static-text")).click();
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys("asfdsadf");
    driver.findElement(By.id("LastName")).click();
    driver.findElement(By.id("LastName")).sendKeys("asdfas");
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).sendKeys("asfasf@gmail.com");
    driver.findElement(By.id("PhoneNumber")).click();
    driver.findElement(By.id("PhoneNumber")).sendKeys("(546)-449-8454");
    driver.findElement(By.id("StateProvinceId")).click();
    {
      WebElement dropdown = driver.findElement(By.id("StateProvinceId"));
      dropdown.findElement(By.xpath("//option[. = 'BATMAN']")).click();
    }
    driver.findElement(By.id("CountyId")).click();
    driver.findElement(By.id("CountryId")).click();
    driver.findElement(By.id("CountyId")).click();
    {
      WebElement dropdown = driver.findElement(By.id("CountyId"));
      dropdown.findElement(By.xpath("//option[. = 'KOZLUK']")).click();
    }
    driver.findElement(By.id("Address")).click();
    driver.findElement(By.id("Address")).sendKeys("asdasda");
    driver.findElement(By.id("ZipPostalCode")).click();
    driver.findElement(By.id("ZipPostalCode")).sendKeys("2323");
  }
}
