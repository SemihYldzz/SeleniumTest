package Gun11;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru extends BaseDriver {
    /*
   1-driver.get("https://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 2.elemanını seçiniz.
 */
    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");
        MyFunc.Wait(2);
        driver.switchTo().frame(0);
        WebElement birinciIframe=driver.findElement(By.cssSelector("#topic+input"));
        birinciIframe.sendKeys("Turkiye");
        // Şu anda 1.frame in içideyim , onun içinde ki frame gidicem
        // 1 tane olduğu için index 0
        driver.switchTo().frame(0);
        WebElement chechkBox= driver.findElement(By.id("a"));
        chechkBox.click();

        driver.switchTo().defaultContent();// direk ana safyaya döndürür.
        driver.switchTo().frame(1);
        WebElement ikinciIframe= driver.findElement(By.id("animals"));
        Select nesneSelect=new Select(ikinciIframe);
        nesneSelect.selectByIndex(1);
        BekleveKapat();

    }
}
