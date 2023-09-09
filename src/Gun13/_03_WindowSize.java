package Gun13;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _03_WindowSize extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.youtube.com/");
        MyFunc.Wait(5);

        driver.manage().window().maximize(); // ekranı max yapar
        Dimension ekranBoyutu =driver.manage().window().getSize();
        System.out.println("ekranBoyutu.width = " + ekranBoyutu.width);
        System.out.println("ekranBoyutu.height = " + ekranBoyutu.height);
        MyFunc.Wait(5);
        Dimension yeniBoyut=new Dimension(516,600); // ekrandaki pencereyi istenilen boyutlara getirir.
        driver.manage().window().setSize(yeniBoyut);



        BekleveKapat();
    }
}
