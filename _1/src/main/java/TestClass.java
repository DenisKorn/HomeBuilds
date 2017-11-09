//import jdk.nashorn.internal.parser.JSONParser;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.concurrent.TimeUnit;


import static org.junit.Assert.fail;

public class TestClass {
   private String baseUrl;
   private WebDriver driver;
   private boolean acceptNextAlert = true;
   private StringBuffer verificationErrors = new StringBuffer();

   String inputPath = System.getProperty("user.dir"); //set relative path to icon

   @Before
 //  public void setUp() throws Exception {
   public void setUp() {

      FirefoxProfile prof = new FirefoxProfile();
      prof.setPreference("browser.startup.homepage_override.mstone", "ignore");
      prof.setPreference("startup.homepage_welcome_url.additional", "about:blank");
      driver = new FirefoxDriver(prof);
      baseUrl = "https://vk.com/a_dust";
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  //Время Timeout на выполнение операции
   }

  @Test
   public void Start() throws Exception {

      String nececcaryUrl = baseUrl;
      driver.get(nececcaryUrl); //открыли базовый урл
      String data1 = driver.findElement(By.xpath("//div[contains(@class,'labeled')]")).getText();

   }

   @After
   public void tearDown() throws Exception {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
         fail(verificationErrorString);
      }
   }
}
