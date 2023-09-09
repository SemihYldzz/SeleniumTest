package Gun13;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class _02_EkranKaydet extends BaseDriver {
    @Test
    public void Test() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Wait(2);
        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("123");

        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMsj = driver.findElements(By.xpath("//*[text()='Invalid credentials']"));

        if (errorMsj.size()>0){//hata olmuştur
            System.out.println("hata oldu");

            //ekran kaydı alıcaz
           // Actions driverAksiyon=new Actions(driver);

            TakesScreenshot hs=(TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
            File hafiza=hs.getScreenshotAs(OutputType.FILE);//2.Aşama ekran görüntüsü alındı, hafızada
            // Ekran görütüsünü dosya formatında hafızaya al: "get screenshot as  file"

            //3.Aşama hafızadaki ekran görütüsününü fiziksel dosyaya kaydetmem gerekiyor.
            //hafızadaki ekran kaydını, yolunu(path) ini ve ismini verdiğim şu dosyaya kaydet
            FileUtils.copyFile(hafiza, new File("ekranGoruntuleri\\screenshot.png"));

        }



        BekleveKapat();
    }
}
