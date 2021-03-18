public class damagedCars extends Car{

    private int damageLevel;

    public damagedCars(int anzahlRaeder, String model, double price, int damageLevel) {
        super(anzahlRaeder, model, price);
        this.damageLevel = damageLevel;
    }

    @Override
    public double getFinalPrice() {
        double p = getPrice();
        switch (damageLevel){
            case 0: p -= p * 0.1;
                break;
            case 1: p -= p * 0.5;
                break;
            case 2: p -= p * 0.9;
                break;
            case 3: p = 0;
        }
        return p;
    }

    public int getDamageLevel(){
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel){
        this.damageLevel = damageLevel;
    }

}
