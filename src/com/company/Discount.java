package com.company;

public class Discount {
    public static double applyDiscount(Customer customer, double price, double discount) {
        double finalPrice;
        double appliedVat;

        appliedVat = appliedVat(customer);
    }
    public static double appliedVat(Customer customer) {
        double appliedVat;
        switch (customer.getType()) {
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
        return appliedVat;
    }
    public static double appliedDiscount (Customer customer, double price) {

        if (price > 50 && customer.isVip()) {
            price = price * 0.5;
        } else if (price > 10 && customer.isSpecial()) {
            price = price * 0.1;
        } else {
            price = price;
        }

        return price;

    }
}
