package com.company;

public class Runner extends Thread {public Runner(String name) {
    super(name);
}

    private int r;
    private int r2;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }


    public void run() {
        try {
            if (getR2() == 0) {
                if (getR() == 6) {
                    System.out.println(this.getName() + " Берет палочкку.");
                    System.out.println(this.getName() + " Бежит к финишу.");
                } else {
                    System.out.println(this.getName() + " Берет палочкку.");
                    System.out.println(this.getName() + " Бежит к Runner " + getR());
                }
            } else {
                if (getR() != 4) {
                    System.out.println(this.getName() + " Берет палочкку.");
                    System.out.println(this.getName() + " Бежит к Runner  " + getR());
                } else {
                    System.out.println(this.getName() + " Бежит к Runner " + getR());
                }
            }
            sleep(100);
        } catch (InterruptedException beg) {

        }
    }
}