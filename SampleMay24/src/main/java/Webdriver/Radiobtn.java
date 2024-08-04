package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");
        wd.findElement(By.id("cloanamount")).clear();

        wd.findElement(By.id("cloanamount")).sendKeys("35000");

        wd.findElement(By.id("cremainingyear")).clear();
        wd.findElement(By.id("cremainingyear")).sendKeys("6");

        System.out.println("Radio button1 is selected "+ (wd.findElement(By.id("cpayoff1")).isSelected()));

        wd.findElement(By.xpath("//*[contains(text(),'Payback altogether')]")).click();

        System.out.println("Radio button1 is selected "+ (wd.findElement(By.id("cpayoff1")).isSelected()));

    }
}
