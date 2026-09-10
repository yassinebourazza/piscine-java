import java.util.*;

public class DecimalBaseObserver implements NumericBaseObserver {
    public List<String> events = new ArrayList<>();
    public void updateState(int state) {
        events.add(Integer.toString(state));
    }
    public List<String> getEvents() {
        return events;
    }
}
