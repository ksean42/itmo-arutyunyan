package com.luxoft.bankapp.domain;

public class SavingAccount extends AbstractAccount {
    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public double maximumAmountToWithdraw(){
        return getBalance();
    }
}
