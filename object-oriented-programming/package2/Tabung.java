package package2;

public class Tabung extends VolumeBangunRuang{
    int r;
    int tinggi;

    public Tabung (int r, int tinggi) {
        this.r = r;
        this.tinggi = tinggi;
    }

    @Override
    public int volume() {
        return (int) (Math.PI * this.r * this.r) * this.tinggi;
    }
}
