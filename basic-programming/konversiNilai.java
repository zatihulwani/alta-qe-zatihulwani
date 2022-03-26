
public class konversiNilai {
    public static void main(String[] args) {
        //Problem 2A - Konversi Nilai
        // input
        int studentScore = 65;

        // Process
        if (studentScore >= 80 && studentScore <= 100) {
            System.out.println("A");
        } else if (studentScore >= 65 && studentScore <= 79) {
            System.out.println("B+");
        } else if(studentScore >= 50 && studentScore <=64) {
            System.out.println("B");
        } else if(studentScore >= 35 && studentScore <=49) {
            System.out.println("C");
        } else if(studentScore >= 0 && studentScore <= 34) {
            System.out.println("D");
        } else {
            System.out.println("Invalid");
        }
    }
}
