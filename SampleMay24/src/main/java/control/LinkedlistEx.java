package control;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistEx {

    public static void main(String args[]){

        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Mango");
        ll.add("Apple");
        ll.add("Mango");
        ll.add("Grapes");

        Iterator itr = ll.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
