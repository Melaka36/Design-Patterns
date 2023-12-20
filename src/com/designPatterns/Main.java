package com.designPatterns;

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
//=============== Program 1 ==============
//        User user = new User("Melaka");
////        System.out.println(user.name);
//        user.getName();

// ************** Program 2 *****************
//        TaxCalculator calculator = getCalculator();
//        System.out.println(getCalculator().calculateTax());

//  *************** program 3 ***************
        Account account1=new Account();
        account1.deposit(100);
        account1.withdraw(30);
        System.out.println(account1.getBalance());
    }

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
}
