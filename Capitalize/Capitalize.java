import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        
        String line;
        int last= 0;

        while ((line = file1.readLine()) != null) {
            String[] words = line.trim().split("\\s+");

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (!word.isEmpty()) {
                    word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                    file2.write(word);

                    if (i < words.length - 1) {
                        file2.write(" ");
                    }
                }
            }
            last++;
            if (last != words.length -1) {
                file2.newLine();
            }
        }

        file1.close();
        file2.close();
        
    }
}