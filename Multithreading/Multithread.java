package Multithreading;

public class Multithread extends Thread {
    public static void main(String[] args) {
        Multithread mt = new Multithread();
        mt.start();
        for (int i = 1; i <= 200; i++) {
            System.out.println("i:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        for (int j = 0; j <= 200; j++) {
            System.out.println("j:" + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
