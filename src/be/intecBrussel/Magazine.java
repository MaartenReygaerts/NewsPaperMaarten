package be.intecBrussel;

import be.intecBrussel.Interfaces.Readable;

public class Magazine implements Readable {

    //properties
    String title;
    String text;
    int articles;
    int edition;

    //constructors
    public Magazine() {
    }

    public Magazine(String title, String text, int articles, int edition) {
        this.title = title;
        this.text = text;
        this.articles = articles;
        this.edition = edition;
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

    public int getArticles() {
        return articles;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    //methods


    @Override
    public String toString() {
        return "Magazine{}";
    }
    public boolean equals(Object object){
        return  false;
    }
    public int hashCode(){
        return 0;

    }

    //interface implement
    @Override
    public void read() {

    }
}
