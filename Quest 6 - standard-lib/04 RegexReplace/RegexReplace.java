public class RegexReplace {

    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)(?=\\s|$)", "");
    }

    public static String obfuscateEmail(String s) {
        int positionAt = s.indexOf('@');
        if (positionAt == -1) return s;

        String name = s.substring(0, positionAt);
        String address = s.substring(positionAt + 1);
        String hiddenName = "";
        int separator = -1;

        if (name.contains("-")) {
            separator = name.indexOf('-');
        } else if (name.contains(".")) {
            separator = name.indexOf('.');
        } else if (name.contains("_")) {
            separator = name.indexOf('_');
        }

        if (separator != -1) {
            String visible = name.substring(0, separator + 1);
            String hidden = "*".repeat(name.length() - separator - 1);
            hiddenName = visible + hidden;
        } else if (name.length() > 3) {
            String visible = name.substring(0, 3);
            String hidden = "*".repeat(name.length() - 3);
            hiddenName = visible + hidden;
        } else {
            hiddenName = name;
        }

        String[] parts = address.split("\\.");
        String hiddenAddress = "";

        if (parts.length == 3) {
            String first = "*".repeat(parts[0].length());
            String second = parts[1];
            String last = "*".repeat(parts[2].length());
            hiddenAddress = first + "." + second + "." + last;

        } else if (parts.length == 2) {
            String first = "*".repeat(parts[0].length());
            String last = parts[1];

            if (!last.equals("com") && !last.equals("org") && !last.equals("net")) {
                last = "*".repeat(last.length());
            }

            hiddenAddress = first + "." + last;
        } else {
            hiddenAddress = address;
        }

        return hiddenName + "@" + hiddenAddress;
    }
}
