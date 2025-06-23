package com.example;
import java.util.Scanner;


public class Bankaccount {
    final int acc_no;
    String name;
    double balance = 0;
    double amount;

    Scanner sc = new Scanner(System.in);

    
    
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
    public void deposit(){
        System.out.println("Enter Amount to deposit");
        Double amount = sc.nextDouble();
        balance = balance + amount; 
        System.out.println("your balance" + getBalance()); 
    
    }
    public void withdraw(){
        System.out.println("Enter Amount to withdraw");
        Double amount = sc.nextDouble();
        if(amount <= balance){
            balance =  balance - amount;
        }
        else{
            System.out.println("Insuficient balance, Operation failed");
        }
        System.out.println("your balance " + getBalance());
        
    }
    public void setName(){
        System.out.println("Please Enter New Name");
        String newName = sc.nextLine();
        this.name = newName;
    }



}
