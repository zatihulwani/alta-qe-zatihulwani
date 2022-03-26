package package3;

public class Perkalian extends HitungKalkulator{
    int num5;
    int num6;

    public Perkalian (int num5, int num6) {
        this.num5 = num5;
        this.num6 = num6;
    }

    @Override
    public int kalkulator() {
        return this.num5 * this.num6;
    }
}
