package Gun06;

import Ultiyty.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class _01_CssSelectorTest extends BaseDriver {

    @Test  //main e ihtiyaç yok
    public void Test1()
     {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        String msg = "mesaj gönderildi";
        WebElement txtbox=driver.findElement(By.cssSelector("input[id='user-message']   "));
        txtbox.sendKeys(msg);

        WebElement btnSubmit=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btnSubmit.click();

        WebElement ileti= driver.findElement(By.cssSelector("[id='display']"));

       Assert.assertTrue(ileti.getText().contains(msg));






        BekleveKapat();
    }
}
