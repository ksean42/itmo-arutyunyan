package com.luxoft.bankapp.domain;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;
import com.luxoft.bankapp.exceptions.OverdraftLimitExceededException;

public class AbstractAccount implements Account{
    protected double balance;
    protected double overdraft;
    private final int id;


    public AbstractAccount(int id,double balance, double overdraft)  {
        this.balance = balance;
        this.id = id;
        if(overdraft < 0) {
            throw new IllegalArgumentException("Overdraft can't be negative");
        }
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
    public void withdraw(double amount) throws NotEnoughFundsException {
        if (amount < 0)
            throw new IllegalArgumentException("Withdraw can't be negative");
        if(amount > maximumAmountToWithdraw()){
            throw new NotEnoughFundsException("Not enough funds!", this.balance, amount, this.id);
        }
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
