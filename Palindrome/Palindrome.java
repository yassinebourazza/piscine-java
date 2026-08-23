public class Palindrome {
    public static boolean isPalindrome(String s) {
        if(s==null) {return false;}
        String rev = new StringBuilder(s).reverse().toString().toLowerCase();
        return s.toLowerCase().equals(rev) ;
    }
}