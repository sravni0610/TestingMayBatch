package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

    public static void main(String args[]){

        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://jqueryui.com/");

        wd.findElement(By.linkText("Droppable")).click();

        Actions dandD = new Actions(wd);

        wd.switchTo().frame(0);

        WebElement drag = wd.findElement(By.id("draggable"));
        WebElement drop = wd.findElement(By.id("droppable"));

        dandD.dragAndDrop(drag,drop).build().perform();



    }
}
