public class NonStaticDemo {
    int num;
    NonStaticDemo(){
        System.out.println("Non static constructor running...");
    }
    public static void main(String[] args) {
        System.out.println("MAIN METHOD RUNNING...");
        NonStaticDemo obj=new NonStaticDemo();
        System.out.println(obj);
    }
    {
        System.out.println("NON STATIC BLOCK RUNNING");
    }
}
