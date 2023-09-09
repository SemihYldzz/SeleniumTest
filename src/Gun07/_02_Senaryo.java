package Gun07;

import Ultiyty.BaseDriver;
import Ultiyty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Senaryo extends BaseDriver {

    @Test
    public void Test(){
        //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.

        driver.get(" https://www.saucedemo.com/");
        WebElement name=driver.findElement(By.xpath("//input[@id='user-name']"));
        name.sendKeys("standard_user");
        MyFunc.Wait(1);
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Wait(1);
        WebElement btn=driver.findElement(By.xpath("//input[@id='login-button']"));
        btn.click();
        MyFunc.Wait(2);
        WebElement urun1= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        urun1.click();
        MyFunc.Wait(2);
        WebElement urun2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        urun2.click();
        MyFunc.Wait(2);
        WebElement sepet=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        sepet.click();
        MyFunc.Wait(2);
        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        MyFunc.Wait(2);
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Semih");
        MyFunc.Wait(1);
        WebElement lastName=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("Yıldız");
        MyFunc.Wait(1);
        WebElement postaCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        postaCode.sendKeys("60600");
        MyFunc.Wait(1);
        WebElement btn1=driver.findElement(By.xpath("//input[@id='continue']"));
        btn1.click();

        // Ürünlerin ücret toplamlarının kontrolü
        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;
        for(WebElement e: ucretler)
        {
            System.out.println(e.getText());
            toplam= toplam+ Double.parseDouble( e.getText().replaceAll("[^0-9,.]","")   );
        }
        System.out.println("toplam = " + toplam);

        // item total alındı ve double a çevrildi
        WebElement itemtotalElement=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        Double itemtotal= Double.parseDouble( itemtotalElement.getText().replaceAll("[^0-9,.]","")   );
        System.out.println("itemtotal = " + itemtotal);

        Assert.assertTrue("Değerler eşit değil", toplam== itemtotal);





        BekleveKapat();
    }
}
