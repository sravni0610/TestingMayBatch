package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page1 {

    WebDriver driver;

    @FindBy(id = "txtUsername")
    WebElement txt_username;
    @FindBy(id = "txtPassword")
    WebElement txt_password;
    @FindBy(id = "btnLogin")
    WebElement btn_login;

    public Login_Page1(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
