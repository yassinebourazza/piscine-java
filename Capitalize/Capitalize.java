import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        FileInputStream file1 = new FileInputStream(args[0]);
        FileOutputStream file2 = new FileOutputStream(args[1]);

        byte[] buffer = new byte[1024];
        int index;
        boolean newWord = true;
        
        while ((index = file1.read(buffer)) != -1) {

            for (int i = 0; i < index; i++) {
                if (buffer[i] == ' ') {
                    newWord = true;
                } else if (newWord) {
                    if (buffer[i] >= 'a' && buffer[i] <= 'z') {
                        buffer[i] = (byte) (buffer[i] - 32);
                    }
                    newWord = false;
                }
            }
            file2.write(buffer, 0 , index);
        }

        file1.close();
        file2.close();
    }
}