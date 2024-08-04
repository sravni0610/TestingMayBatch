package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    private static WebDriver driver = null;

    public static void main(String args[]){

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        Login_Page.txtbx_username(driver).sendKeys("Admin");
        Login_Page.txtbx_password(driver).sendKeys("Qedge123!@#");
        Login_Page.login_btn(driver).click();
        Home_Page.pim(driver).click();

    }

}
