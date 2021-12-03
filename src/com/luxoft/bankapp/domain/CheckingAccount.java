package com.luxoft.bankapp.domain;

public class CheckingAccount extends AbstractAccount{
    protected double overdraft;

    public CheckingAccount(int id,double balance, double overdraft) {
        super(id,balance, overdraft);
    }



    //    public CheckingAccount (double balance){
//        this.balance = balance;
//    }
}
