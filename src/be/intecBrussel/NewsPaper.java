package be.intecBrussel;

import be.intecBrussel.Interfaces.Readable;

import java.time.LocalDate;

public class NewsPaper implements Readable {

    int categories;
    String title;
    String text;
    int pages;
    LocalDate datePublished;

    //constructors


    public NewsPaper() {
    }

    public NewsPaper(int categories, String title, String text, int pages, LocalDate datePublished) {
        this.categories = categories;
        this.title = title;
        this.text = text;
        this.pages = pages;
        this.datePublished = datePublished;
    }

    //equals en hashcode
    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    //toString
    @Override
    public String toString() {
        return "NewsPaper{" +
                "categories=" + categories +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", pages=" + pages +
                ", datePublished=" + datePublished +
                '}';
    }

    //implement method
    @Override
    public void read() {

    }
}
