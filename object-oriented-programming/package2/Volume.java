package package2;

public class Volume {
    public static void main(String[] args) {

        VolumeBangunRuang volumeBangunRuang = new VolumeBangunRuang();

        Kubus kubus = new Kubus(10);
        Balok balok = new Balok(3,6,10);
        Tabung tabung = new Tabung(7,10);

        volumeBangunRuang.volume();

        System.out.println("Volume");
        System.out.println("Kubus: " + kubus.volume());
        System.out.println("Balok: " + balok.volume());
        System.out.println("Tabung: " + tabung.volume());
    }
}
