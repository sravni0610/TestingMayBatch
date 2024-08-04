package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementpresence {


    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.esky.co.uk/");

        String str = "London";

        String pgsrc = driver.getPageSource();

        if(pgsrc.contains(str)){
            System.out.println("Element is present in the page");
        }

        else {
            System.err.println("Element is not available in the page currently");
        }

    }
}
