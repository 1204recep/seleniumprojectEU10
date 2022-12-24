package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //1. set up browser driver
        WebDriverManager.chromedriver().setup();

        //2. create instance of the selenium webdriver..this is the line opening an empty browser

        WebDriver driver = new ChromeDriver();// session ıd:58fhshdj58 driver için selenium un kullanacağı kod bu

            //2.1 full screen
        driver.manage().window().maximize();
            //driver.manage().window().fullscreen();----->windows için çalışmıyor

        //3. go to "https://www.tesla .com"

        driver.get("https://www.tesla.com");


        //3.1.get the title of the page
            //System.out.println(driver.getTitle());
            //String currentTitle1= driver.getTitle();
        System.out.println("currentTitle1 = " + driver.getTitle());

        //3.2. get the currentURL
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        //4. stop code execution for 3 seconds

        Thread.sleep(3000);

        //5. use selenium to  navigate back. turn back to the empty page
         driver.navigate().back();

        //6. stop code execution for 3 seconds

        Thread.sleep(3000);

        //7. use selenium to  navigate forward.
        driver.navigate().forward();

        //8. stop code execution for 3 seconds

        Thread.sleep(3000);

        //9. use selenium to navigate refresh
        driver.navigate().refresh();

        //10. use navigate().to():
        driver.navigate().to("https://www.google.com");

        //11.get the title of the page
            //System.out.println(driver.getTitle());
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle2 = " + currentTitle);
        
        //12.get the current url
        currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //13. this will close the currently opened window
        //driver.close();

        //14. this will close all opened windows
        driver.quit();

    }
}
