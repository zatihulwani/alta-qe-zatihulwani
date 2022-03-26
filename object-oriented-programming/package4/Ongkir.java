package package4;

public class Ongkir {
    private Paket paket1 = new Paket();
    private int v;
    private int b;

    public Ongkir() {
    }

    public void inputPaket() {
        System.out.println("Input \n");
        paket1.inputPanjang();
        paket1.inputLebar();
        paket1.inputTinggi();
        paket1.inputBerat();
        System.out.println("Output: ");
        v = paket1.hitungVolume();
        b = paket1.hitungBerat();
        System.out.print("Harga: Rp ");
        hitungHarga();
    }

    public void hitungHarga() {
        int harga = 0;
        if (v != 0 && b != 0) {
            if (v <= 50 && b == 1) {
                harga = 5000 * b;
            } else {
                if (v <= 50 && b >= 1) {
                    harga = 5000 * b;
                } else {
                    if (v >= 50 && b >= 1) {
                        harga = 5000 * b;
                    }
                }
            }
            System.out.println(harga + "\n");
        }
    }
}

