public class Excalibur {
    String name;
    private static Excalibur INSTANCE;
    private Excalibur(String name) {
        this.name = name;
    }

    public static Excalibur getINSTANCE() {
        if (INSTANCE == null) {INSTANCE = new Excalibur("Sword");}
        return INSTANCE;
    }

    public String getName() {
        return this.name;
    }
}
