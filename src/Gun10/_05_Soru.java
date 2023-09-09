package Gun10;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _05_Soru extends BaseDriver {


    @Test
    public void Test1(){
        driver.get("https://www.demoblaze.com/index.html");
        MyFunc.Wait(2);

        WebElement link=driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepeteEkle=driver.findElement(By.linkText("Add to cart"));
        sepeteEkle.click();

        wait.until(ExpectedConditions.alertIsPresent()); // alert gözükene kadar bekle
        driver.switchTo().alert().accept();

        WebElement anaSayfa=driver.findElement(By.id("nava"));
        anaSayfa.click();

        BekleveKapat();
    }
}
