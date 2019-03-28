package be.intecBrussel.Interfaces;

public interface Publisher {
    void subscribe(Subscriber newSubscriber);
    void unSubscribe(Subscriber oldSubscriber);
    void publish(Readable readable);
}
