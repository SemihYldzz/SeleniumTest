package Gun05;

import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        //ıd : By.Id()
        //name : By.name()
        //class : By.class()

        //linktext a tag ıne ait olanı getirir
        WebElement siparisLink= driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparisLink.getText= " + siparisLink.getText());
        //partiallinktext a tag ıne ait olanı anahtar kelimeye göre arama yapar
            WebElement partialLinkText= driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("partialLinkText.getText= " + partialLinkText.getText());


        //parametrelerini alma
        System.out.println("href  " +siparisLink.getAttribute("href"));
        System.out.println("title  "+siparisLink.getAttribute("title"));
        System.out.println("rel  "+siparisLink.getAttribute("rel"));



        MyFunc.Wait(5);
        driver.quit();
    }
}
