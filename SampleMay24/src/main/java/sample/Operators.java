package sample;

public class Operators {

    public static void main(String args[]){
        int a ;
        int b;
        int c;
        a= 30;
        b=10;
        c = (a>b)?a:b;
        System.out.println(c);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(!((a>b)&&(b==20)));
    }
}
