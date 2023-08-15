package Gun05;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class _02_FindingElement_tag extends BaseDriver {
    public static void main(String[] args) {
        //DriverBaslat();
        driver.get("https://www.hepsiburada.com/");

        List<WebElement>linkler=driver.findElements(By.tagName("a"));
        //bütün a tag li elementleri bul

        for (WebElement w:linkler
             ) {
            System.out.println("w.getText=  "+ w.getText());
        }

        BekleveKapat();
    }
}
