package package4;

import java.util.Scanner;

public class Paket {
    private int panjang, lebar, tinggi, berat;

    private Scanner input = new Scanner(System.in);

    public Paket() {
        this.panjang = 1;
        this.lebar = 1;
        this.tinggi = 1;
        this.berat = 1;
    }

    public Paket(int panjang, int lebar, int tinggi, int berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void inputPanjang() {
        System.out.print("Panjang: ");
        panjang = (int) input.nextDouble();
    }

    public void inputLebar() {
        System.out.print("Lebar: ");
        lebar = (int) input.nextDouble();
    }

    public void inputTinggi() {
        System.out.print("Tinggi: ");
        tinggi = (int) input.nextDouble();
    }

    public void inputBerat() {
        System.out.print("Berat: ");
        berat = (int) input.nextDouble();
        System.out.print("\n");
    }

    public int hitungVolume() {
        int volume = (int) (panjang * lebar * tinggi);
        return volume;
    }

    public int hitungBerat() {
        int Berat = (int) (berat);
        return Berat;
    }
}
