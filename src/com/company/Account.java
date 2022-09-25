package com.company;

import java.io.IOException;

public class Account{
    int balance = 0;
    int withdraw = 0;

    public synchronized void toDeposit() throws InterruptedException {
        while (balance >= withdraw){
            wait();
        }
        for (int i = 0; i < withdraw; i+=100) {
            balance += 100;
        }
        System.out.println("Внесено: " + withdraw);
        System.out.println("Баланс: " + balance);
        notify();
    }

    public synchronized void toWithdraw(int sum) throws InterruptedException {
        this.withdraw = sum;
        while (balance < sum){
            wait();
        }
        for (int i = sum; i > 0; i-=100) {
            balance -= 100;
        }
        System.out.println("Списано: " + sum);
        System.out.println("Баланс: " + balance);
        notify();
    }
}
