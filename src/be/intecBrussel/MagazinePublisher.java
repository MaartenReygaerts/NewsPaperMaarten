package be.intecBrussel;

import be.intecBrussel.Interfaces.Publisher;
import be.intecBrussel.Interfaces.Readable;
import be.intecBrussel.Interfaces.Subscriber;

public class MagazinePublisher implements Publisher {

    //fields
    String name;
    Subscriber[] subscribers;

    //getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscriber[] getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Subscriber[] subscribers) {
        this.subscribers = subscribers;
    }

    //implement methods
    @Override
    public void subscribe(Subscriber newSubscriber) {

    }

    @Override
    public void unSubscribe(Subscriber oldSubscriber) {

    }

    @Override
    public void publish(Readable readable) {

    }
}
