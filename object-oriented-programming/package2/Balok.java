package package2;

public class Balok extends VolumeBangunRuang {
    int panjang;
    int lebar;
    int tinggi;

    public Balok (int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public int volume() {
        return this.panjang * this.lebar * this.tinggi;
    }
}
