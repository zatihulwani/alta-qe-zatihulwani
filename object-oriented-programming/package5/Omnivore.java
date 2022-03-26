package package5;

public class Omnivore extends Animal{
    String makanan;
    String jenisGigi;

    @Override
    void display() {
        System.out.println("Hi I'm " + this.name1 +
                ", My name is " + this.name2 +
                ", My Food is " + this.makanan +
                ", I have " + this.jenisGigi + " teeth");
    }
}
