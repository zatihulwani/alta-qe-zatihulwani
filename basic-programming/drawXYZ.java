public class drawXYZ {
    private static void DrawXYZ(int n) {
        // Problem 3B - drawXYZ
        int height = 0;
//        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < i + n; j++) {

//                System.out.print(k++ + " ");
                if (i % 3 == 0 && j % 3 == 0) {
                    System.out.print("X ");
                }
                else if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("Y ");
                }
                else if (i % 2 == 0 && j % 2 == 0) {
                    System.out.print("Z ");
                } else {
                    System.out.print(" ");

                }
//                System.out.print(i * j + " ");
                System.out.print();
            }
        }
    }


    public static void main(String[] args) {
        DrawXYZ(3);
    }
}
