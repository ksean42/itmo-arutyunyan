package com.luxoft.bankapp.domain;

import com.luxoft.bankapp.exceptions.BankException;
import com.luxoft.bankapp.exceptions.NotEnoughFundsException;
import com.luxoft.bankapp.exceptions.OverdraftLimitExceededException;

public class CheckingAccount extends AbstractAccount{

    public CheckingAccount(int id,double balance, double overdraft) throws BankException, OverdraftLimitExceededException {
        super(id,balance, overdraft);
    }

    @Override
    public void withdraw(double amount) throws OverdraftLimitExceededException {
        try {
            super.withdraw(amount);
        }
        catch (NotEnoughFundsException notEnoughFundsException){
            throw new OverdraftLimitExceededException(notEnoughFundsException, this.overdraft);
        }
    }

}
