
public class Star extends CelestialObject {

    private double magnitude;
    public Star() {
        super();
        
        this.magnitude = 0.0;
    }
    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Star)) return false;

        Star other = (Star) obj;

        return super.equals(other)
            && Double.compare(magnitude, other.magnitude) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Double.hashCode(magnitude);
    }

    @Override
    public String toString() {
        return name + " shines at the " + String.format("%.3f", magnitude) + " magnitude";
    }
}