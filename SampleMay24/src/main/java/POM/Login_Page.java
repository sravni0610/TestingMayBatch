package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {

    private static WebElement element = null;

    public static WebElement txtbx_username(WebDriver driver){

        element = driver.findElement(By.id("txtUsername"));

        return element;
    }

    public static WebElement txtbx_password(WebDriver driver){

        element = driver.findElement(By.id("txtPassword"));
                return element;
    }

    public static WebElement login_btn(WebDriver driver){

        element = driver.findElement(By.id("btnLogin"));
        return element;
    }


}
