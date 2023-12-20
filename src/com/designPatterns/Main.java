package com.designPatterns;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
//=============== Program 1 ==============
//        User user = new User("Melaka");
////        System.out.println(user.name);
//        user.getName();

// ************** Program 2 *****************
        TaxCalculator calculator = getCalculator();
        System.out.println(getCalculator().calculateTax());

    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
