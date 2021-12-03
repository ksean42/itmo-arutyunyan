package com.luxoft.bankapp.domain;

public interface Account {
    void deposit(double x);
    void withdraw(double x);
    public int getId();
    public double getBalance();
    double maximumAmountToWithdraw();
}
