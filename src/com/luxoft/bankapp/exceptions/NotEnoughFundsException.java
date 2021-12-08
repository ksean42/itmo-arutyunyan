package com.luxoft.bankapp.exceptions;

public class NotEnoughFundsException extends BankException{
    public int id;
    public double balance;
    public double amount;

    public NotEnoughFundsException(String message, double balance,double amount, int id){
        super(message);
        this.balance = balance;
        this.amount = amount;
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }
    public double getAmount() {
        return this.amount;
    }
    public int getId() {
        return this.id;
    }
}
