public class RegexReplace {

public static String removeUnits(String s) {
    return s.replaceAll("(?<=\\d)(cm|€)(?=\\s|$)", "");
}

public static String obfuscateEmail(String s) {
    s = s.replaceAll("([a-z0-9]+)([._-])([a-z0-9]+)@", "$1$2***@");
    s = s.replaceAll("([a-z0-9]{3})([a-z0-9]+)@", "$1***@");
    s = s.replaceAll("@([a-z0-9]+)\\.([a-z0-9]+)\\.([a-z]+)", "@*******.$2.***");
    s = s.replaceAll("@([a-z0-9]+)\\.(com|org|net)", "@*******.$2");
    s = s.replaceAll("@([a-z0-9]+)\\.[a-z]+", "@*******.**");
    return s;
}