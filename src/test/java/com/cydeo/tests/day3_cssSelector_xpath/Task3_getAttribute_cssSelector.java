package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_getAttribute_cssSelector {
    public static void main(String[] args) {
       // TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
      //  1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

       // 3- Verify “Log in” button text is as expected:... Expected: Log In
       // WebElement logInBox= driver.findElement(By.className("login-btn")); eski usulde bu şekilde lokasyonu buluruz
        //                          tagname[attribute='value']
        //                          input[class='login-btn']
        // LOCATED USING TYPE CLASS ATTRIBUTE
        //WebElement logInBox= driver.findElement(By.cssSelector("input[class='login-btn']"));
        WebElement logInBox= driver.findElement(By.cssSelector("input[type='submit']"));
        String  expectedButtonText="Log In";
        //getting the value of the attrıbute "value"
        String actualButtonText= logInBox.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if(actualButtonText.equals(expectedButtonText)){
            System.out.println("log ın BUTTON text verification pass");
        }else{
            System.out.println("log ın button text verification FAILED");
        }


    }
}
