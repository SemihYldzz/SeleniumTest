package Gun12;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _04_RobotFileUpload extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Wait(2);


        // acceptAll
        WebElement acceptAllFrame=driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(acceptAllFrame);

        List acceptAll=
                (List) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Accept All']")));

        //if (acceptAll.size() > 0)
         //   acceptAll.getY().click();

        //*********************/

        Robot robot = new Robot();

        for(int i=0;i<21;i++){
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // stringi hafızaya kopyalama yöntemi

        StringSelection dosyaYolu = new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\dosya.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_CONTROL); // bu iki tuş şu anda basılmış vaziyette, hafızadaki yapıştırıldı
        robot.keyPress(KeyEvent.VK_V);
        MyFunc.Wait(1);
        robot.keyRelease(KeyEvent.VK_CONTROL); // tuşlar serbest bırakıldı
        robot.keyRelease(KeyEvent.VK_V);

        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_ENTER); // dosya Entera basılarak gönderildi
        robot.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Wait(1);
        // 2 kere tab a basarak CheckBox a ulaştım
        for(int i=0;i<2;i++){
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        //space basarak çekledim
        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_SPACE); // çeklendi
        robot.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Wait(1);
        // 2 kere tab a basarak TAMAM butonun a ulaştım
        for(int i=0;i<2;i++){
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement mesaj=
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(mesaj.isDisplayed());





        BekleveKapat();
    }
}
