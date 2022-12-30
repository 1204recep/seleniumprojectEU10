package com.cydeo.tests.day4_findElement_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task4_findElement {
    public static void main(String[] args) {
        // 1.open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // providing extra wait time for our  driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2 got to https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3 locate all the links in the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4. print out the number of the links
        System.out.println("allLinks.size() = " + allLinks.size());//allLinks.size() = 2

        //5.Print out the texts of the links
        //6. Print out the HREF attribute values of the links
        for (WebElement each : allLinks) {
            //System.out.println("Text of link:"+ each);//Text of link:[[ChromeDriver: chrome on WINDOWS (7269646648b5838e021c494714f05c95)] -> tag name: a]
            System.out.println("Text of link:" + each.getText());
            System.out.println("Value of link:" + each.getAttribute("href"));
                    //Text of link:Home
                    //Value of link:https://practice.cydeo.com/
                    //Text of link:CYDEO
                    //Value of link:https://cydeo.com/

        }






    }
}
