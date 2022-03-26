import java.util.Scanner;

public class ubahHuruf {
    // Problem 5B - Ubah huruf

    public static void main(String[] args) {
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] enc = "KLMNOPQRSTUVWXYZABCDEFGHIJ".toCharArray();

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan kata: ");
        String input = scan.next();

        for(int i = 0; i<input.length(); i++) {
            char temp = input.charAt(i);

            int tempNums = (new String(letters).indexOf(temp));
            System.out.print(new String(enc).charAt(tempNums));
        }
    }
//    private static char[] ubahHuruf(String s) {
//        // Problem 5 - Ubah Huruf
//        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //Just takes the String and puts it into a array of chars
//        char[] enc = "kngcadsxbvfhjtiumylzqropwe".toCharArray();
//
//        for (int i = 0; i < s.length(); i++) {
//            char temp = s.charAt(i);
//
//            int tempNums = (new String(letters).indexOf(temp));
//            System.out.print(new String(enc).charAt(tempNums));
//        }
////            return ubahHuruf;
//        return letters;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(ubahHuruf("SEPULSA OKE"));
//        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
//        System.out.println(ubahHuruf("INDONESIA"));
//        System.out.println(ubahHuruf("GOLANG"));
//        System.out.println(ubahHuruf("PROGRAMMER"));
//    }
}
