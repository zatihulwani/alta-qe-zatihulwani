package package3;

public class Pengurangan extends HitungKalkulator {
    int num3;
    int num4;

    public Pengurangan (int num3, int num4) {
        this.num3 = num3;
        this.num4 = num4;
    }

    @Override
    public int kalkulator() {
        return this.num3 - this.num4;
    }
}
