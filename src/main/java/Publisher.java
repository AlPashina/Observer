import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

    protected List<Subscriber> subscribers;

    public void subscribe(Subscriber subscriber) {
        if (subscribers == null) {
            subscribers = new ArrayList<>();
        }
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    protected void notifyObservers(double temperature,double pressure,double humidity){
        for (var sub : subscribers) {
            sub.notify(temperature,pressure, humidity); ;
        }
    }
}
