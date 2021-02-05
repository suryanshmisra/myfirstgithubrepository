package Multithreading;

import java.util.Scanner;

public class Join extends Thread {
    static int n, sum = 0;

    public static void main(String[] args) {
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        Join.n = sc.nextInt();
        sc.close();
        Join jd = new Join();
        jd.start();
        try {
            jd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sum1"+sum);
    }

    public void run() {
        for (int i = 1; i <= Join.n; i++) {
            Join.sum = i + Join.sum;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("sum"+sum);
    }
    
}
