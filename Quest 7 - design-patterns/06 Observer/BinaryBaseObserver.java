import java.util.*;

public class BinaryBaseObserver implements NumericBaseObserver  {
    private List<String> events = new ArrayList<>();
    public void updateState(int state) {
        events.add(Integer.toBinaryString(state));
    }
    public List<String> getEvents() {
        return events;
    }
}
