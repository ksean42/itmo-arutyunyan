package com.luxoft.bankapp.domain;
import java.util.List;



public class Client {
    String name;
    Gender gender;
    List<Account> accounts;

    void addAccount(CheckingAccount CheckingAccount, SavingAccount SavingAccount) {
        this.accounts.add(CheckingAccount);
        this.accounts.add(SavingAccount);
    }
    public Client(String name, Gender gender){
        this.name = name;
        this.gender = gender;
        getClientGreeting();
    }
    private void getClientGreeting(){
        String appeal = this.gender == Gender.MALE ? "Mr." : "Ms.";
        System.out.printf("Hey there, %s%s!\n", appeal, this.name);
    }
    List<Account> getAccounts() {
        return null;
    }
}
