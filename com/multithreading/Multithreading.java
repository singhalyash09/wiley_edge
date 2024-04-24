package com.multithreading;

import java.io.File;

class FileDownloader extends Thread{
    void download(){
        System.out.println("Starting Download "+ Thread.currentThread().getName());
        for(int i=1; i<=10; i++){
            System.out.println(Thread.currentThread().getName()+" : "+i*10+"% Download Completed");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\nFile Downloaded Successfully\n\n");
    }

    public void run(){
        download();
    }
}

public class Multithreading {
    public static void main(String[] args) {
        FileDownloader download1 = new FileDownloader();
        FileDownloader download2 = new FileDownloader();
        FileDownloader download3 = new FileDownloader();
        long startTime = System.currentTimeMillis();
        download1.start();
        download2.start();
        download3.start();

        download1.setName("Drishyam");
        download2.setName("3 Idiots");
        download3.setName("Chhichore");

        try {
            download1.join();
            download2.join();
            download3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        long difference = endTime - startTime;
        System.out.println("Time Taken : "+ difference/1000 + " Seconds");

    }
}
