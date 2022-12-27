package com.cydeo.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLogin_1 {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(4000);

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        Thread.sleep(4000);

        //3. Enter incorrect username
        WebElement usernameBox= driver.findElement(By.id("email"));
        usernameBox.sendKeys("incorret username");

        //4. Enter incorrect password
        WebElement passwordBox= driver.findElement(By.id("pass"));
        passwordBox.sendKeys("incorret password"+ Keys.ENTER);

        //5. Verify title changed to:
        //Expected: “Log into Facebook”
        String expectedTitle="Log into Facebook";
        String actualTitle= driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAİLED!");
        }
    }
}
/*
TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
 */