package com.cydeo.tests.Homework;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Haberler_Com_Cookies {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.haberler.com/");

    }
    @Test
    public void haberler_Com_Cookies(){
        WebElement cookiesButton= driver.findElement(By.xpath("//button[.='Tüm Çerezleri Kabul Et']"));
        cookiesButton.click();
    }

    @Test
    public void haberler_Com_Reklam(){
        WebElement reklamButton= driver.findElement(By.xpath("img[style='display:block']"));
        reklamButton.click();
    }

}
