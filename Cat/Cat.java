import java.io.*;

public class Cat {

    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {return;}
        FileInputStream file = new FileInputStream(args[0]);
        byte[] buffer = new byte[1024];
        int reader;
        while ((reader = file.read(buffer)) != -1) {
            System.out.write(buffer, 0, reader);
        }

    }
}