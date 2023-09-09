package Gun09;

import Ultiyty.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://demoqa.com/auto-complete");

        WebElement textBox= driver.findElement(By.id("autoCompleteMultipleContainer"));
        new Actions(driver)
                .moveToElement(textBox)
                .click().
                keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("hmet")
                .build()
                .perform();

        BekleveKapat();
    }
}
