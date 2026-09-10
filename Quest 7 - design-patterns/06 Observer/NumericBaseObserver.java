import java.util.*;

public interface NumericBaseObserver {
    public void updateState(int state);
    public List<String> getEvents();
}
