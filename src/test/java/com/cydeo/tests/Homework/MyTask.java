package com.cydeo.tests.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTask {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        WebElement gmailBox= driver.findElement(By.linkText("Gmail"));
        gmailBox.click();

        Thread.sleep(3000);

        WebElement signInBox= driver.findElement(By.linkText("Oturum açın"));
        signInBox.click();

        Thread.sleep(3000);

        WebElement emailBox= driver.findElement(By.name("identifier"));
        emailBox.sendKeys("recepdemirci2000@gmail.com"+ Keys.ENTER);

        String expectedResult= "Couldn’t sign you in";

        WebElement attentionPage= driver.findElement(By.cssSelector("#headingText > span"));
        String attentionPageTxt= attentionPage.getText();

        System.out.println(attentionPageTxt);//text i alamadım...#headingText > span
        System.out.println(expectedResult);//text i alamadım...#headingText > span
       // System.out.println(expectedResult);


        if(attentionPageTxt.equals(expectedResult)){
            System.out.println("PASS!");
        }else{
            System.out.println("FAAİLED!");
        }

       // driver.navigate().back(); çalışmadı..aynı sayfada kaldı






    }
}
