public class Main {

    public static void main(String[] args) {
        damagedCars car = new damagedCars(4, "BMW", 43000, 1);
        System.out.println(car.getFinalPrice());

        UsedCars car2 = new UsedCars(4, "Mercedes Benz", 24000, 54000);
        System.out.println(car2.getFinalPrice());

        UsedCars car3 = new UsedCars(4, "Bentley", 4000000, 660000);
        System.out.println(car3.getFinalPrice());

        damagedCars car4 = new damagedCars(4, "Mercedes Benz", 78000, 2);
        System.out.println(car4.getFinalPrice());


        Fahrzeug motorrad = new Motorrad(2, "Yamaha", 7000);
        motorrad.drive(); //dynamic binding
        car.drive(); //3
    }

}
