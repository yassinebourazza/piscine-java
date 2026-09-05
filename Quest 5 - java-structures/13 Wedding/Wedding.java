import java.util.*;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> result = new HashMap<>();
        List<String> list = new ArrayList<>(second);

        for (String name : first) {
            if (list.isEmpty()) break;

            String partner = list.remove(new Random().nextInt(list.size()));
            result.put(name, partner);
        }

        return result;
    }
}