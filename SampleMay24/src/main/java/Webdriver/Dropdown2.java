package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dropdown2 {

    public static void main(String args[]){


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        WebElement drop = driver.findElement(By.id("searchDropdownBox"));

        List<WebElement> dropd = drop.findElements(By.tagName("option"));

        System.out.println(dropd.size());

        for(int i=0;i<dropd.size();i++){

            dropd.get(i).click();
            System.out.println(dropd.get(i).getText());
        }



    }
}
