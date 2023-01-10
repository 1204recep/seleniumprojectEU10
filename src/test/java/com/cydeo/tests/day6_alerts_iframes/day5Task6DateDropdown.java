package com.cydeo.tests.day6_alerts_iframes;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class day5Task6DateDropdown {
 public WebDriver driver;

 @BeforeMethod
 public void setUpForDate() {
  //1. Open Chrome browser
  driver = WebDriverFactory.getDriver("chrome");
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  driver.manage().window().maximize();

  //2. Go to https://practice.cydeo.com/dropdown
  driver.get("https://practice.cydeo.com/dropdown");

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
  String actualDayOfBirth = selectMonthOfBirth.getFirstSelectedOption().getText();


//create assertions
  Assert.assertTrue(actualYearOfBirth.equals(expectedYearOfBirth));
  Assert.assertEquals(actualMonthOfBirth, expectedMonthOfBirth);
  Assert.assertEquals(actualDayOfBirth, expectedDayOfBirth);


 }
 @Test
 public void programmingLanguage(){
  Select programLanguageBtn= new Select(driver.findElement(By.xpath("//select[@name='Languages'] ")));
  //WebElement currentBtn= driver.findElement(By.xpath("//value[@value='java'"));
  programLanguageBtn.selectByVisibleText("C#");
  
  String actualTextOfBtn=programLanguageBtn.getFirstSelectedOption().getText();
  System.out.println("actualTextOfBtn = " + actualTextOfBtn);

  

 }



/*
    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }
*/
}

/*
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */