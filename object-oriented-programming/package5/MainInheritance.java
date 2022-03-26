package package5;

public class MainInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name1 = "Parent";
        animal.name2 = "Bintang";
        animal.display();

        Herbivore herbivore = new Herbivore();
        herbivore.name1 = "Herbivore";
        herbivore.name2 = "Kambing";
        herbivore.makanan = "'tumbuhan'";
        herbivore.jenisGigi = "tumpul";
        herbivore.display();

        Carnivore carnivore= new Carnivore();
        carnivore.name1 = "Carnivore";
        carnivore.name2 = "Singa";
        carnivore.makanan = "'daging'";
        carnivore.jenisGigi = "tajam";
        carnivore.display();

        Omnivore omnivore= new Omnivore();
        omnivore.name1 = "Omnivore";
        omnivore.name2 = "Ayam";
        omnivore.makanan = "' semua'";
        omnivore.jenisGigi = "tajam and tumpul";
        omnivore.display();
    }
}
