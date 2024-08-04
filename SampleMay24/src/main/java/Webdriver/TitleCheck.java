package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {

    public static void main(String args[]){

        WebDriver driver = new ChromeDriver();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        String exptitle = "OrangeHRm";
        String acttitle = driver.getTitle();

        System.out.println("Actual title received is "+acttitle);

        if(exptitle.equals(acttitle)){
            System.out.println("Titles matched");
        }
        else {
            System.err.println("Titles not matched");
        }


        driver.close();
    }
}
