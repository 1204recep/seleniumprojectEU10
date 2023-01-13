package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void window_handling_test(){
        //2. Go to: https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Copy-paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");
/*
        Set<String> allWindowsHandles=driver.getWindowHandles();
        System.out.println(allWindowsHandles);//[CDwindow-EB77EB038290015D711705CCB3ED6034, CDwindow-8CCE39C6A60FED2B3851E56355190E68, CDwindow-82A5E87E1366F2BCB3EF33516C7D2B2D, CDwindow-A98F560321239F715FFE451A7179FB34]
       for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
           System.out.println("current URL: " + driver.getCurrentUrl());
           if(driver.getCurrentUrl().contains("etsy")) {
               break;
           }
       }

       // 5. Assert:Title contains "Etsy"

        String actualTitle= driver.getTitle();
       String expectedTitle="Etsy";

        Assert.assertTrue(actualTitle.contains(expectedTitle));*/

    }
}