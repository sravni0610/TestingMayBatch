package Inheritance;

public class BabyDog extends Dog{

    void weep(){
        System.out.println("Baby Dogs weep");
    }

    public static void main(String args[]){

        BabyDog b1 = new BabyDog();
        b1.weep();
        b1.bark();
        b1.eat();

    }
}
