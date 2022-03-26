package package3;

public class Mainkalkulator {
    public static void main(String[] args) {
        HitungKalkulator hitungKalkulator = new HitungKalkulator();

        Penjumlahan penjumlahan = new Penjumlahan(3 , 4);
        Pengurangan pengurangan = new Pengurangan(15,4);
        Perkalian perkalian = new Perkalian(10,10);
        Pembagian pembagian = new Pembagian(12,3);

        hitungKalkulator.kalkulator();

        System.out.println("Output");
        System.out.println("Penjumlahan: " + penjumlahan.kalkulator());
        System.out.println("Pengurangan: " + pengurangan.kalkulator());
        System.out.println("Perkalian: " + perkalian.kalkulator());
        System.out.println("Pembagian: " + pembagian.kalkulator());
    }
}
