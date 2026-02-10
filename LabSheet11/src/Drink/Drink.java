package Drink;

abstract class Drink implements Priceable{
    private String drinkName;
    private double basePrice;
    private String size;

    public Drink(String drinkName, double basePrice, String size){
        this.drinkName = drinkName;
        this.basePrice = basePrice;
        this.size = size;
    }

    public String getDrinkName() {
        return drinkName;
    }

    abstract double calculateFinalPrice();

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getSizeExtra() {
        if(size.equalsIgnoreCase("S")) {
            return 0;
        } else if (size.equalsIgnoreCase("M")) {
            return 10;
        } else if (size.equalsIgnoreCase("L")) {
            return 15;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Your order: " + getDrinkName() + " (Size: " + size + ")";
    }
}