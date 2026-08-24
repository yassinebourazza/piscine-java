import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        Arrays.sort(args);
        for (int i = 0; i <args.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            
            System.out.print(args[i]);
        }
        System.out.println();
    }
}