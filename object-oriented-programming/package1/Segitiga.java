package package1;

public class Segitiga extends luasKeliling {

    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public int luas() {
        return (this.alas * this.tinggi) / 2;
    }
    @Override
    public int keliling() {
        return this.alas * 3;
    }
}
