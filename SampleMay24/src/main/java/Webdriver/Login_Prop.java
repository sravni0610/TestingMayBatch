package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Login_Prop {

    public static void main(String args[]) throws IOException {

        File f = new File("C:\\Users\\sravn\\Documents\\testdata\\prp.txt");
        FileInputStream fis = new FileInputStream(f);
        Properties p = new Properties();
        p.load(fis);
        System.out.println(p.getProperty("id"));
        System.out.println(p.getProperty("pwd"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys(p.getProperty("id"));
        driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("pwd"));
        driver.findElement(By.className("button")).click();


    }
}
