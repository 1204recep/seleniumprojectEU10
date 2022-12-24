package com.cydeo.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification_Task1 {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(4000);

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        Thread.sleep(4000);

        //3. Verify title:...Expected: “Facebook - Log In or Sign Up”
        String expectedResult= "Facebook - Giriş Yap veya Kaydol";
        String actualResult= driver.getTitle();
        if(actualResult.equals(expectedResult)){
            System.out.println("Title PASSED!");
        }else{
            System.out.println("Title FAILED!");
        }



    }
}
/*
TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - Log In or Sign Up”
 */