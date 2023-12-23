package com.designPatterns.singleton;

public class BillPughSingleton {
    private static String name="Melaka";
    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    public static String getName(){
        return name;
    }
}