package com.multithreading;

import java.io.File;

class FileDownloader{
    void download(){
        System.out.println("Starting Download");
        for(int i=1; i<=10; i++){
            System.out.println(i*10+"% Download Completed");
        }
        System.out.println("\nFile Downloaded Successfully\n\n");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        FileDownloader download1 = new FileDownloader();
        FileDownloader download2 = new FileDownloader();
        FileDownloader download3 = new FileDownloader();
        download1.download();
        download2.download();
        download3.download();

    }
}
