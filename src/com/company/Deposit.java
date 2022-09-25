package com.company;


public class Deposit extends Thread{
    Account account;

    public Deposit (Account account){
        this.account = account;
    }

    public void run() {
        try {
            account.toDeposit();
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
