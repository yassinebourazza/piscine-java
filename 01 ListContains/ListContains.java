import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        for (int item : list) {
            if (item == value) {return true;}
        }
        return false;
    }
}