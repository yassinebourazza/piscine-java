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
            if (num1 ==0 && num2 == 0) {return "0";}
            if (num2 == 0) {return "Error";}
            else {res = String.valueOf(num1 % num2);};
        }
        return res;
    }
}
