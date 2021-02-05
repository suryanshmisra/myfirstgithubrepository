package inheritance;

public class Child extends Parent {
    int c,d;
    Child(int a,int b,int c,int d){
        super(a,b);
     this.c=c;
     this.d=d;
    }
    void f1(){
System.out.println("Inside Child");
    }
    void displayDetails(){
        System.out.println("Parent a"+super.a);
        System.out.println("Parent b"+super.b);
        System.out.println("Child C"+this.c);
        System.out.println("Child D"+this.d);
    }
}
