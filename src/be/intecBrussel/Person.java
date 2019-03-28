package be.intecBrussel;

import be.intecBrussel.Interfaces.Subscriber;

public class Person implements Subscriber {
    String name;
    Readable[] readables;

    //getters en setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Readable[] getReadables() {
        return readables;
    }

    public void setReadables(Readable[] readables) {
        this.readables = readables;
    }

    //constructors
    public Person(){

    }
    public Person(String name) {
        this.name = name;
    }

    //methods
    @Override
    public String toString() {
        return "Person{}";
    }

    //update

    @Override
    public void update() {

    }

    //readAll
    public void readAll(){

    }
}
