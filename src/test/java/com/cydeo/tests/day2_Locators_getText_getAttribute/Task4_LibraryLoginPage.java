package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryLoginPage {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”..sayfya gidip "email adress" üzerinde sağ
        // klik yaptık ve bizi inspect sayfasına yönlendirdi..fakat burada  "label" etiket bölümü renklendirilmişti o yüzden
         // biz user ın input yapacağı yerden class ı seçtik...name veya ıd oabilirdi
        WebElement userNameInput= driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”..negatif testing yapıyoruz ..yanlış değerler giriyruz
        WebElement passwordInput= driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");

        //5.Click to sign in botton..
        WebElement signInButton=driver.findElement(By.tagName("button"));
        signInButton.click();


    }
}
/*
TC #4: Library verifications
1. Open Chrome browser
2. Go to http://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5.Click to sign in botton
6. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator
 */