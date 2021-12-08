package com.luxoft.bankapp.exceptions;

import com.luxoft.bankapp.domain.Client;

public class ClientExistsEsception extends BankException{
    public ClientExistsEsception(String message){
        super(message);
    }
}
