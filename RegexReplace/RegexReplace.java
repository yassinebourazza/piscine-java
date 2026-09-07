public class RegexReplace {

    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)", "");
    }

    public static String obfuscateEmail(String s) {
        return s.replaceAll("([a-z0-9]+)([._-])([a-z0-9]+)@([a-z0-9]+)\\.([a-z0-9]+)\\.([a-z]+)","$1$2***@*******.$5.***")
                .replaceAll("([a-z0-9]{3})([a-z0-9]+)@([a-z0-9]+)\\.([a-z]+)","$1***@*******.$4");
    }
}
