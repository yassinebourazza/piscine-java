import java.util.*;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(
            Map<String, List<String>> first,
            Map<String, List<String>> second) {

        Map<String, String> result = new HashMap<>();
        Set<String> free = new HashSet<>(first.keySet());

        while (!free.isEmpty()) {
            String person = free.iterator().next();

            for (String partner : first.get(person)) {

                String current = null;

                for (Map.Entry<String, String> e : result.entrySet()) {
                    if (e.getValue().equals(partner)) {
                        current = e.getKey();
                        break;
                    }
                }

                if (current == null) {
                    result.put(person, partner);
                    free.remove(person);
                    break;
                }

                if (second.get(partner).indexOf(person)
                        < second.get(partner).indexOf(current)) {
                    result.remove(current);
                    free.remove(person);
                    free.add(current);
                    result.put(person, partner);
                    break;
                }
            }
        }

        return result;
    }
}