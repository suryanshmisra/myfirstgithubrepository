package Multithreading;

public class ThreadPriority extends Thread{
    public static void main(String[] args) {
        ThreadPriority mt=new ThreadPriority();
    mt.setPriority(MAX_PRIORITY);
    mt.setName("mt");
    mt.start();
    ThreadPriority mt1=new ThreadPriority();
    mt1.setPriority(MIN_PRIORITY);
    mt1.setName("mt1");
    mt1.start();
}
public void run(){
    System.out.println("Thread Name:"+Thread.currentThread().getName());
}
    }
    
