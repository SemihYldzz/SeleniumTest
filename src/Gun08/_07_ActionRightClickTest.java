package Gun08;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnRightClick=driver.findElement(By.id("rightClickBtn"));
        MyFunc.Wait(2);

        Actions aksiyonlar=new Actions(driver);

        Action askiyon=aksiyonlar.contextClick(btnRightClick).build();
        askiyon.perform();



        BekleveKapat();
    }
}
