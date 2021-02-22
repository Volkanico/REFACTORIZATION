package com.company;

public class Invoice {
    public float totalPrice (float price, float vat, float discount) {

        float appliedvat = (vat * price) / 100;
        System.out.println("Applied vat: " + appliedvat);
        float totalWithVat = price + appliedvat ;
        System.out.println("Total with vat: " + totalWithVat);
        return totalWithVat - discount;
    }
}


