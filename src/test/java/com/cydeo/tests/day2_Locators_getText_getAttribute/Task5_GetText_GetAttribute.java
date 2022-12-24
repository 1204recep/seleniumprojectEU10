package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_GetText_GetAttribute {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:...  Expected: Registration form
       //???? WebElement headerText= driver.findElement(By.linkText("Registration form"));???
        WebElement headerText= driver.findElement(By.tagName("h2"));
        String  expectedHeaderText="Registration form";
        String actualHeaderText=headerText.getText();
        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text PASS");
        }else{
            System.out.println("Header text FAİLED");
        }

        //4- Locate “First name” input box..we are locatıng the web element using "name" locator..
        //name attribute has  "fistname" value
       //WebElement firstNameInput= driver.findElement(By.name("firstname"));
       WebElement firstNameInput= driver.findElement(By.className("form-control"));


        //5- Verify placeholder (kutu iinde yazan bilgi) attribute’s value is as expected:
        //Expected: first name
        String expectedPlaceHolder= "first name";
        String actualPlaceHolder=firstNameInput.getAttribute("placeholder");
        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("expectedPlaceHolder is PASS!");
        }else{
            System.out.println("expectedPlaceHolder is FAİLED");
        }
       // driver.close();
    }
}
/*
TC #5: getText() and getAttribute() method practice
1- Open a chromebrowser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder (kutu iinde yazan bilgi) attribute’s value is as expected:
Expected: first name
 */