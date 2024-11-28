/*
 * Open/Closed (Abierto/Cerrado)
 * 
 * Las clases, módulos o funciones deben estar abiertas para su extensión, pero cerradas para su modificación. 
 * O de otra forma, se debería poder extender el comportamiento de una clase, sin modificarla.
 */

// MAL
public static double calculateDiscount(String customerType, double amount) {
    if (customerType.equals("Regular")) {
        return amount * 0.1;
    } else if (customerType.equals("Premium")) {
        return amount * 0.2;
    } else if (customerType.equals("Disel")) {
        return amount * 0.2;
    }
    return 0;
}

public static void main(String[] args) {
    double regularDiscount = calculateDiscount("Regular", 100);
    double premiumDiscount = calculateDiscount("Premium", 100);
    double premiumDiscount = calculateDiscount("Disel", 100);

    System.out.println("Regular Discount: " + regularDiscount);
    System.out.println("Premium Discount: " + premiumDiscount);
}

// BIEN
abstract class Discount {

    public abstract double calculate(double amount);
}

class RegularDiscount extends Discount {

    public double calculate(double amount) {
        return amount * 0.1;
    }
}

class PremiumDiscount extends Discount {

    public double calculate(double amount) {
        return amount * 0.2;
    }
}

class DiselDiscount extends Discount {

    public double calculate(double amount) {
        return amount * 0.5;
    }
}

class DiscountCalculator {

    public double calculateDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}

public static void main(String[] args) {
    Discount regularDiscount = new RegularDiscount();
    Discount premiumDiscount = new PremiumDiscount();
    Discount diselDiscount = new DiselDiscount();

    DiscountCalculator calculator = new DiscountCalculator();

    double regularDiscountAmount = calculator.calculateDiscount(regularDiscount, 100);
    double premiumDiscountAmount = calculator.calculateDiscount(premiumDiscount, 100);
    double diselDiscountAmount = calculator.calculateDiscount(diselDiscount, 100);

    System.out.println("Regular Discount: " + regularDiscountAmount);
    System.out.println("Premium Discount: " + premiumDiscountAmount);
}