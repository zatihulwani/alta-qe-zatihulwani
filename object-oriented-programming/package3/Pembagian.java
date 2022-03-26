package package3;

public class Pembagian extends HitungKalkulator{
    int num7;
    int num8;

    public Pembagian (int num7, int num8) {
        this.num7 = num7;
        this.num8 = num8;
    }

    @Override
    public int kalkulator() {
        return this.num7 / this.num8;
    }
}
