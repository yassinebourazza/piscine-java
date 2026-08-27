public class Planet extends CelestialObject {

    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Planet)) return false;

        Planet other = (Planet) obj;

        return super.equals(other)
            && centerStar.equals(other.centerStar);
    }
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + centerStar.hashCode();
    }

    @Override
    public String toString() {
        double distance = getDistanceBetween(this, centerStar);

        return name + " circles around " + centerStar.getName()
            + " at the " + String.format("%.3f", distance) + " AU";
    }
}