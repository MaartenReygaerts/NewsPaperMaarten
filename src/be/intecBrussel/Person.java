package be.intecBrussel;

import be.intecBrussel.Interfaces.Readable;
import be.intecBrussel.Interfaces.Subscriber;

public class Person implements Subscriber {

    //fields
    private String name;
    private Readable[] readables = new Readable[100];

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
        return"person";
    }

    //update

    @Override
    public void update(Readable readable) {
        for(int index = 0; index< readables.length;index++){
            if(readables[index] == null){
                readables[index] = readable;
                index = readables.length;
            }
        }

    }

    //readAll
    public void readAll(){

    }
}
