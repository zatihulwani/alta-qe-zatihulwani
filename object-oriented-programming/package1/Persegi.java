package package1;

public class Persegi extends luasKeliling{
    int sisi;

    public Persegi (int sisi) {
        this.sisi = sisi;
    }

    @Override
    public int luas() {
        return this.sisi * this.sisi;
    }

    @Override
    public int keliling() {
        return this.sisi * 4;
    }

}
