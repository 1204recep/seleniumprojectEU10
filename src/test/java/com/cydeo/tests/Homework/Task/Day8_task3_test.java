package com.cydeo.tests.Homework.Task;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day8_task3_test {
    //1- Open a chrome browser
    //2- Go to: https://practice.cydeo.com/tables
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/tables");
    }
    @Test
    public void test1(){

            Day8_task3_CreateCustomMethod.getTableGetEmail1(driver,"1", "John");
        }
    }

