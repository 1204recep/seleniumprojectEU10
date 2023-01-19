package com.cydeo.tests.Homework.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_PracticeCydeo {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browserp
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        Thread.sleep(3000);

        //3- Click to “Home” link
        WebElement homeBox= driver.findElement(By.linkText("Home"));
        homeBox.click();

        //4- Verify title is as expected:...Expected: Practice
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title PASSED!");
        }else{
            System.out.println("Title FAILED");
        }

        Thread.sleep(5000);
        driver.close();

    }
}
/*
TC #4: Practice Cydeo – Class locator practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator
 */