package Gun04;

import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class _06_FindingByClassName
{
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        //WebElement firstName=driver.findElement(By.className("form-textbox")); //class name ile bulma
        //firstName.sendKeys("semih");

        List<WebElement> labels=driver.findElements(By.className("sf-dod-mpQGL"));
        for (WebElement web:labels
             ) {
            System.out.println("web.getText"+web.getText());
        }

        //findElement elemanı bulamazsa hata veriri : no such element
        //findElement elemanı bulamazsae ne olur?

        List<WebElement> labels2=driver.findElements(By.className("sf-dod-"));

            System.out.println("web.getText  "+labels2.size());





        MyFunc.Wait(5);
        driver.quit();
    }
}
