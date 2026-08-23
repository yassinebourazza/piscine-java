public class CleanExtract {
    public static String extract(String s) {
        String[] parts = s.split("\\|");
        String result = "";

        for (String part : parts) {
            int first = part.indexOf('.');
            int last = part.lastIndexOf('.');
            String text;
            //System.out.println(first);

            if (first != -1 && last != -1) {
                if (first == last) {last = part.length()-1;}
                text = part.substring(first + 1, last).trim();
                
            } else {
                text = part.trim();
            }
            if (!text.isEmpty()) {
                if (!result.isEmpty()) {
                    result += " ";
                }
                result += text;
            }
        }

        return result;
    }
}