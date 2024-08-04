package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exam {

    @BeforeTest
    public void before(){
        System.out.println("Executing the before method");
    }

    @Test
    public void a(){
        System.out.println("Executing the method with test ");
    }


    @AfterTest
    public void after(){
        System.out.println("Executing the after method ");
    }



}
