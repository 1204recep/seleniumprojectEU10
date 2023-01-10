package com.cydeo.tests.day4_findElement_checkboxes_radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_xpath_cssPractice {
    public static void main(String[] args) {
//TC #1: XPATH and cssSelector Practices
//1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

//3. Locate all the WebElements on the page using XPATH and/or CSS
//locator only (total of 6)
//a. “Home” link
        WebElement homeLink1= driver.findElement(By.cssSelector("a[class='nav-link'"));

        //WebElement homeLink2= driver.findElement(By.cssSelector("a.nav-link"));

        //WebElement homeLink3= driver.findElement(By.cssSelector("a[href='/'"));


//b. “Forgot password” header
        // first locate parent element and move down to h2
        WebElement headerLink1= driver.findElement(By.cssSelector("div.example > h2"));

        //xpath
        //WebElement headerLink2= driver.findElement(By.xpath("//h2"));
        // WebElement headerLink3= driver.findElement(By.xpath("//h2[text()='Forgot Password'"));
        // WebElement headerLink3= driver.findElement(By.xpath("//h2[.='Forgot Password'"));


//c. “E-mail” text
        //xpath
        WebElement emailLink1= driver.findElement(By.xpath("//label[@for='email']"));

//d. E-mail input box
        WebElement inputBox1= driver.findElement(By.xpath("//input[@type='text']"));
                //xpath contains method....//tagName[contains(@attribute,'value')]
       // WebElement inputBox2= driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


//e. “Retrieve password” button
        // bu satırda direkt olarak butonu lokal ediyoruz..oradan “Retrieve password” text ine ulaşabiriz..
        WebElement retrivePasswordButton= driver.findElement(By.xpath("//button[@id='form_submit']"));
            // ...//button/i[.='Retrive password']...from parent to child...bu metod buton üstündeki yazıyı direkt olarak getirir.


//f. “Powered by Cydeo text

        WebElement poweredByCydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));


//4. Verify all web elements are displayed.
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("headerLink1.isDisplayed() = " + headerLink1.isDisplayed());
        System.out.println("emailLink1.isDisplayed() = " + emailLink1.isDisplayed());
        System.out.println("inputBox1.isDisplayed() = " + inputBox1.isDisplayed());
        System.out.println("retrivePasswordButton.isDisplayed() = " + retrivePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


//First solve the task with using cssSelector only. Try to create 2 different
//cssSelector if possible
//Then solve the task using XPATH only. Try to create 2 different
//XPATH locator if possible

    }
}
