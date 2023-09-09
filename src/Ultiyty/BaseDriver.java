package Ultiyty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    static{ //sadece en başta çalışan kodlar için bu sistem kullanılabilir.
        driver=new ChromeDriver();
        driver.manage().window().maximize(); //ekranı max yapar
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//20 saniye açılması süresi veriri
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void BekleveKapat(){

        MyFunc.Wait(5);
        driver.quit();
    }

}
