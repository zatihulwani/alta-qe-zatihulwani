public class Exponentiation {
    private static int pangkat(int a, int b) {
        // Problem 1B - Exponentiation
        if(b == 1)
            return a;
        return a * pangkat(a, b-1);
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2, 3));  // 8
        System.out.println(pangkat(5, 3));  // 125
        System.out.println(pangkat(10, 2)); // 100
        System.out.println(pangkat(2, 5));  // 32
        System.out.println(pangkat(7, 3));  // 343
    }
}
