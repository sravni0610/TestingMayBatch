package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

    private static WebElement element = null;

    public static WebElement pim(WebDriver driver){

        element = driver.findElement(By.id("menu_pim_viewPimModule"));

        return element;
    }



}
