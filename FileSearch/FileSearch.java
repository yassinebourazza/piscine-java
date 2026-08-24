import java.io.File;

public class FileSearch {

    public static String searchFile(String fileName) {
        File documents = new File("documents");
        return s(documents, fileName);
    }

    public static String s(File folder, String fileName) {
        File[] files = folder.listFiles();

        if (files == null) {
            return "";
        }

        for (File file : files) {

            if (file.isFile() && file.getName().equals(fileName)) {
                return file.getPath();
            }

            if (file.isDirectory()) {
                String result = s(file, fileName);

                if (!result.equals("")) {
                    return result;
                }
            }
        }

        return null;
    }
}