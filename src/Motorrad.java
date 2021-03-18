public class Motorrad extends Fahrzeug{

    public Motorrad(int anzahlRaeder, String model, double price) {
        super(anzahlRaeder, model, price);
    }

    @Override
    public void drive() {
        System.out.println("Vroom vroom");
    }
}
