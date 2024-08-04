package Inheritance;

public class Tester extends  Employee{

    double bonus = 550.5;

    public static void main(String args[]){


        Tester t1 = new Tester();

        System.out.println("Salary of Tester is "+(t1.salary+t1.bonus));



    }
}
