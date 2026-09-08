public class Excalibur {
    String name;
    private static Excalibur instance;
    private Excalibur(String name) {
        this.name = name;
    }

    public static Excalibur getInstance() {
        if (instance == null) {return new Excalibur("Sword");}
        return instance;
    }

    public String getName() {
        return this.name;
    }
}
