package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Mousehover {

    public static void main(String args[]) throws IOException, InterruptedException {

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

        WebElement pim = driver.findElement(By.xpath("//*[contains(text(),'PIM')]"));

        WebElement config = driver.findElement(By.id("menu_pim_Configuration"));

        WebElement customfields = driver.findElement(By.id("menu_pim_listCustomFields"));

        Actions action = new Actions(driver);

        action.moveToElement(pim).moveToElement(config).moveToElement(customfields).build().perform();

        Thread.sleep(5000);

        customfields.click();

    }
}
