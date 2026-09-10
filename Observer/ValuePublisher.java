import java.util.*;

public class ValuePublisher {
    private List<NumericBaseObserver> observers = new ArrayList<>();
    public void updateState(int value) {
        for (NumericBaseObserver obs : observers) {
            obs.updateState(value);
        }
    };

    public void subscribe(NumericBaseObserver observer) {
        observers.add(observer);
    };
    public void unsubscribe(NumericBaseObserver observer) {
      observers.remove(observer);
    };
}
