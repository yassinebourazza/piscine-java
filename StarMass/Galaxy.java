import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject celestialObject) {
        celestialObjects.add(celestialObject);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> massRepartition = new HashMap<>();

        massRepartition.put("Star", 0);
        massRepartition.put("Planet", 0);
        massRepartition.put("Other", 0);

        for (CelestialObject object : celestialObjects) {
            if (object instanceof Star) {
                massRepartition.put("Star",massRepartition.get("Star") + object.getMass());
            } else if (object instanceof Planet) {
                massRepartition.put("Planet",massRepartition.get("Planet") + object.getMass());
            } else {
                massRepartition.put("Other",massRepartition.get("Other") + object.getMass());
            }
        }

        return massRepartition;
    }

}