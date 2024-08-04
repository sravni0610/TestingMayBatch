package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test12 {

    WebDriver driver;

    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
    }
    @AfterMethod
    public void after(){
        driver.close();
    }

    @Test
    public void execute(){
        driver.findElement(By.id("txtUsernam")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.className("button")).click();
    }

}
