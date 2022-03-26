import java.util.Scanner;

public class faktorBilanganII {
    public static void main(String[] args) {
        // Problem 4A - Faktor Bilangan II

        Scanner input = new Scanner(System.in);
        System.out.println("Input : ");
        int bilangan;
        bilangan = input.nextInt();
        System.out.println("Output : ");
        for (int i = bilangan; i >= 1; i--) {
            if (bilangan % i == 0) {
                System.out.println( i + " ");
            }
            }
        }
    }



