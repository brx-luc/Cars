public class Fahrzeug {

    private int anzahlRaeder;
    private String model;
    private double price;

    public Fahrzeug(int anzahlRaeder, String model, double price){
        this.anzahlRaeder = anzahlRaeder;
        this.model = model;
        this.price = price;
    }


    public void drive(){
        System.out.println("brumm brumm");
    }

    public int getAnzahlRaeder() {
        return anzahlRaeder;
    }

    public String getModel() {
        return model;
    }

    public double getPrice(){
        return price;
    }
}
