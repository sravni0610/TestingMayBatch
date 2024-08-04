package control;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

    public static void main(String args[]){

        HashSet<String> hs = new HashSet<String>();

        hs.add("Mango");
        hs.add("Apple");
        hs.add("Mango");
        hs.add("Grapes");

        Iterator itr = hs.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
