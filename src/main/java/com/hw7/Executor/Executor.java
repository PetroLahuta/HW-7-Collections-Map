package main.java.com.hw7.Executor;

import main.java.com.hw7.Family.ComporatorOfFamilie;
import main.java.com.hw7.Family.ComporatorToEmblemsFamily;
import main.java.com.hw7.Family.Family;
import main.java.com.hw7.RemovingIdenticalNumbers;

import java.util.Map;
import java.util.TreeMap;

public class Executor {
    public static void start() {
        RemovingIdenticalNumbers.removingDublicates();
        Executor.goToFamily();
    }

    public static void goToFamily() {
        Map<Family, Integer> family = new TreeMap<>();
        family.put(new Family("Arthur", 8, "King", "Lion"), 1);
        family.put(new Family("Feridinand", 11, "Marquis", "chariot with a rider"), 2);
        family.put(new Family("Brandon", 1, "Slave", "Cow shit"), 3);
        family.put(new Family("Winston", 4, "Lord", "Brandy and cigar"), 4);
        family.put(new Family("Munchausen", 2, "Baron", "Cannonball"), 5);
        family.put(new Family("Tomato", 44, "Senior", "Big Tomato"), 6);
        family.put(new Family("Miguel", 15, "Viscount", "Bull"), 7);
        family.put(new Family("Ivan", 3, "Fool", "Goldfish"), 8);
        family.put(new Family("Boris", 6, "Robber", "Dagger"), 9);
        family.put(new Family("Petro", 12, "Cossack", "Big gun"), 10);

        System.out.println(" Task 2 ");
        System.out.println("Sort by name: ");
        family.forEach((Family, Integer) -> System.out.println(Family + " " + Integer));

        System.out.println("Sort by title: ");
        Map<Family, Integer> familyTitleSort = new TreeMap<>(new ComporatorOfFamilie().reversed());
        familyTitleSort.putAll(family);
        familyTitleSort.forEach((Integer, Family) -> System.out.println(Integer + " " + Family));

        System.out.println("Sort by emblem: ");
        Map<Family, Integer> familyEmblemSort = new TreeMap<>(new ComporatorToEmblemsFamily());
        familyEmblemSort.putAll(family);
        familyEmblemSort.forEach((Integer, Family) -> System.out.println(Integer + " " + Family));
    }

}
