package Multithreadingyield;

public class YieldDemo extends Thread {
    public static void main(String[] args) {
        YieldDemo t=new YieldDemo();
        t.start();
        for (int i=1;i<=10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
