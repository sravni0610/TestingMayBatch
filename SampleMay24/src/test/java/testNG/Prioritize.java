package testNG;

import org.testng.annotations.Test;

public class Prioritize {


    @Test(priority = 0)
    public void a(){
        System.out.println("a method");
    }

    @Test(priority = 2)
    public void B(){
        System.out.println("b method");
    }

    @Test(priority = 1)
    public void c(){
        System.out.println("c method");
    }


}
