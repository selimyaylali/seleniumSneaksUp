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
public class SneaksUpSuccessfullyBuyItemTest {
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
  public void sneaksUpSuccessfullyBuyItem() {
    driver.get("https://www.sneaksup.com/?logout=1");
    driver.manage().window().setSize(new Dimension(1280, 1392));
    driver.findElement(By.cssSelector(".justify-content-lg-center")).click();
    driver.findElement(By.cssSelector(".customer-link > .header-icons")).click();
    driver.findElement(By.id("mail_t2")).click();
    driver.findElement(By.id("mail_t2")).sendKeys("yarkinatac2@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("2235258q");
    driver.findElement(By.id("submit_t2")).click();
    driver.findElement(By.cssSelector(".active:nth-child(7) .position-relative")).click();
    driver.findElement(By.cssSelector(".size-list:nth-child(9) > .list-inline-item:nth-child(4) > .size-list-label")).click();
    driver.findElement(By.id("add-to-cart-button-33231")).click();
    driver.findElement(By.id("modal-btn-cart")).click();
    driver.findElement(By.cssSelector(".order-total-table > #checkout")).click();
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Yarkın");
    driver.findElement(By.id("LastName")).sendKeys("Ataç");
    driver.findElement(By.id("Email")).sendKeys("yarkinatac2@gmail.com");
    driver.findElement(By.id("PhoneNumber")).sendKeys("(542)-263-3552");
    driver.findElement(By.id("StateProvinceId")).click();
    {
      WebElement dropdown = driver.findElement(By.id("StateProvinceId"));
      dropdown.findElement(By.xpath("//option[. = 'İZMİR']")).click();
    }
    driver.findElement(By.cssSelector(".row:nth-child(1) > .col-12:nth-child(6)")).click();
    driver.findElement(By.id("CountyId")).click();
    {
      WebElement dropdown = driver.findElement(By.id("CountyId"));
      dropdown.findElement(By.xpath("//option[. = 'BORNOVA']")).click();
    }
    driver.findElement(By.id("Address")).click();
    driver.findElement(By.id("Address")).sendKeys("dsahdljshadkjhsakjdhakshdj");
    driver.findElement(By.id("ZipPostalCode")).click();
    driver.findElement(By.id("ZipPostalCode")).sendKeys("35000");
    driver.findElement(By.id("Title")).click();
    driver.findElement(By.id("Title")).sendKeys("Ev");
    driver.findElement(By.cssSelector(".border-none > .modal-body")).click();
  }
}