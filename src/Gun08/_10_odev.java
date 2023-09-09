package Gun08;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _10_odev extends BaseDriver {

    @Test
    public void Test(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html   ");
        Actions driverAksiyon = new Actions(driver);

        MyFunc.Wait(2);
        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));


        driverAksiyon.dragAndDrop(oslo, norway).build().perform();






        BekleveKapat();
    }
}
