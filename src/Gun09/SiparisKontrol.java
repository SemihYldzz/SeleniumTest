package Gun09;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SiparisKontrol extends BaseDriver {
        @Test
        public void Test(){
    
            driver.get("https://techno.study/tr");
    
            WebElement detayliBilgi=driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5159634201661161478639']//a[@class='tn-atom']"));
            detayliBilgi.click();
    
            MyFunc.Wait(1);
            WebElement detayBilgi= driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160263341622986986995']//a[@class='tn-atom']"));
            detayBilgi.click();
    
            MyFunc.Wait(1);
            WebElement yazi= driver.findElement(By.xpath("//div[@class='t-section__container t-container']//div[@style='font-size: 46px;']"));
    
            if (yazi.getText().contains("Yazılım Test Uzmanı")){
                System.out.println("Test Passed");
            }else {
                System.out.println("Test Failled");
            }
    
            MyFunc.Wait(1);
            WebElement logoVarMi=driver.findElement(By.xpath("//img[@class='t228__imglogo ']"));
            Assert.assertTrue("logo gözüktü = ", logoVarMi.isDisplayed());
    
             BekleveKapat();
    
         }
        @Test
        public void Test1(){
    
            driver.get("https://techno.study/tr");
    
            WebElement detayliBilgi=driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5159634201663336291315']//a[@class='tn-atom']"));
            detayliBilgi.click();
    
            MyFunc.Wait(1);
            WebElement detayBilgi= driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459551622986986995']//a[@class='tn-atom']"));
            detayBilgi.click();
    
            MyFunc.Wait(1);
            WebElement yazi= driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459591527519905659']//div[@class='tn-atom']"));
    
            if (yazi.getText().contains("Android uygulama geliştirme")){
                System.out.println("Test Passed");
            }else {
                System.out.println("Test Failled");
            }
    
            MyFunc.Wait(1);
            WebElement logoVarMi=driver.findElement(By.xpath("//img[@class='t228__imglogo ']"));
            Assert.assertTrue("logo gözüktü = ", logoVarMi.isDisplayed());
    
            BekleveKapat();
    
    
    
        }
        @Test
        public void Test2(){
    
            driver.get("https://techno.study/tr");
    
            WebElement detayliBilgi=driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5159634201490289915734']//a[@class='tn-atom']"));
            detayliBilgi.click();
    
            MyFunc.Wait(1);
            WebElement detayBilgi= driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459551622986986995']//a[@class='tn-atom']"));
            detayBilgi.click();
    
            MyFunc.Wait(1);
            WebElement yazi= driver.findElement(By.xpath("//div[@class='t396__elem tn-elem tn-elem__5160459591527519905659']//div[@class='tn-atom']"));
    
            if (yazi.getText().contains("Veri Analisti")){
                System.out.println("Test Passed");
            }
            else {
                System.out.println("Test Failled");
            }
    
            MyFunc.Wait(1);
            WebElement logoVarMi=driver.findElement(By.xpath("//img[@class='t228__imglogo ']"));
            Assert.assertTrue("logo gözüktü = ", logoVarMi.isDisplayed());
    
            BekleveKapat();
        }

    }











