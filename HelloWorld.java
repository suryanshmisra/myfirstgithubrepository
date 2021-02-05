public class HelloWorld{
    static HelloWorld obj;
static{
    System.out.println("static block ran");
    HelloWorld.obj=new HelloWorld();
    HelloWorld.method1();
}
static void method1(){
    System.out.println("static method ran");
}
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        HelloWorld.method1();
        System.out.println(HelloWorld.obj);
    }
}