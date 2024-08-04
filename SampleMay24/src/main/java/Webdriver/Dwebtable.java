package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dwebtable {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.esky.co.uk/");

        String doj = "15/04/2025";

        driver.findElement(By.id("TripTypeOneway")).click();
        driver.findElement(By.id("departureOneway")).sendKeys("London");
        driver.findElement(By.id("arrivalOneway")).sendKeys("Delhi");

        driver.findElement(By.id("departureDateOneway")).click();

        String a[]=doj.split("/");

        String mons[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int x = Integer.parseInt(a[1]);
        String mon = mons[x-1];
        String year = a[2];
        String date = a[0];

        String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();

        while(!calyear.equals(year)){
            driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
            System.out.println(calyear);
        }

        String  calmon = driver.findElement(By.className("ui-datepicker-month")).getText();

        while(!calmon.equals(mon)){

            driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
            calmon = driver.findElement(By.className("ui-datepicker-month")).getText();
            System.out.println(calmon);

        }

        WebElement table = driver.findElement(By.className("ui-datepicker-calendar"));


        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows.size();i++){
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            for(int j=0;j< cols.size();j++){

                if(cols.get(j).getText().equals(date)){
                    cols.get(j).click();
                }
            }
        }




    }
}
