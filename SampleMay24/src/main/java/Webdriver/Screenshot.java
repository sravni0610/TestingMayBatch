package Webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void main(String args[]) throws IOException {

        WebDriver wd = new ChromeDriver();
        wd.manage().window().maximize();

        wd.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

        File srcfile = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcfile,new File("C:\\Users\\sravn\\Documents\\may-24 batch\\sample.png"));




    }
}
