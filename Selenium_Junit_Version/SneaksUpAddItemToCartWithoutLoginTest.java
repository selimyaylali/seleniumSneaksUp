package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class SneaksUpAddItemToCartWithoutLoginTest {
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
  public void sneaksUpAddItemToCartWithoutLogin() {
    driver.get("https://www.sneaksup.com/");
    driver.findElement(By.cssSelector(".active:nth-child(7) .position-relative")).click();
    driver.findElement(By.cssSelector(".size-list:nth-child(9) > .list-inline-item:nth-child(4) > .size-list-label")).click();
    driver.findElement(By.id("add-to-cart-button-33231")).click();
    driver.findElement(By.cssSelector("#modal-btn-cart > .static-text")).click();
    driver.findElement(By.cssSelector(".order-total-table > #checkout")).click();
    driver.findElement(By.id("mail_t2")).sendKeys("yarkinatac2@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("2235258q");
    driver.findElement(By.cssSelector("#submit_t2 > .static-text")).click();
    driver.findElement(By.cssSelector(".order-total-table > #checkout")).click();
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Yarkın");
    driver.findElement(By.id("LastName")).sendKeys("Ataç");
    driver.findElement(By.id("Email")).sendKeys("yarkinatac2@gmail.com");
    driver.findElement(By.id("PhoneNumber")).click();
    driver.findElement(By.id("PhoneNumber")).sendKeys("(539)-551-1185");
    driver.findElement(By.id("StateProvinceId")).click();
    {
      WebElement dropdown = driver.findElement(By.id("StateProvinceId"));
      dropdown.findElement(By.xpath("//option[. = 'İZMİR']")).click();
    }
    driver.findElement(By.id("CountyId")).click();
    {
      WebElement dropdown = driver.findElement(By.id("CountyId"));
      dropdown.findElement(By.xpath("//option[. = 'BORNOVA']")).click();
    }
    driver.findElement(By.id("Address")).click();
    driver.findElement(By.id("Address")).sendKeys("werfahsfaslfmasfa");
    driver.findElement(By.id("ZipPostalCode")).click();
    driver.findElement(By.id("ZipPostalCode")).sendKeys("35000");
  }
}
