package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowshandling {

    public static void main(String args[]){

        WebDriver ar = new ChromeDriver();

        ar.manage().window().maximize();

        ar.get("https://demo.guru99.com/popup.php");

        String s = ar.getWindowHandle();
        System.out.println("Current window id of the page is "+s);

        ar.findElement(By.linkText("Click Here")).click();

        Set<String> windows = ar.getWindowHandles();

        Iterator itr = windows.iterator();

        while (itr.hasNext()){
            String c = itr.next().toString();

            if(!c.equals(s)){
                System.out.println("new window id of the page is "+c);
                ar.switchTo().window(c);

            }
        }

        ar.findElement(By.name("emailid")).sendKeys("ar123@gmail.com");
        ar.findElement(By.name("btnLogin")).click();



    }
}
