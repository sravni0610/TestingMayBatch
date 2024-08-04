package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class StaticWebtable {

    public static void main(String args[]) throws IOException {


        File f = new File("C:\\Users\\sravn\\Documents\\testdata\\prp.txt");
        FileInputStream fis = new FileInputStream(f);
        Properties p = new Properties();
        p.load(fis);
        System.out.println(p.getProperty("id"));
        System.out.println(p.getProperty("pwd"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys(p.getProperty("id"));
        driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("pwd"));
        driver.findElement(By.className("button")).click();

        WebElement pim = driver.findElement(By.xpath("//*[contains(text(),'PIM')]"));

        WebElement Employeelist = driver.findElement(By.id("menu_pim_viewEmployeeList"));



        Actions action = new Actions(driver);

        action.moveToElement(pim).moveToElement(Employeelist).build().perform();

        Employeelist.click();

        WebElement table = driver.findElement(By.id("resultTable"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for(int i=0;i<rows.size();i++){

            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
                for(int j=0;j<cols.size();j++) {

                    System.out.println(cols.get(j).getText() + "  ");
                }
                System.out.println();
                }
        }



    }

