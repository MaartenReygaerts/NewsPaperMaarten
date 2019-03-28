package be.intecBrussel;


import be.intecBrussel.Interfaces.Readable;

public class Book implements Readable {
    String title;
    String text;
    int chapters;


    //constructors
    public Book(){

    }
    public Book(String title, String text, int chapters) {
        this.title = title;
        this.text = text;
        this.chapters = chapters;
    }
    //getters en setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    //equalsChecker
    public boolean equals(Object object){
        return false;
    }
    //hashCode checker
    public int hashCode(){
        return 0;
    }
    //toString
    @Override
    public String toString() {
        return "Book{}";
    }

    //Interface implement

    @Override
    public void read() {

    }
}
