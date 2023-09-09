package Gun10;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Soru extends BaseDriver {
    /*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        (xpath kullanmayınız)
 */
    @Test
    public void Test(){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name=driver.findElement(By.id("title"));
        name.sendKeys("Semih");
        WebElement comment=driver.findElement(By.id("description"));
        comment.sendKeys("EskişehirSpor");
        MyFunc.Wait(2);
        WebElement btn=driver.findElement(By.id("btn-submit"));
        btn.click();

        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));
        WebElement mesaj=driver.findElement(By.id("submit-control"));
        Assert.assertTrue("Aranılan Mesaj bulunamadı", mesaj.getText().equals("Form submited Successfully!"));


    }

}
