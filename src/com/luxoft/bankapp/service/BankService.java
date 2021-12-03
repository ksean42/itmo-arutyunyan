package com.luxoft.bankapp.service;

import com.luxoft.bankapp.domain.Bank;
import com.luxoft.bankapp.domain.Client;

public class BankService {
    public static void addClient(Bank bank, Client client){
        bank.addClient(client);
    }
    public static void printMaximumAmountToWithdraw(Bank bank){
//        for(Client element: bank.getClients()) {
//            for(accounts element: clients.getAccounts()){
//
//            }
//        }
    }
}
