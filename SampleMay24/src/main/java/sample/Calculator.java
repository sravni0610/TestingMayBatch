package sample;

public class Calculator {

    void add(int a, int b){
        System.out.println("added values are "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("added values are "+(a+b+c));
    }

    void add(double a,double b){
        System.out.println("added values are "+(a+b));
    }
    int sum(int a, int b){
        return (a+b);
    }

    public static void main(String args[]){

        Calculator c1 = new Calculator();
        c1.add(10.5,30);
        c1.add(10,20,30);
        c1.add(10,25);
        System.out.println(c1.sum(20,15));

    }
}
