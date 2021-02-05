package polymorphism;

public class Test {
    public static void main(String[] args) {
        Macbook m=new MacbookPro();
        m.start();
        m.stop();
        Macbook m1=new MacbookAir();
        m1.start();
        m1.stop(); 
    }
    
}
