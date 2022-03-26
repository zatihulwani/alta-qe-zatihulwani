package package2;

public class Kubus extends VolumeBangunRuang{
    int sisi;

    public Kubus (int sisi) {
        this.sisi = sisi;
    }

    @Override
    public int volume() {
        return this.sisi * this.sisi * this.sisi;
    }
}
