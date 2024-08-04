package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mogli");

        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
