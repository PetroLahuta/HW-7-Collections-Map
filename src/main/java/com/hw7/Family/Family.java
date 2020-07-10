package main.java.com.hw7.Family;

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
}