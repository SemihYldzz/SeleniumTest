package Gun04;

import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        try {
            WebElement isimkutusu=driver.findElement(By.id("hatalilocator"));
            //NoSuchElementException: bu hatayı verir.
        }
        catch (Exception ex){
            System.out.println("web element bulunamadı "+ ex.getMessage());
        }









        MyFunc.Wait(5);
        driver.quit();


    }
}
