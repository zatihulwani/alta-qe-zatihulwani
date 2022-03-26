public class Palindrome {
    private static boolean palindrome(String value) {
        // Problem 6A - Palindrome
        int t = value.length();
        int r = 0;

        if(value.charAt(t - 1) == value.charAt(r)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));        // true
        System.out.println(palindrome("katak"));        // true
        System.out.println(palindrome("kasur rusak"));  // true
        System.out.println(palindrome("kupu-kupu"));    // false
        System.out.println(palindrome("lion"));         // false

    }
    }

