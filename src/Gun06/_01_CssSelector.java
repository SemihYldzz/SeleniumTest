package Gun06;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {
    public static void main(String[] args) {

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        String msg = "mesaj gönderildi";
        WebElement txtbox=driver.findElement(By.cssSelector("input[id='user-message']   "));
        txtbox.sendKeys(msg);

        WebElement btnSubmit=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btnSubmit.click();

        WebElement msgg= driver.findElement(By.cssSelector("[id='display']"));

        if (msgg.getText().contains(msg))
            System.out.println("test Passed");
        else
            System.out.println("test failled");






        BekleveKapat();


    }
}
