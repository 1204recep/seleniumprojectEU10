package com.cydeo.tests.Homework.Task;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5_Task5_StateDropdown1 {

    WebDriver driver;
    @BeforeMethod
     public void setupDriver(){
        //1. Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cydeo.com/dropdown");
    }

    @Test
    public void selenium_test() throws InterruptedException {
        //we located the dropdown and it is ready to use
        Select stateSelectionDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(3000);
        stateSelectionDropdown.selectByVisibleText("Illinois");
        //stateSelectionDropdown.selectByValue("IL");

        //4. Select Virginia
        Thread.sleep(3000);
        stateSelectionDropdown.selectByVisibleText("Virginia");
        //stateSelectionDropdown.selectByValue("VA");
        Thread.sleep(3000);
        stateSelectionDropdown.selectByIndex(3);//Arizona

        //5. Select California
        Thread.sleep(3000);
        stateSelectionDropdown.selectByVisibleText("California");
        //stateSelectionDropdown.selectByValue("CA");

        //6. Verify final selected option is California.
        String expectedStateName="California";
        String actualStateName=stateSelectionDropdown.getFirstSelectedOption().getText();
/*
        WebElement californiaOption =stateSelectionDropdown.getFirstSelectedOption();
        String textOfcaliforniaOption= californiaOption.getText();
        System.out.println(textOfcaliforniaOption);..California*/

        System.out.println(actualStateName);

        Assert.assertEquals(actualStateName,expectedStateName, "It is not passed!");


    }

    @Test
    public void selectingDateDropdown() {
        //3. Select “December 1st, 1923” and verify it is selected.

        Select selectYearOfBirth = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select selectMonthOfBirth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select selectDayOfBirth = new Select(driver.findElement(By.xpath("//select[@id='day']")));


        selectYearOfBirth.selectByVisibleText("1924");
        selectMonthOfBirth.selectByValue("11");
        selectDayOfBirth.selectByIndex(0);

//creating expected values
        String expectedYearOfBirth = "1924";
        String expectedMonthOfBirth = "December";
        String expectedDayOfBirth = "1";

//getting actual values from browser
        String actualYearOfBirth = selectYearOfBirth.getFirstSelectedOption().getText();
        String actualMonthOfBirth = selectMonthOfBirth.getFirstSelectedOption().getText();
        String actualDayOfBirth = selectDayOfBirth.getFirstSelectedOption().getText();


//create assertions
        Assert.assertTrue(actualYearOfBirth.equals(expectedYearOfBirth));
        Assert.assertEquals(actualMonthOfBirth, expectedMonthOfBirth, "invalid month");
        Assert.assertEquals(actualDayOfBirth, expectedDayOfBirth, "invalid day");


    }

@AfterMethod
    public void tearDown(){
        driver.close();
}
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Select Illinois
    //4. Select Virginia
    //5. Select California
    //6. Verify final selected option is California.
    //Use all Select options. (visible text, value, index)
}
