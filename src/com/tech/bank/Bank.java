package com.tech.bank;

public class Bank {
    private int balance = 10000;
    private int amount;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

   
    public double deposite() {
        return balance += amount;
    }

    public double withdraw() {
        return balance -= amount;
    }
}
