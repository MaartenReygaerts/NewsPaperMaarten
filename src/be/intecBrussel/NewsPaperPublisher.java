package be.intecBrussel;

import be.intecBrussel.Interfaces.Publisher;
import be.intecBrussel.Interfaces.Readable;
import be.intecBrussel.Interfaces.Subscriber;

public class NewsPaperPublisher implements Publisher {
    String name;
    Subscriber[] subscriber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscriber[] getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber[] subscriber) {
        this.subscriber = subscriber;
    }

    //interface implements
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
