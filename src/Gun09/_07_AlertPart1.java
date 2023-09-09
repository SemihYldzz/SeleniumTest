package Gun09;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_AlertPart1 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Wait(3);

        WebElement clickMe1= driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();

        MyFunc.Wait(2);
        // alert açıldı.
        driver.switchTo().alert().accept();
        //alert kutusuna git ve OK ye bas. böylece kapanıyor.

        BekleveKapat();
    }
}
