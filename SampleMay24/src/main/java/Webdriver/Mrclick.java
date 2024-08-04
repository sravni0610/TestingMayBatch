package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Mrclick {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
        wd.get(url);

        WebElement pwd = wd.findElement(By.linkText("Forgot your password?"));

        Actions action = new Actions(wd);

        action.contextClick(pwd).build().perform();

        action.sendKeys(Keys.ARROW_DOWN).build().perform();

        action.sendKeys(Keys.ARROW_DOWN).build().perform();

    }
}
