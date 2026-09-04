import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {

    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        Integer price = inventory.get(productId);

        if (price == null) {
            return -1;
        }

        return price;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> productIds = new ArrayList<>();

            
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == price) {
                productIds.add(entry.getKey());
            }
        }

        return productIds;
    }

}
