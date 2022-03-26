public class ubahHuruff {
    private static String ubahHuruff(String s) {
        char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] enc = "KLMNOPQRSTUVWXYZABCDEFGHIJ".toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int tempNums = (new String(letters).indexOf(temp));
            System.out.print(new String(enc).charAt(tempNums));


        }
        return new String();
    }
        public static void main(String[] args) {
            System.out.println(ubahHuruff("SEPULSAOKE"));
            System.out.println(ubahHuruff("ALTERRA"));
            System.out.println(ubahHuruff("INDONESIA"));
            System.out.println(ubahHuruff("GOLANG"));
            System.out.println(ubahHuruff("PROGRAMMER"));
    }
    }

