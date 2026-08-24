import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(args[1]));
        
        //String line;
        //int last= 0;

        int c;
        boolean newWord = true;
        boolean started = false;

        while ((c = file1.read()) != -1) {
            if (c == ' ') {
                if (started) {file2.write(c);}
                
                newWord = true;
                started = false;
            } else {
                if (newWord) {
                    c = Character.toUpperCase((char) c);
                    newWord = false;
                    started = true;
                }

                file2.write(c);
            }
        }

        file1.close();
        file2.close();
        
    }
}