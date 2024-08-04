package sample;

public class AreaRec {

    double len;
    double bre;

    void area(){

        System.out.println("Area of rectangle is "+(len * bre));

    }

    public static void main(String args[]){

        AreaRec a1 = new AreaRec();

        a1.len = 5.5;
        a1.bre = 4.3;
        a1.area();


    }
}
