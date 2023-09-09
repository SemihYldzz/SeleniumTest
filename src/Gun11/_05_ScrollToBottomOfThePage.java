package Gun11;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _05_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Wait(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);"); // sayfanının sonuna gider.
        MyFunc.Wait(2);
        js.executeScript("window.scrollTo(0, 0);"); // sayfanın en üstüne git.

        BekleveKapat();
    }
}
