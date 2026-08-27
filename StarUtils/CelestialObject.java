
public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static double KM_IN_ONE_AU= 150000000.0;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {return this.x;}
    public void setX(double x) {this.x = x;}

    public double getY() {return this.y;}
    public void setY(double y) {this.y = y;}

    public double getZ() {return this.z;}
    public void setZ(double z) {this.z = z;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public static double getDistanceBetween(CelestialObject a, CelestialObject b) {
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        double dz = b.z - a.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static double getDistanceBetweenInKm(CelestialObject a, CelestialObject b) {
        return getDistanceBetween(a, b) * KM_IN_ONE_AU;
    }

    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)",
                name, x, y, z);
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        CelestialObject other = (CelestialObject) object;
        
        if (!(object instanceof CelestialObject)) return false;
        return Double.compare(x, other.x) == 0
                && Double.compare(y, other.y) == 0
                && Double.compare(z, other.z) == 0
                && java.util.Objects.equals(name, other.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(name, x, y, z);
    }

}