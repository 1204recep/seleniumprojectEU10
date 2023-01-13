package com.cydeo.tests.Homework;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day5Task_7_nonSelected {
    WebDriver driver;

    @BeforeMethod
     public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://practice.cydeo.com/dropdown");
    }
     @Test
     public void nonSelectedPart (){

         Select websiteBtn = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
         WebElement currentlySelectedOption = websiteBtn.getFirstSelectedOption();
         String currentNameOfselectedOne=currentlySelectedOption.getText();
         String expectedDropDownTitle = "Please select an option";

         System.out.println("currentlySelectedOption = " + currentNameOfselectedOne);
         Assert.assertEquals(currentNameOfselectedOne,expectedDropDownTitle, "DROPDOWN TITLE VERIFICATION FAILED");
         }
    @Test (priority = 2)
    public void stateSelection(){
        //Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateSelectionDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        WebElement currentlySelectedOption = stateSelectionDropdown.getFirstSelectedOption();

        String expectedStateSelectionTitle = "Select a State"
                ,actualStateSelectionTitle = currentlySelectedOption.getText();
        System.out.println("actualStateSelectionTitle = " + actualStateSelectionTitle);

        Assert.assertEquals(expectedStateSelectionTitle, actualStateSelectionTitle,"STATE SELECTION TITLE VERIFICATION FAILED");}

    @AfterClass
    public void tearsDown(){
        driver.quit();
    }
        }










/*
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */