public abstract class Car extends Fahrzeug{


    public Car(int anzahlRaeder, String model, double price) {
        super(anzahlRaeder, model, price);
    }

    @Override
    public void drive() {
        System.out.println("Brumm");
    }

    public abstract double getFinalPrice();


}
