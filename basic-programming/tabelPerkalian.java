public class tabelPerkalian {
    private static void cetakTablePerkalian(int n) {
        // Problem 4B - TablePerkalian
        for(int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        cetakTablePerkalian(9);
    }
}
