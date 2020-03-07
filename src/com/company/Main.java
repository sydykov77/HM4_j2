package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        try {
            for (int i = 1; i <= 5; i++) {
                Runner runner = new Runner("Runner " + i);
                runner.setR(i + 1);
                runner.setR2(0);
                runner.start();
                runner.join();
            }
            for (int i = 5; i > 1; i--) {
                Runner runner = new Runner("Runner " + i);
                runner.setR(i - 1);
                runner.setR2(1);
                runner.start();
                runner.join();
            }
        } catch (Exception z) {
        }
        System.out.println("Runner 1 берет палочку");
    }
}
