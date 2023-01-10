package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3_RadioButton_Devam {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

       //3. locate name="sports" radio button and store them in a list of Web Element
        List<WebElement> sportsRadioButton= driver.findElements(By.name("sport"));

        //4. loop through the list of WebElement and select matching result "hockey"
        for (WebElement each : sportsRadioButton) {
            String eachId = each.getAttribute("id");
           System.out.println("each sport = " + eachId);

            if (each.getAttribute("id").equals("hockey")) {
                each.click();
                System.out.println("hockey is selected: " + each.isSelected());
                break;
            }
        }
        /*
        for (WebElement each : sportsRadioButton) {
            String eachId= each.getAttribute("id");
            System.out.println("eachId = " + eachId);

            if(eachId.equals("hockey")){
                each.click();
                System.out.println("hockey is selected: " + each.isSelected());//eachId = basketball
                                                                                //eachId = football
                                                                                //  eachId = hockey
                                                                                //hockey is selected: true

                break;
            }
        }*/


    }







}
/*
TC #3: Utility method task for (continuation of Task2)

USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */