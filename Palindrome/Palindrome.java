public class Palindrome {
    public static boolean isPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString().toLowerCase();
        return s.toLowerCase().equals(rev) ;
    }
}