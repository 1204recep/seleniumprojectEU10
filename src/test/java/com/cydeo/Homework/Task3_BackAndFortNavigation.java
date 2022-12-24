package com.cydeo.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_BackAndFortNavigation {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        Thread.sleep(3000);

        //3- Click to Gmail from top right.
        WebElement gmailBox= driver.findElement(By.linkText("Gmail"));
        gmailBox.click();

        Thread.sleep(4000);

        //4- Verify title contains:..Expected: Gmail
        String expectedTitle="Gmail";
        String actualTitle= driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAİLED");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:...Expected: Google
        expectedTitle="Google";
        actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title passed");
        }else{
            System.out.println("Title passed");
        }
        driver.close();

    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */