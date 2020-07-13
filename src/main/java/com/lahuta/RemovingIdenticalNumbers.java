package main.java.com.lahuta;

import java.util.HashSet;
import java.util.Set;

public class RemovingIdenticalNumbers {
    public static void removingDublicates() {
        Set<Integer> hash_Set = new HashSet<>();
        hash_Set.add(1);
        hash_Set.add(2);
        hash_Set.add(3);
        hash_Set.add(4);
        hash_Set.add(4);
        hash_Set.add(5);
        System.out.println(" Task 1 ");
        System.out.println("No duplicate elements: " + hash_Set);
    }
}