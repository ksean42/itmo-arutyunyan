package com.luxoft.bankapp.domain;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;


public interface Account {
    void deposit(double x);
    void withdraw(double x) throws NotEnoughFundsException;
    public int getId();
    public double getBalance();
    double maximumAmountToWithdraw();
}
