package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_CydeoVerification {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");//driver.get() de kullanılabilir

        //3. Verify URL contains...  Expected: cydeo
        String expectedURL= "cydeo";
        String actualURL= driver.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL passed!" );
        }else {
            System.out.println("URL failed!");
        }

        //4. Verify title:...Expected: Practice
        String  expectedTitle="Practice";
        String actualTitle= driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title passed!" );
        }else {
            System.out.println("title failed!");
        }
     //driver.close();
    }
}
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
 */