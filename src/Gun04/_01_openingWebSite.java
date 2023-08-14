package Gun04;

import Ultiyty.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_openingWebSite {
    public static void main(String[] args) {

        //opp webdriver: interface,parent class
        WebDriver driver=new ChromeDriver();
        //WebDriver driver2=new FirefoxDriver();
        //WebDriver driver3=new EdgeDriver();

        driver.get("https://www.google.com/"); //web site açma

        //driver.close(); // o anda açık olanı kapatır

        MyFunc.Wait(3);
        driver.quit(); // program çalışırken oluşturulmuş olanları hepsini kapatır ve hafızadan siler

    }
}
