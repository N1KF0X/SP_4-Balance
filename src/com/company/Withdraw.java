package com.company;

import java.util.Scanner;

public class Withdraw extends Thread{
    Scanner scanner = new Scanner(System.in);
    Account account;
    int sum;

    public Withdraw (Account account){
        this.account = account;
        this.sum = scanner.nextInt();
    }

    public void run() {
        try {
            account.toWithdraw(sum);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
