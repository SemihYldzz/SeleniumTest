package Gun06;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class EvÖdevi extends BaseDriver {
    @Test
    public void Test1() {
       driver.get("https://testpages.herokuapp.com/styled/index.html    ");

       WebElement bnt1= driver.findElement(By.cssSelector("[id='fakealerttest'] "));
       bnt1.click();
        MyFunc.Wait(2);

        WebElement btn2= driver.findElement(By.cssSelector("input[id='modaldialog']"));
        btn2.click();

        MyFunc.Wait(2);
        WebElement btn3= driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        btn3.click();
        MyFunc.Wait(2);


        BekleveKapat();
    }
}
