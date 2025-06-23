package com.example;

import java.util.ArrayList;

public class Bankaccount {
    final int acc_no;
    String name;
    double balance = 0;
    double amount;
    
    public Bankaccount(int acc_no, String name, double balance){
        this.acc_no = acc_no;
        this.name = name;
        this.balance = balance;
    }
    public void getAccountDetails(){
        System.out.println("Account Number :  " + acc_no + "    Name :  " +  name + "    Balance :  " +balance);
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public void deposit(double amount){
        balance = balance + amount; 
        System.out.println("your balance" + getBalance()); 
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance =  balance - amount;
        }
        else{
            System.out.println("Insuficient balance, Operation failed");
        }
        System.out.println("your balance " + getBalance());
        
    }
    public void setName(String newName){
        this.name = newName;
    }



}
