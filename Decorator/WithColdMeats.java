public class WithColdMeats extends RacletteDecorator {
    private Raclette decoratedRaclette;
    public WithColdMeats(Raclette raclette) {
        super(raclette);
        this.decoratedRaclette = raclette;
    };
    public int getCalories() {
        return decoratedRaclette.getCalories() + 350;
    };
    public String getIngredients() {
        return decoratedRaclette.getIngredients() + ", charcuterie";
    };

    public String toString() {
        return String.format("%s pour %d calories", getIngredients(), getCalories());
    }
}
