import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        int last = 0;
        int i = 0;
        for (int item : list) {
            if (item == value) {last = i;}
            i++;
        }
        return last;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        int i = 0;
        for (int item : list) {
            if (item == value) {return i;}
            i++;
        }
        return null;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        for (int item : list) {
            if (item == value) {res.add(i);}
            i++;
        }

        return res;
    }
}
