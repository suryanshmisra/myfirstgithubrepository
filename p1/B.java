package p1;

public class B {
    public static void main(String[] args) {
        A.a1();
        A obj=new A();
        System.out.println(obj.a);
        System.out.println(obj.c);
        obj.a2();
    }
}
