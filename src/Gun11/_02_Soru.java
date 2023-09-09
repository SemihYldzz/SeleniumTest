package Gun11;

import Ultiyty.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends BaseDriver {
    /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame(0);
        WebElement birinciIframe=driver.findElement(By.cssSelector("#topic+input"));
        birinciIframe.sendKeys("Turkiye");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement ikinciIframe= driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(ikinciIframe);
        nesneSelect.selectByVisibleText("Avatar");
        BekleveKapat();
    }
}
