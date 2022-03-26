public class patternProgram {
    public static void main(String[] args) {

        int i, j, k = 1;
        for (i = 1; i <= 5; i++) {
            for (j = i; j < i + 5; j++) {
                System.out.print(k++ + " ");


            }
            System.out.println();
        }
    }
}
