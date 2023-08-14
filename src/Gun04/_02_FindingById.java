package Gun04;

import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        //        1-  1.texbox ı bul (id=first_8) , ona bir isim ver mesala isimKutusu
        //        2-  isimKutusuna "ismet" yazısını gönder
        //
        //        3-  2.texbox ı bul , ona bir isim ver mesala soyadKutusu
        //        4-  soyadKutusu "temur" yazısını gönder
        // Chrome ctrl+f ye basıldığında inspect bölümünde
        // (inpect bölümü aktifken) arama kutusunu açar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement isimKutusu=driver.findElement(By.id("first_8")); //ıd bulma elemanı
        isimKutusu.sendKeys("Semih"); // kutucuklara yaz gönderme

        WebElement soyad=driver.findElement(By.id("last_8"));
        soyad.sendKeys("Yıldız");


        MyFunc.Wait(5);
        driver.quit(); // program çalışırken oluşturulmuş olanları hepsini kapatır ve hafızadan siler



    }
}
