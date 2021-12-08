package com.luxoft.bankapp.exceptions;

public class OverdraftLimitExceededException extends NotEnoughFundsException{
    private double overdraft;

    public OverdraftLimitExceededException(NotEnoughFundsException e, double overdraft){
        super(e.getMessage(), e.getBalance(), e.getAmount(), e.getId());
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return this.overdraft;
    }
}
