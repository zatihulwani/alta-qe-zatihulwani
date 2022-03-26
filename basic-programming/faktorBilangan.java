import java.util.Scanner;

public class faktorBilangan {
    public static void main(String[] args) {
 // Problem 3A - Faktor Bilangan
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        int bilangan;
        bilangan = input.nextInt();
        System.out.println("Output: ");
        // process
        for(int i=1; i<=bilangan; i++) {
            if(bilangan%i == 0 ) {
                System.out.println(" " + i);
            }

        }

    }
}
