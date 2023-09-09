package Gun12;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;

import javax.sql.RowSet;
import javax.sql.rowset.BaseRowSet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _03_RobotGiris extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("https://www.google.com/");
        MyFunc.Wait(2);

        Robot robot=new Robot();
        // java ROBOT class
        robot.keyPress(KeyEvent.VK_CONTROL);    //ctrl bas ,
        robot.keyPress(KeyEvent.VK_T); // bu basılıyken T a bas
        robot.keyRelease(KeyEvent.VK_T); // T yi bırak ,
        robot.keyRelease(KeyEvent.VK_CONTROL);// CTRL yi bırak
        // yeni pencere açıldı mı

        MyFunc.Wait(2);
        // selenium windows handle switchTo
        // yeni açılan sekmeye geç.

        Set<String> windonsIdler=driver.getWindowHandles();
        Iterator gosterge =windonsIdler.iterator();
        String firstSekne =gosterge.next().toString();
        String secondSekne =gosterge.next().toString();

        System.out.printf("firstSekme "+firstSekne);
        System.out.printf("ikinciSekme "+secondSekne);

        MyFunc.Wait(2);
        driver.switchTo().window(secondSekne);
        driver.get("https://www.facebook.com/");





    }
}
