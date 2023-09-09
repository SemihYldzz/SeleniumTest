package Gun10;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.sql.rowset.BaseRowSet;
import java.time.Duration;

public class _02_WaitsGiris extends BaseDriver {

    @Test
    public void Test(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Verilen Süre kadar locator daki elemetin bulmaya çalışır bulunca çıkar

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        //WebElement msj=driver.findElement(By.id("demo"));
        //Thread.sleep(20000); // 20sn  gereksiz fazla bekleme yapıyor

        WebElement msj=driver.findElement(By.xpath("//p[text()='WebDriver']"));
        System.out.println("msj.getText() = " + msj.getText());

        MyFunc.Wait(2);
        BekleveKapat();



    }
}
