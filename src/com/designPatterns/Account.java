package com.designPatterns;

public class Account {
    private float Balance;
    public float getBalance() {
        return Balance;
    }
    public void deposit(float amount){
        if(amount>0)
            Balance+=amount;
    }
    public void withdraw(float amount){
        if (amount>0)
            Balance-=amount;
    }
}
