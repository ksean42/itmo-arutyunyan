package com.luxoft.bankapp.domain;

public class AbstractAccount implements Account{
    protected double balance;
    protected double overdraft;
    private final int id;


    public AbstractAccount(int id,double balance, double overdraft){
        this.balance = balance;
        this.id = id;
        this.overdraft = overdraft;
    }

    public AbstractAccount(int id, double balance) {
        this.balance = balance;
        this.id = id;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount){
        if(amount <= maximumAmountToWithdraw())
            balance -= amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getId(){
        return this.id;
    }

    @Override
    public double maximumAmountToWithdraw() {
        return this.balance + this.overdraft;
    }
}
