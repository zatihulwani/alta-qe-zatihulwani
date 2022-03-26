package package3;


    public class Penjumlahan extends HitungKalkulator {
    int num1;
    int num2;

    public Penjumlahan (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int kalkulator() {
        return this.num1 + this.num2;
    }
}

