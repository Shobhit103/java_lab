package Sem4;
import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();

        s1.add("A");
        s1.add("B");
        s1.add("C");

        System.out.println("Set 1 : " + s1);

        Set<String> s2 = new HashSet<>();

        s2.add("A");
        s2.add("B");

        System.out.println("Set 2 : " + s2);

        System.out.println("Set 1 matches set 2 -->" + s1.equals(s2));

        s2.add("C");
        System.out.println("Set 2 : " + s2);
        System.out.println("Set 1 matches set 2 -->" + s1.equals(s2));
    }
}
