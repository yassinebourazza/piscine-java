public class RegexReplace {

    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)", "");
    }

    public static String obfuscateEmail(String s) {
        return s.replaceAll("([a-zA-Z0-9]+)([._-])([a-zA-Z0-9]+)@([a-zA-Z0-9]+)\\.([a-zA-Z0-9]+)\\.([a-zA-Z]+)","$1$2***@*******.$5.***")
                .replaceAll("([a-zA-Z0-9]{3})([a-zA-Z0-9]+)@([a-zA-Z0-9]+)\\.([a-zA-Z]+)","$1***@*******.$4");
    }
}
