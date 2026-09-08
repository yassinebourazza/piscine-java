public class TransportFactory {
    public static Transport getTransport(String name) {
        if (name.equals("Car")) {
            return new Car();
        } else if (name.equals("Plane")) {
            return new Plane();
        }
        return null;
    }
}
