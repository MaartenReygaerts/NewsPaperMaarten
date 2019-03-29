package be.intecBrussel;

import be.intecBrussel.Interfaces.Publisher;
import be.intecBrussel.Interfaces.Readable;
import be.intecBrussel.Interfaces.Subscriber;

public class NewsPaperPublisher implements Publisher {
    String name;
    Subscriber[] subscribers = new Subscriber[100];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscriber[] getSubscriber() {
        return subscribers;
    }

    public void setSubscriber(Subscriber[] subscriber) {
        this.subscribers = subscriber;
    }

    //interface implements
    @Override
    public void subscribe(Subscriber subscriber) {
        for (int i = 0; i< subscribers.length;i++){
            if(subscribers[i] == null){
                subscribers[i] = subscriber;
                i = subscribers.length;

            }
        }
    }

    @Override
    public void unSubscribe(Subscriber oldSubscriber) {

    }

    @Override
    public void publish(Readable readable) {
        for (Subscriber subscriber: subscribers ) {
            subscriber.update(readable);
        }


    }
}
