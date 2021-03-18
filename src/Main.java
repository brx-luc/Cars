public class Main {

    public static void main(String[] args) {
        damagedCars car = new damagedCars(4, "BMW", 43000, 1);
        System.out.println(car.getFinalPrice());

        UsedCars car2 = new UsedCars(4, "Mercedes Benz", 24000, 54000);
        System.out.println(car2.getFinalPrice());

        Fahrzeug motorrad = new Motorrad(2, "Yamaha", 7000);
        motorrad.drive(); //dynamic binding
        car.drive();
    }

}
