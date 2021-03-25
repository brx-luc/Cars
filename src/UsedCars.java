public class UsedCars extends Car{

    private int mileage;

    public UsedCars(int anzahlRaeder, String model, double price, int mileage) {
        super(anzahlRaeder, model, price);
        this.mileage = mileage;
    }

    @Override
    public double getFinalPrice() {
        double p = getPrice();

        double ergebnis = (double)mileage / 10000;

        p -= p*(ergebnis * 0.05);

        return p;
    }

}
