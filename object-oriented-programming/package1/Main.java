package package1;

public class Main {
    public static void main(String[] args) {

        luasKeliling luaskeliling = new luasKeliling();


        Persegi persegi = new Persegi(4);
        Segitiga segitiga = new Segitiga(4,3);
        PersegiPanjang persegipanjang = new PersegiPanjang(7,8);

        luaskeliling.luas();
        luaskeliling.keliling();

        System.out.println("Luas");
        System.out.println("Persegi: " + persegi.luas());
        System.out.println("Segitiga: " + segitiga.luas());
        System.out.println("Persegi Panjang: " + persegipanjang.luas());

        System.out.println();

        System.out.println("Keliling");
        System.out.println("Persegi: " + persegi.keliling());
        System.out.println("Segitiga: " + segitiga.keliling());
        System.out.println("Persegi Panjang: " + persegipanjang.keliling());
    }
}
