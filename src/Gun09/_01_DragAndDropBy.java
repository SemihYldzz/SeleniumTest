package Gun09;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_DragAndDropBy extends BaseDriver {

    @Test
    public void Test(){
        // dragAndDropBy: WebElementi dikey veya yatay yönde kaydırma işlemi yapar.
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        Actions aksiyonDriver=new Actions(driver);
        WebElement solSurgu=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.Wait(2);
        //dragAndDropBy(WebElement,X , Y) x: yatay yönde, y: dikey yönde
        Action aksiyon=aksiyonDriver.dragAndDropBy(solSurgu, 100, 0).build();// yatay yönde 100 birim ilerledi
        aksiyon.perform();                                     // 0 : dikey yönde hareket etme imkanı zaten yok
        // + değer girdiğimizde sağa dogru, - değer girdiğimizde sola dogru kaydırıyor
        //aksiyonDriver.dragAndDropBy(solSurgu, 100, 0).build().perform();

        BekleveKapat();
    }

    @Test
    public void Test1(){

    }
    @Test
    public void Test2(){

    }

}
