import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        BufferedWriter file = new BufferedWriter(new FileWriter(fileName));
        file.write(content);
        file.close();
    }
    public static String getContentFile(String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        byte[] buffer = new byte[1024];
        int reader;
        StringBuilder content = new StringBuilder();

        while ((reader = file.read(buffer)) != -1) {
            content.append(new String(buffer, 0, reader));
        }

        file.close();

        return content.toString();

    }
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}