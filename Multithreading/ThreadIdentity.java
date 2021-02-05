package Multithreading;

public class ThreadIdentity extends Thread {
    public static void main(String[] args) {
        ThreadIdentity mt=new ThreadIdentity();
        mt.start();
        Thread currentThread=Thread.currentThread();
        System.out.println("Thread Name is 1"+currentThread.getName());    
    }
    public void run(){
        Thread currentThread=Thread.currentThread();
        System.out.println("Thread Name is"+ currentThread.getName());
    }
}
