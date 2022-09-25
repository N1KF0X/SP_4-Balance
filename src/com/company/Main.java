package com.company;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        Deposit deposit = new Deposit(account);
        Withdraw withdraw = new Withdraw(account);
        new Thread(withdraw).start();
        new Thread(deposit).start();
    }
}
