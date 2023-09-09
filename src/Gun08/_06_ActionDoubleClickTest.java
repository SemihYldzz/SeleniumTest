package Gun08;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;

public class _06_ActionDoubleClickTest extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");

        WebElement btnDoubleClick=driver.findElement(By.id("doubleClickbtn"));
        MyFunc.Wait(2);

        Actions aksiyonlar=new Actions(driver);

        Action askiyon=aksiyonlar.moveToElement(btnDoubleClick).doubleClick().build();
        askiyon.perform();



        BekleveKapat();
    }

}
