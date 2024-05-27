package entities;

public class Person {
    private double height;
    private char genre;

    public Person(double height, char genre) {
        this.height = height;
        this.genre = genre;
    }

    public double getHeight() {
        return height;
    }

    public char getGenre() {
        return genre;
    }
}
