package com.luxoft.bankapp.domain;

import java.util.List;

public class Bank {
    List <Client> clients;
    public void addClient(Client client){
        this.clients.add(client);
    }
    public List <Client> getClients(){
        return clients;
    }
}