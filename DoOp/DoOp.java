public class DoOp {
    public static String operate(String[] args) {
        String res = "";
        if (args.length != 3) {
            return "Error";
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        if (args[1].equals("+")) {res = String.valueOf(num1 + num2);}
        else if (args[1].equals("-")) {res = String.valueOf(num1 - num2);}
        else if (args[1].equals("%")) {
            if (num2 == 0) {res = "Error";}
            else {res = String.valueOf(num1 % num2);};
        }
        return res;
    }
}
