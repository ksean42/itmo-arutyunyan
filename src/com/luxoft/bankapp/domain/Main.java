package com.luxoft.bankapp.domain;
import com.luxoft.bankapp.service.BankService;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
                Bank bank = new Bank();
        BankService bankService = new BankService();
        Client client = new Client("Yuri", Gender.MALE);
        client.accounts = new ArrayList<>();
        CheckingAccount account1 = new CheckingAccount(1,300, 100);
        SavingAccount account2 = new SavingAccount(1,300);
        client.addAccount(account1, account2);
        bank.clients = new ArrayList<>();
        BankService.addClient(bank, client);
        printBalance(account1.getBalance());
    }
    public static void    printBalance(double balance){
        System.out.printf("%f\n", balance);
    }
    void modifyBank(Client client){
    }
}

