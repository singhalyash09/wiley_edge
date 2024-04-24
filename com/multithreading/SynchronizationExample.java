package com.multithreading;

import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;

class BankAccount{
    private double balance;
    //Lock lock = new ReentrantLock();

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        //lock.lock();
        System.out.println("Depositing ₹"+amount+ " into your account");
            synchronized (this) {
                double newBalance = balance + amount;
                balance = newBalance;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Balance After Depositing : " + balance);
            }
            //lock.unlock();
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double depositAmount;

    public DepositThread(BankAccount account ,double depositAmount){
        this.account = account;
        this.depositAmount = depositAmount;
    }

    public void run() {
        account.deposit(depositAmount);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        DepositThread thread1 = new DepositThread(account, 5000);
        DepositThread thread2 = new DepositThread(account, 2000);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Final Balance : "+account.getBalance());


    }
}
