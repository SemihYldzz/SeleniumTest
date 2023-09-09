package Gun09;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_AlertPart2 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Wait(3);

        WebElement clickMe1= driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        clickMe1.click();

        MyFunc.Wait(2);
        // alert açıldı.
        driver.switchTo().alert().dismiss();
        //alert kutusuna git ve CANCEL a bas. böylece kapanıyor.


        BekleveKapat();
    }
}
