package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLogin {

    public static void main(String args[]){


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.id("txtPassword")).sendKeys("Admin");

        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.className("button")).click();

        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.id("btnCancel")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
      //  driver.findElement(By.id("btnLogin")).click();


//        driver.close();




    }
}
