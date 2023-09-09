package Gun08;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionHoverTest extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Wait(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(element).build(); // element in üzerine gel
        aksiyon.perform(); // etkinleştir.

        MyFunc.Wait(2);
        BekleveKapat();
    }
}
