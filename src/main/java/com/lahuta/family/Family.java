package main.java.com.lahuta.family;

import java.util.Objects;

public class Family implements Comparable<Family> {
    private final String name;
    private final int quantityMember;
    private final String title;
    private final String nameOfEmblem;

    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {

        return name;
    }

    public int getQuantityMember() {

        return quantityMember;
    }

    public String getTitle() {

        return title;
    }

    public String getNameOfEmblem() {

        return nameOfEmblem;
    }

    @Override
    public int compareTo(Family o) {

        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", quantityMember=" + quantityMember +
                ", title='" + title + '\'' +
                ", nameOfEmblem='" + nameOfEmblem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return quantityMember == family.quantityMember &&
                name.equals(family.name) &&
                title.equals(family.title) &&
                nameOfEmblem.equals(family.nameOfEmblem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantityMember, title, nameOfEmblem);
    }
}