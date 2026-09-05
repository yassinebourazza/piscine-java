import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KeepTheChange {

    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> result = new ArrayList<>();

        while (amount > 0) {
            int biggest = 0;

            for (int coin : coins) {
                if (coin <= amount && coin > biggest) {
                    biggest = coin;
                }
            }

            result.add(biggest);
            amount -= biggest;
        }

        return result;
    }
}