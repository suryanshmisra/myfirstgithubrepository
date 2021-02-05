package Multithreading;

public class Runninginterface implements Runnable{
    public void run(){
        System.out.println("Processed the checks");
    }
    public static void main(String[] args) {
        Runninginterface rn=new Runninginterface();
        Thread t=new Thread(rn);
        t.start();
    }
}
