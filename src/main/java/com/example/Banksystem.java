package com.example;

public interface Banksystem {
    
    long getBalance();
    void deposit(long amount);
    void withdraw(long amount);
    void showAccount();
}
