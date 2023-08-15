package Gun04;

import Ultiyty.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_WebElementGetText {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelfirstname getText()"+ labelFirstName.getText());
        //getText() = web elementin görünen textini verir
        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labellastname getText()"+ labelLastName.getText());
        //getText() = web elementin görünen textini verir



        MyFunc.Wait(5);
        driver.quit();

    }
}
