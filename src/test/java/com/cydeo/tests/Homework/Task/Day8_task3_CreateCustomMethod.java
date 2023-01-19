package com.cydeo.tests.Homework.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day8_task3_CreateCustomMethod {


          public static void getTableGetEmail1( WebDriver driver,String tableNum,String firstName){
            WebElement tableNumber= driver.findElement
                    (By.xpath("//table[@id='table"+tableNum+"']//td[.='"+firstName+"']/following-sibling::td[1]"));
            String getEmailextr =tableNumber.getText();
              System.out.println(getEmailextr);

              //Assert.assertEquals(getEmailextr,firstName);


        }


    }

    //3- Write custom method:
    //• Method name: getTableGetEmail()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String tableNum
    //• Arg3: String firstName

