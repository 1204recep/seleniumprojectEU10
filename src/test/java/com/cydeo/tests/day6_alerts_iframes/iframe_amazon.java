package com.cydeo.tests.day6_alerts_iframes;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframe_amazon {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://www.amazon.com/");
    }
    @Test
    public  void iframeDuty(){
        driver.switchTo().frame("DAsis");
//html/body/iframe
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//html/body/iframe"));
        System.out.println(yourContentGoesHereText.getText());

    }



}
