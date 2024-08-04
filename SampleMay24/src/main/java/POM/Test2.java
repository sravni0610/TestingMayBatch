package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

    public static void main(String args[]) {


    WebDriver driver;
    driver =new ChromeDriver();

    Login_Page1 lp = new Login_Page1(driver);


    driver.get("");
    lp.txt_username.sendKeys();
    lp.txt_password.sendKeys();
    lp.btn_login.click();




}

}
