package Gun04;

import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FİndingByName {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        //textboxları name ile bulup adınızı ve soyadınızı doldurun
        //ve butona da ıd veya name  ile bulup tıklatınız.

        WebElement firstName=driver.findElement(By.name("q8_name[first]"));
        firstName.sendKeys("semih");
        WebElement lastName=driver.findElement(By.name("q8_name[last]"));
        lastName.sendKeys("yıldız");
        WebElement btnSubmit=driver.findElement(By.id("input_2"));
        btnSubmit.click();


        MyFunc.Wait(5);
        driver.quit();
    }
}
