package control;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {

    public static void main(String args[]){

        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        hm.put(101,"Mango");
        hm.put(102,"Apple");
        hm.put(103,"Mango");
        hm.put(104,"Grapes");

        for (Map.Entry m: hm.entrySet()) {

            System.out.println(m.getKey()+"  "+m.getValue());

        }


    }
}
