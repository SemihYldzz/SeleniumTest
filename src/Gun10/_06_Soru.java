package Gun10;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _06_Soru extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.google.com/");

        List<WebElement> cookiesAccept= driver.findElements(By.xpath("//button[@id='L2AGLb']"));
        if (cookiesAccept.size() > 0) //
            cookiesAccept.get(0).click();

        MyFunc.Wait(2);

        WebElement srcBox=driver.findElement(By.name("q"));
        srcBox.sendKeys("selenium" + Keys.ENTER);

//        WebElement srcBtn=driver.findElement(By.name("btnK"));
//        srcBtn.click();  // Bu 2 satır yerine yukarıda ENTER tuşu gönderildi.

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/h3)[1]")));
        WebElement link1=driver.findElement(By.xpath("(//a/h3)[1]"));
        link1.click();

        wait.until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
        Assert.assertTrue("URL doğrulanamadı", driver.getCurrentUrl().equals("https://www.selenium.dev/"));

        BekleveKapat();

    }

}
