package com.example;
import java.util.Scanner;

public class Bankoperations {
    private double balance;
    private double amount;
    
    Scanner sc;

    public void getBalance(){
        System.out.println("your balance is :" + balance);
    }
    public void deposit(){
        sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit");
       double  amount = sc.nextDouble();
        balance = balance + amount;
        System.out.println("A deposit of " + amount + "is done");
        getBalance();
    }
  public  void withdraw(){
        sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        amount = sc.nextDouble();
        if (balance <= amount){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance - amount;
            System.out.println(amount + "has been withdrawn from your account");
        }
        getBalance();
    }
    public void exit(){
        System.out.println("Thank you and good bye");
        System.exit(0);
    }
}
