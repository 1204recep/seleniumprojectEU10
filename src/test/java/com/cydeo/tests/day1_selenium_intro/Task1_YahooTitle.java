package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        //open the chromebrowser
        WebDriver driver= new ChromeDriver();

        // make our page full screen
        driver.manage().window().maximize();

        //go to https://yahoo.com
       driver.get("https://yahoo.com");

       //3. verify title:
       // expected:Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports &amp; Videos..
        // sayfanın inspection da title bölümünü aldık..bu bizim kodumuzdaki beklenen başlık..bunu şuanki(actual) başlıkla
        //karşılaştıracağız

        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports &amp; Videos";
        String actualTitle= driver.getTitle();// comes from the browser

        if(actualTitle.equals(expectedTitle)){
            System.out.println("title is expected.Verification passed");
        }else{
            System.out.println("Verification FAILED");
        }

        driver.quit();
    }
}
