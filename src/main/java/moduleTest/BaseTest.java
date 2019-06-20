package moduleTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import context.Context;
import sun.font.TrueTypeFont;
import testCase.CheckWorkSerachingField;
import testCase.SearchingTest;
import testCase.CheckButton;
import testCase.CheckSearchField;
import utils.ParsingPage;

//SearchFild - что не ридонли, вводить поочереди из массива(числа, буквы, символы)
// Конпка поиска - доступность, кликабельность

public class BaseTest {


    @BeforeTest
    public void init(){
        Context.runBrowser("http://www.google.com");
    }


   @Test
   public void CheckVisibleBtn(){
       CheckButton.execute();
   }
   @Test
   public void CheckVisibleSearchField() {
        CheckSearchField.execute();
   }
   @Test
   public void CheckEnterValue() {
        CheckWorkSerachingField.execute();
    }
   @Test
   public void SearchingTest(){
       SearchingTest.execute();
   }

   /*
      @Test
      public void checkSearchField_Positive() {
          driver.findElement(By.name("q")).sendKeys("TestSendKeys");
          element = driver.findElement(By.name("q"));
          String text = element.getAttribute("value");
          Assert.assertEquals(text, "TestSendKeys");
      }

      @Test
      public void checkSearchField_Negative() {
          driver.findElement(By.name("q")).sendKeys("TestSendKeys");
          element = driver.findElement(By.name("q"));
          String text = element.getAttribute("value");
          Assert.assertEquals(text, "TestS5sdendKeys");
      }

      @Test
      public void checkButton() {
          WebElement buttonWebElement = driver.findElement(By.name("btnK"));
          String actRes = buttonWebElement.getAttribute("value");
          // System.out.println(actRes);
          Assert.assertEquals(actRes,"Поиск в Google");

      }

      @Test
      public void checkFind() {
          driver.findElement(By.name("q")).sendKeys("Test");
          driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
          if (driver.getPageSource().contains("Результатов: примерно ")){
              System.out.println("Тест выполнен успешно");
          }

      }
      */
    @AfterTest
    public void close(){
        Context.close();
    }
}
