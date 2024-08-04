package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Alerts {

    public static void main(String args[]) throws InterruptedException {

        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));

        wd.get("https://demoqa.com/alerts");

//        wd.findElement(By.id("alertButton")).click();
//
//        Alert alert = wd.switchTo().alert();
//
//        alert.accept();

        wd.findElement(By.id("timerAlertButton")).click();

        Alert myalert = wait.until(ExpectedConditions.alertIsPresent());

        myalert.accept();
    }
}
