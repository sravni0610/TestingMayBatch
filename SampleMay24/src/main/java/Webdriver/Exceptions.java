package Webdriver;

public class Exceptions {

    public static void validate(int age){
        if (age < 18){
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String args[]){

        validate(16);


        try{
            int d = 100/2;

        }

        catch (Exception e){

            System.out.println(e);

        }

        finally {
            System.out.println("Finally block is executed");
        }

        System.out.println("rest of the code....");
    }
}
