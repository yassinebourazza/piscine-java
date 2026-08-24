import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(args[0]);
        byte[] buffer = new byte[1024];
        int n;
        while ((n = System.in.read(buffer)) != -1) {

            file.write(buffer, 0, n);
        }
    }
}