package com.example;
import java.util.*;

public class Unb implements Banksystem {
    String name;
    String accno;
    String acc_type;
    long balance;

    Unb() {
        this.name = name;
        this.accno = accno;
        this.acc_type = acc_type;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;

    }

    public void withdraw(long amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal : " + balance);
        } else {
            System.out.println("Your balance is less than the " + amount + "transaction failed !!");
        }

    }

    public void deposit(long amount) {
        balance = balance + amount;
    }
    public void showAccount(){
        System.out.println("UNB bank account");
        System.out.println("Account holder name :" + name);
        System.out.println("Account number : " + accno);
        System.out.println("Account type" + acc_type);
        System.out.println("balance" + balance);
    }
    public boolean search(String ac_no){
        if (accno.equals(ac_no)){
            showAccount();
            return (true);
        }
        else{
            return (false);
        }
    }

}
