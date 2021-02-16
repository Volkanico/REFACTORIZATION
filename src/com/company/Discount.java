package com.company;

public class Discount {

    public static  double applyDiscount(Customer customer, double price, double discount) {
        double finalPrice;
        double appliedVat;

        switch (getType()) {
            case Customer.NORMAL:
                appliedVat = 1.21f;
                break;
            case Customer.SPECIAL:
                appliedVat = 1.15f;
                break;
            case Customer.VIP:
                appliedVat = 1.04f;
                break;
            default:
                appliedVat = 1.21f;
                break;
        }
        if (price > 50 && isVip()) {
            finalPrice = price * 0.5;
        } else if (price > 10 && isSpecial()) {
            finalPrice = price * 0.1;
        } else {
            finalPrice = price;
        }

        return finalPrice * appliedVat - discount;
    }
}
