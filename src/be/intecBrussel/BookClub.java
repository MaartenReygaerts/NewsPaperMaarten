package be.intecBrussel;

import be.intecBrussel.Interfaces.Publisher;
import be.intecBrussel.Interfaces.Readable;
import be.intecBrussel.Interfaces.Subscriber;

public class BookClub implements Subscriber, Publisher {
    String name;
    Book[] books;
    Subscriber[] members;

    //constructors
    public BookClub() {
    }

    public BookClub(String name) {
        this.name = name;
    }

    //getters en setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Subscriber[] getMembers() {
        return members;
    }

    public void setMembers(Subscriber[] members) {
        this.members = members;
    }

    //methods
    @Override
    public void update() {

    }

    //add new book
    public void addBook(Book newBook) {

    }

    //remove book
    public void removeBook(Book oldBook) {

    }

    //bookChecker
    public void checkIfBook(Readable readable) {

    }

    //add new subscriber
    @Override
    public void subscribe(Subscriber newSubscriber) {

    }

    //remove subscriber
    @Override
    public void unSubscribe(Subscriber oldSubscriber) {

    }

    //publish results
    @Override
    public void publish(Readable readable) {

    }

    //toString
    @Override
    public String toString() {
        return "BookClub{}";
    }
}
