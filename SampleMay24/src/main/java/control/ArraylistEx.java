package control;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {

    public static void main(String args[]){

        ArrayList<String> al = new ArrayList<String>();

        al.add("Mango");
        al.add("Apple");
        al.add("Mango");
        al.add("grapes");

//        for (String i : al ) {
//            System.out.println(i);
//        }

        Iterator itr = al.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
