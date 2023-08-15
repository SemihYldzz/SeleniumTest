package Gun05;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Navigating extends BaseDriver {
    public static void main(String[] args) {


        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement element= driver.findElement(By.id("alerttest"));
        element.click(); // yeni sayfaya gitti
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());// o anda bulunudğu url bilgisini verir

        driver.navigate().back();
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        MyFunc.Wait(3);
        System.out.println(driver.getCurrentUrl());




        BekleveKapat();
    }
}
