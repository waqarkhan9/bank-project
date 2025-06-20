package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateAccount {
    public  Bankaccount createAccount(int acc_no, String name) {
        Bankaccount newAccount = new Bankaccount(acc_no, name);
        return newAccount;
    }
    
  
    public static void main(String[] args) {
        ArrayList<Bankaccount> customers = new ArrayList<Bankaccount>();

        CreateAccount ca = new CreateAccount();
        Bankaccount ba = ca.createAccount(1, "Waqar");
        Bankaccount bb = ca.createAccount(1, "Waqar");
        Bankaccount bc = ca.createAccount(1, "Waqar");

       // ba.getDetails();
       // bb.getDetails();
       // bc.getDetails();

        customers.add(ba);
        customers.add(bb);
        customers.add(bc);
        for (int i =0; i < customers.size(); i++){
            customers.get(i).getAccountDetails();
        }









       

        
    }

}
