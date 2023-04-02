package Sem4;
import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "Jatin Saini");
        ht.put(2, "Jatin Kumar");
        ht.put(3, "Shobhit");
        ht.put(4, "Naman");
        ht.put(5, "Divyansh");

        Enumeration<Integer> keys = ht.keys();
        while(keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("key : " + key + "\t\tvalue : " + ht.get(key));
        }
    }
}
