package Gun05;

import Ultiyty.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_GetClassValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement element=driver.findElement(By.id("inputValEnter"));

        //elemanın attributlarına ulaşmak için getAttribut u kullanıcaz
        System.out.println("inputValEnter.getAttr = " + element.getAttribute("class"));

        //classın karşığı  olan css şekilendirme değerlerini almak için getCssValue kullanıcaz
        System.out.println("element.getCssValu = " +element.getCssValue("color"));
        System.out.println("element.getCssValu = " +element.getCssValue("font-size"));
        System.out.println("element.getCssValu = " +element.getCssValue("background"));


        BekleveKapat();

    }
}
