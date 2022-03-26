package package1;

public class PersegiPanjang extends luasKeliling{
    int panjang;
    int lebar;

    public PersegiPanjang (int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public int luas() {
        return this.panjang * this.lebar;
    }

    @Override
    public int keliling() {
        return ( this.panjang + this.lebar ) * 2;
    }

}
