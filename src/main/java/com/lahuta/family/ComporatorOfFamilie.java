package main.java.com.lahuta.family;

import java.util.Comparator;

public class ComporatorOfFamilie implements Comparator<Family> {

    @Override
    public int compare(Family f1, Family f2) {
        return f1.getTitle().compareTo(f2.getTitle());
    }
}