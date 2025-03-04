package com.main.interfaces;

class Some implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class InterThread {
    public static void main(String[] args) {
        Thread newOne = new Thread(new Some());
        Thread newTwo = new Thread(new Some());
        newOne.start();
        newTwo.start();
    }
}
